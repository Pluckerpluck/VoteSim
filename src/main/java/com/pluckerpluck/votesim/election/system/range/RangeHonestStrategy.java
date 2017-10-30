package com.pluckerpluck.votesim.election.system.range;

import java.util.Map;
import com.pluckerpluck.votesim.election.Ballot;
import com.pluckerpluck.votesim.election.Candidate;
import com.pluckerpluck.votesim.election.Strategy;

/**
 * IRVHonest
 */
public class RangeHonestStrategy extends Strategy {

    public Ballot vote(Map<Candidate, Double> utility) {
        Ballot ballot = new Ballot();
        for(Candidate candidate : utility.keySet()) {
            double value = utility.get(candidate);
            ballot.addVote(candidate, (int)Math.round((value + 1) * 5));
        }
        return ballot;
    }
}