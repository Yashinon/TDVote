package Client.persons.candidate;

import Client.persons.Person;

import java.util.Objects;

    public class Candidate extends Person {

        private int nbVotes;

        public Candidate(String firstName, String lastName, String pitch) {
            super(firstName, lastName);
            this.nbVotes = 0;
        }

        public int getNumberOfVotes() {
            return nbVotes;
        }

        public void incrementNumberOfVote() {
            this.nbVotes++;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Candidate)) {
                return false;
            }

            Candidate candidate = (Candidate) o;

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
