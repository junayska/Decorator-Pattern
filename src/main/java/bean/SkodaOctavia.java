package bean;

public class SkodaOctavia implements ICar {

    private String carName = "Skoda Octavia";
    private double price = 32500;

    public double getPrice() {
        return price;
    }

    public String descriptionOfCar(){ return carName + ", " + Double.toString(price) + "e"; }
}
