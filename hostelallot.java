public class hostelallot {

    // Function to allot rooms
    static void allotRooms(String[] students) {

        // 10 rooms, each can hold 2 students
        String[][] rooms = new String[10][2];

        int studentNo = 0;

        // Fill rooms (maximum 20 students)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (studentNo < 20) {          // only first 20 students get rooms
                    rooms[i][j] = students[studentNo];
                    studentNo++;
                }
            }
        }

        // Print room allotment
        System.out.println("----- Room Allotment -----");
        for (int i = 0; i < 10; i++) {
            System.out.println("Room " + (i + 1) + " : " + rooms[i][0] + " , " + rooms[i][1]);
        }

        // Print the left out student
        System.out.println("\n----- Left Out Student -----");
        System.out.println(students[20]);   // 21st student (index 20)
    }

    public static void main(String[] args) {

        // 21 students
        String[] students = {
            "Aarav", "Vivaan", "Aditya", "Vihaan", "Arjun",
            "Sai", "Reyansh", "Ayaan", "Krishna", "Ishaan",
            "Shaurya", "Atharv", "Advik", "Pranav", "Rudra",
            "Kabir", "Anirudh", "Dhruv", "Yash", "Aryan",
            "Rohan"
        };

        allotRooms(students);   // call the function
    }
}