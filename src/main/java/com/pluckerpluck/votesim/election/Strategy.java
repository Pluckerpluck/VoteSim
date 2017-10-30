package com.pluckerpluck.votesim.election;

import java.util.Map;

/**
 * Strategy
 */
public abstract class Strategy {

    public abstract Ballot vote(Map<Candidate, Double> utility);

}