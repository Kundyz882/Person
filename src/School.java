import java.util.List;
import java.util.ArrayList;

public class School {

    List<Person> members = new ArrayList<>();

    public void addMember(Person person) {
        members.add(person);
    }

    public void displayMembers() {
        for (Person member : members) {
            System.out.println(member.toString());
        }
    }
}

