package com.pluckerpluck.votesim.election.system.range;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.pluckerpluck.votesim.election.Ballot;
import com.pluckerpluck.votesim.election.Candidate;
import com.pluckerpluck.votesim.election.Election;

/**
 * IRV
 */
public class RangeElection extends Election {

    public RangeElection (Set<Candidate> candidates) {
        super(candidates);
    }

    public Candidate getWinner()  {
        Map<Candidate, Long> scores = new HashMap<>();
        for (Candidate candidate : candidates) {
            scores.put(candidate, 0L);
        }

        for (Ballot ballot : ballots.values()) {
            for (Candidate candidate : ballot.getResult().keySet()) {
                long currentScore = scores.get(candidate);
                scores.put(candidate, currentScore + ballot.getResult().get(candidate));
            }
        }

        long maxScore = 0;
        Candidate winner = null;
        for (Entry<Candidate, Long> entry : scores.entrySet()) {
            if (entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                winner = entry.getKey();
            }
        }

        return winner;
    }
}