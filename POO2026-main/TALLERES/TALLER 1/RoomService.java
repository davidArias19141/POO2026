public class RoomService {
    private String guest;
    private int roomNumber;
    private int numberOfNights;
    private double pricePerNight;

    public String readGuest() {
        return guest;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean setGuest(String newGuest) {
        if (!newGuest.equals("")) {
            guest = newGuest;
            return true;
        }
        return false;
    }

    public void setRoomNumber(int newRoomNumber) {
        roomNumber = newRoomNumber;

    }

    public boolean setNumberOfNights(int newNumberOfNights) {
        if (newNumberOfNights > 0) {
            numberOfNights = newNumberOfNights;
            return true;
        }
        return false;
    }

    public boolean setPricePerNight(int newPricePerNight) {
        if (newPricePerNight > 0) {
            pricePerNight = newPricePerNight;
            return true;
        }
        return false;
    }

    public double TotalCost() {
        double totalCost = pricePerNight * numberOfNights;
        return totalCost;
    }
}
