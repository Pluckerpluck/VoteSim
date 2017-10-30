package com.pluckerpluck.votesim.election;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Election
 */
public abstract class Election {
    protected Map<Voter, Ballot> ballots = new HashMap<>();
    protected final Set<Candidate> candidates;

    public Election (Set<Candidate> candidates) {
        this.candidates = candidates;
    }

    public void vote(Voter voter, Ballot ballot) {
        ballots.put(voter, ballot);
    }

    public abstract Candidate getWinner();
}