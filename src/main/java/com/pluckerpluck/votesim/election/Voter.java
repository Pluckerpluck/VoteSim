package com.pluckerpluck.votesim.election;

import java.util.Map;

/**
 * Voter
 */
public class Voter {
    private final Map<Candidate, Double> utility;

    public Voter (Map<Candidate, Double> utility) {
        this.utility = utility;
    }

    public Ballot vote(Strategy strategy) {
        return strategy.vote(utility);
    }

    public double calculateRegret(Candidate winner) {
        return 0;
    }

}