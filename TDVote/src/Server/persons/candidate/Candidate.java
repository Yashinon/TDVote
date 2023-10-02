package Server.persons.candidate;

import Server.persons.Person;

import java.util.Objects;
import java.util.Optional;

public class Candidate extends Person {

    private int nbVotes;
    private int rank; // rank works like an id
    private Optional<String> pitch;

    public Candidate(int rank,String firstName, String lastName, String pitch) {
        super(firstName, lastName);
        this.rank = rank;
        this.nbVotes = 0;
        if (pitch != null) {
            this.pitch = Optional.of(pitch);
        } else {
            this.pitch = Optional.empty();
        }
    }

    public Candidate(int rank,String firstName, String lastName) {
        this(rank,firstName, lastName, null);
    }

    public int getRank() {return rank;}
    public Optional<String> getPitch() {return pitch;}

    public int getNumberOfVotes() {
        return nbVotes;
    }

    public void incrementNumberOfVote() {
        this.nbVotes++;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Server.persons.candidate.Candidate)) {
            return false;
        }

        Server.persons.candidate.Candidate candidate = (Server.persons.candidate.Candidate) o;

        return Objects.equals(firstName, candidate.firstName) &&
                Objects.equals(lastName, candidate.lastName) &&
                Objects.equals(nbVotes, candidate.nbVotes);
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + nbVotes;
        return result;
    }
}

