package com.pluckerpluck.votesim.election;

import java.util.Set;

/**
 * System
 */
public abstract class System {

    public abstract Candidate getWinner(Set<Candidate> candidates, Set<Ballot> ballots);
}