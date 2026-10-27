import java.util.*;

public class Allotwithclass {

    static class Student {
        String name;
        String Gender;
        Integer Room;

        Student(String name, String Gender) {
            this.name = name;
            this.Gender = Gender;
            this.Room = null;
        }
    }

    public static void main(String[] args) {

        Student[] studentArray = {
            new Student("Ram", "Male"),
            new Student("Rakesh", "Male"),
            new Student("Rahul", "Male"),
            new Student("Om", "Male"),
            new Student("Ritik", "Male"),
            new Student("Amit", "Male"),
            new Student("Jay", "Male"),
            new Student("Aditya", "Male"),
            new Student("Anirudh", "Male"),
            new Student("Vikas", "Male"),

            new Student("Jyoti", "Female"),
            new Student("Rubi", "Female"),
            new Student("Nikita", "Female"),
            new Student("Bimla", "Female"),
            new Student("Sheema", "Female"),
            new Student("Saraswati", "Female"),
            new Student("Akansha", "Female"),
            new Student("Divya", "Female"),
            new Student("Anuradha", "Female"),
            new Student("Anushiya", "Female"),
            new Student("Ridhima", "Female")
        };

        ArrayList<Student> male = new ArrayList<>();
        ArrayList<Student> female = new ArrayList<>();

        for (Student std : studentArray) {
            if (std.Gender.equalsIgnoreCase("Male")) {
                male.add(std);
            } else {
                female.add(std);
            }
        }

        Collections.shuffle(male);
        Collections.shuffle(female);

        int roomNo = 1;

        System.out.println("----- HOSTEL ROOM ALLOTMENT -----");

        for (int i = 0; i + 1 < male.size(); i += 2) {
            Student s1 = male.get(i);
            Student s2 = male.get(i + 1);

            s1.Room = roomNo;
            s2.Room = roomNo;

            System.out.println(
                "Room " + roomNo + " (Male): "
                + s1.name + " and " + s2.name
            );

            roomNo++;
        }
        for (int i = 0; i + 1 < female.size(); i += 2) {
            Student s1 = female.get(i);
            Student s2 = female.get(i + 1);

            s1.Room = roomNo;
            s2.Room = roomNo;

            System.out.println(
                "Room " + roomNo + " (Female): "
                + s1.name + " and " + s2.name
            );

            roomNo++;
        }

        System.out.println("\n----- LEFT OUT STUDENT -----");

        for (Student std : studentArray) {
            if (std.Room == null) {
                System.out.println("Name: " + std.name);
                System.out.println("Gender: " + std.Gender);
            }
        }
    }
}
