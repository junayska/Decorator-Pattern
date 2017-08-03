package bean;

public class AudiA3 implements ICar {

    private String carName = "Audi A3";
    private double price = 37900;

    public double getPrice() {
        return price;
    }

    public String descriptionOfCar(){ return carName + ", " + Double.toString(price) + "e"; }
}
