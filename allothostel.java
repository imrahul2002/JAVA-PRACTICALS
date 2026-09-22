public class allothostel {

    // Function to allot rooms
    static void allotRooms(String[] male, String[] female) {

        // 10 rooms, each can hold 2 students
        String[][] rooms = new String[10][2];
        int roomNo = 0;

        // First allot Male students (10 males → 5 rooms)
        for (int i = 0; i < male.length; i += 2) {
            rooms[roomNo][0] = male[i];
            rooms[roomNo][1] = male[i + 1];
            roomNo++;
        }

        // Then allot Female students (first 10 females → next 5 rooms)
        for (int i = 0; i < 10; i += 2) {
            rooms[roomNo][0] = female[i];
            rooms[roomNo][1] = female[i + 1];
            roomNo++;
        }

        // Print room allotment
        System.out.println("----- Room Allotment -----");

        for (int i = 0; i < 10; i++) {
            System.out.println(
                "Room " + (i + 1) + " : "
                + rooms[i][0] + " , "
                + rooms[i][1]
            );
        }

        // Print the left out student (11th female)
        System.out.println("\n----- Left Out Student -----");
        System.out.println(female[10] + " (Female)");
    }

    public static void main(String[] args) {

        // 10 Male students
        String[] male = {
            "Aarav", "Vivaan", "Aditya", "Arjun", "Sai",
            "Reyansh", "Ayaan", "Krishna", "Ishaan", "Shaurya"
        };

        // 11 Female students
        String[] female = {
            "Ananya", "Diya", "Isha", "Kavya", "Meera",
            "Nisha", "Pooja", "Riya", "Sneha", "Tanvi",
            "Zara"   // This one will be left out
        };

        // Call the function
        allotRooms(male, female);
    }
}