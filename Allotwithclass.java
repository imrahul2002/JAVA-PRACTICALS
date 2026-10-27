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

    
    Student s1 = new Student("Ram", "Male");
    Student s2 = new Student("Rakesh", "Male");
    Student s3 = new Student("Rahul", "Male");
    Student s4 = new Student("Om", "Male");
    Student s5 = new Student("Ritik", "Male");
    Student s6 = new Student("Amit", "Male");
    Student s7 = new Student("Jay", "Male");
    Student s8 = new Student("Aditya", "Male");
    Student s9 = new Student("Anirudh", "Male");
    Student s10 = new Student("Vikas", "Male");

    Student s11 = new Student("Jyoti", "Female");
    Student s12 = new Student("Rubi", "Female");
    Student s13 = new Student("Nikita", "Female");
    Student s14 = new Student("Bimla", "Female");
    Student s15 = new Student("Sheema", "Female");
    Student s16 = new Student("Saraswati", "Female");
    Student s17 = new Student("Akansha", "Female");
    Student s18 = new Student("Divya", "Female");
    Student s19 = new Student("Anuradha", "Female");
    Student s20 = new Student("Anushiya", "Female");
    Student s21 = new Student("Ridhima", "Female");

    
    Student[] studentArray = {
        s1, s2, s3, s4, s5, s6, s7, s8, s9, s10,
        s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21
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
