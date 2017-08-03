package bean;

public class AirCondition extends Accessory {

    private double price = 2500;

    public AirCondition(ICar decoratedCar){
        super(decoratedCar);
    }

    public double getPrice(){
        return super.getPrice() + price;
    }

    public String descriptionOfCar(){
        return super.descriptionOfCar() + "\nAir Condition, " + Double.toString(price) + "e";
    }
}
