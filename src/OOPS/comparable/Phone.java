package OOPS.comparable;

public class Phone implements Comparable<Phone>{
    private String brand;
    private int ram;
    private int price;

    public Phone(String brand, int ram, int price) {
        this.brand=brand;
        this.ram=ram;
        this.price = price;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand=brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price=price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram=ram;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Phone phone2) {

        if(this.getPrice() > phone2.getPrice())
            return 1;
        else
            return -1;

    }
}
