package Client.persons.user;

import Client.persons.Person;

public class User extends Person {

        private int studentId = 0;
        private String password = null;
        public User(String firstName, String lastName, int studentId, String password) {
            super(firstName, lastName);
            this.studentId = studentId;
            this.password = password;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof User)) {
                return false;
            }

            User user = (User) o;

            return firstName.equals(user.firstName) &&
                    lastName.equals(user.lastName);
        }

        @Override
        public int hashCode() {
            int result = firstName.hashCode();
            result = 31 * result + lastName.hashCode();
            return result;
        }


}
