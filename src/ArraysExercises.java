import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];

        people[0] = new Person("Jamo");
        people[1] = new Person("Owen");
        people[2] = new Person("Jakob");

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }

        people = addPerson(people, new Person("Jace"));

        for (Person person : people) {
            System.out.println(" " + person.getName());
        }

    }

    private static Person[] addPerson(Person[] people, Person person) {
        Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);

        newPeopleArray[newPeopleArray.length - 1] = person;
        return newPeopleArray;

    }
}
