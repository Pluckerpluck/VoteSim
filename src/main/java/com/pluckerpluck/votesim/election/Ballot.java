package com.pluckerpluck.votesim.election;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is used to record the votes of voters.
 * It is generic enough to allow most simple voting methods.
 */
public class Ballot {
    private final Map<Candidate, Integer> vote;

    public Ballot() {
        this.vote = new HashMap<>();
    }

    public Ballot(Map<Candidate, Integer> ballot) {
        this.vote = ballot;
    }

    public void addVote(Candidate candidate, int value) {
        vote.put(candidate, value);
    }

    public Map<Candidate, Integer> getResult()  {
        return vote;
    }
}