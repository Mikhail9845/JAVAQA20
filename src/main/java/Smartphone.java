public class Smartphone extends Product {
    protected String name;
    protected String manufacturer;

    public Smartphone(int id, String name, int price, String name1, String manufacturer) {
        super(id, name, price);
        this.name = name1;
        this.manufacturer = manufacturer;
    }
}