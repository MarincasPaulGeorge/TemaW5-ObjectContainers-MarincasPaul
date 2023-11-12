import java.util.*;

public class Main {
    public static void main(String[] args) {


        Address address1 = new Address("T. Vladimirescu nr. 8", "Cluj", "Romania");
        Hobby hobby1 = new Hobby("Golf", 2, List.of(address1));

//Person[] people = {new Unemployed("Paul", 24)};
//for (Person person : people){
//    System.out.println("Name: " + person.getName()+ ", age:" + person.getAge());
//}

//        Person person = new Person("Paul", 24);
//        System.out.println(person.toString());

        NameComparator nameComparator = new NameComparator();
        Set<Person> personSet = new TreeSet<>(nameComparator);
        Map<String, Person> personMap = new HashMap<>();
        Person person1 = new Person("Paul Marincas", 24, List.of(hobby1));
        Person person2 = new Person("Ferencz Peter", 29, List.of(hobby1));
        Person person3 = new Person("Andrei Nistor", 26, List.of(hobby1));
//        personSet.add(new Person("Paul Marincas", 24));
//        personSet.add(new Person("Ferencz Peter", 29));
//        personSet.add(new Person("Andrei Nistor", 26));

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);




        //for TreeSet
        for (Person person : personSet) {
            System.out.println(person);
        }
        //for HashMap
        personMap.put(person1.getName(), person1);

        System.out.println("For:");
        for (Hobby hobby : person1.getHobbies()) {
            System.out.println(person1.getName() + ": " +
                    " hobby: " + hobby.getName() +
                    ", Frequency per week: " + hobby.getFrequency() +
                    ", Addresses: " + hobby.getAddresses());
        }

    }
}