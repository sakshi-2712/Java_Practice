import java.util.ArrayList;
import java.util.Scanner;

class Room {
    int roomNumber;
    String roomType;
    boolean isAvailable;
    double pricePerNight;

    public Room(int roomNumber, String roomType, boolean isAvailable, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
        this.pricePerNight = pricePerNight;
    }
}


class Hotel {
    ArrayList<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void checkAvailability() {
        System.out.println("\nAvailable Rooms:");
        boolean hasAvailableRooms = false;
        for (Room room : rooms) {
            if (room.isAvailable) {
                System.out.println("Room Number: " + room.roomNumber + ", Type: " + room.roomType + ", Price: " + room.pricePerNight);
                hasAvailableRooms = true;
            }
        }
        if (!hasAvailableRooms) {
            System.out.println("No rooms are available.");
        }
    }

    public void bookRoom(int roomNumber, int numberOfNights) {
        for (Room room : rooms) {
            if (room.roomNumber == roomNumber) {
                if (room.isAvailable) {
                    room.isAvailable = false;
                    double totalCharges = room.pricePerNight * numberOfNights;
                    System.out.println("Room " + roomNumber + " booked successfully for " + numberOfNights + " nights. Total charges: " + totalCharges);
                } else {
                    System.out.println("Room " + roomNumber + " is not available.");
                }
                return;
            }
        }
        System.out.println("Room " + roomNumber + " does not exist.");
    }
}


public class HotelReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();

        // Add rooms to the hotel
        hotel.addRoom(new Room(101, "Single", true, 50.0));
        hotel.addRoom(new Room(102, "Double", true, 75.0));
        hotel.addRoom(new Room(103, "Suite", true, 120.0));
        hotel.addRoom(new Room(104, "Single", false, 50.0));

        while (true) {
            System.out.println("\nHotel Reservation System:");
            System.out.println("1. Check Room Availability");
            System.out.println("2. Book a Room");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hotel.checkAvailability();
                    break;
                case 2:
                    System.out.print("Enter room number to book: ");
                    int roomNumber = scanner.nextInt();
                    System.out.print("Enter number of nights: ");
                    int numberOfNights = scanner.nextInt();
                    hotel.bookRoom(roomNumber, numberOfNights);
                    break;
                case 3:
                    System.out.println("Thank you for using the Hotel Reservation System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
