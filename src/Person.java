import java.util.List;

public class Person {

    private String name;
    private int age;
    private List<Hobby> hobbies;

    public Person(){

    }

    public Person(String name, int age, List<Hobby> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", age: " + age;
    }
}
