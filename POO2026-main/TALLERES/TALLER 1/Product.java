public class Product {
    private String name;
    private double price;
    private int stock;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public boolean setName(String newName) {
        if (!newName.equals("")) {
            name = newName;
            return true;
        }
        return false;
    }

    public boolean setPrice(double newPrice) {
        if (newPrice > 0) {
            price = newPrice;
            return true;
        }
        return false;
    }

    public boolean setStock(int newStock) {
        if (newStock >= 0) {
            stock = newStock;
            return true;
        }
        return false;
    }
}
