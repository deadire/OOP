public class ClassProduct {
    static int count = 0;
    private int id;
    private String name;
    private int quantity;
    private double price;
    private String category;

    ClassProduct(String name, int quantity, double price, String category) {
        this.id = ++count;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void displayProduct() {
        System.out.println("\n");
	  System.out.println("---------------------");
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
        System.out.println("Category: " + category);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        ClassProduct p1 = new ClassProduct("Laptop", 10, 1200.50, "Electronics");
        p1.displayProduct();
        ClassProduct p2 = new ClassProduct("Mobile", 15, 900.25, "Electronics");
        p2.displayProduct();
        p1.displayProduct();
    }
}

