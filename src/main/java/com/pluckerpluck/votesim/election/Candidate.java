package com.pluckerpluck.votesim.election;

/**
 * Candidate
 */
public class Candidate {
    private final String name;

    public Candidate (String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Candidate)) {
            return false;
        }

        return this.name.equals(((Candidate)o).name);
    }

    @Override
    public String toString() {
        return name.toString();
    }
}