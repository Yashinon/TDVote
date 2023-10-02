package Client.persons;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {

    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Person)) {
                return false;
            }

            Person person = (Person) o;

            return Objects.equals(firstName, person.firstName) &&
                    Objects.equals(lastName, person.lastName);
        }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        return 31 * result + (lastName != null ? lastName.hashCode() : 0);
    }
}
