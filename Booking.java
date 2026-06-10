public class Booking {

    private String customerName;
    private int roomNumber;

    public Booking(String customerName,
                   int roomNumber) {

        this.customerName = customerName;
        this.roomNumber = roomNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}