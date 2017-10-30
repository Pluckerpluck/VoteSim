package com.pluckerpluck.votesim.election;

/**
 * Candidate
 */
public final class Candidate {
    private final String name;

    public Candidate (String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        // Quick check first (as likely in this codebase)
        if (this == o) {
            return true;
        }

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