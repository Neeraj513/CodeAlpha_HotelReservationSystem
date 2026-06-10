import java.util.*;

public class HotelReservationSystem {

    static ArrayList<Room> rooms =
            new ArrayList<>();

    static Scanner sc =
            new Scanner(System.in);

    public static void main(String[] args) {

        rooms.add(new Room(101,
                "Standard",
                true));

        rooms.add(new Room(201,
                "Deluxe",
                true));

        rooms.add(new Room(301,
                "Suite",
                true));

        while(true) {

            System.out.println("\n===== HOTEL SYSTEM =====");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    viewRooms();
                    break;

                case 2:
                    bookRoom();
                    break;

                case 3:
                    System.exit(0);
            }
        }
    }

    static void viewRooms() {

        for(Room r : rooms) {

            System.out.println(
                    r.getRoomNumber()
                    + " "
                    + r.getCategory()
                    + " "
                    + (r.isAvailable()
                    ? "Available"
                    : "Booked")
            );
        }
    }

    static void bookRoom() {

        System.out.print("Enter Room Number: ");
        int roomNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        for(Room r : rooms) {

            if(r.getRoomNumber() == roomNo
                    && r.isAvailable()) {

                r.setAvailable(false);

                System.out.println(
                        "Payment Successful"
                );

                System.out.println(
                        "Booking Confirmed for "
                                + name
                );

                return;
            }
        }

        System.out.println(
                "Room Not Available"
        );
    }
}