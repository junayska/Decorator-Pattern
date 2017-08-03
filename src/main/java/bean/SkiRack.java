package bean;

public class SkiRack extends Accessory {

    private double price = 300;

    public SkiRack(ICar decoratedCar){
        super(decoratedCar);
    }

    public double getPrice(){
        return super.getPrice() + price;
    }

    public String descriptionOfCar(){ return super.descriptionOfCar() + "\nSki Rack, " + Double.toString(price) + "e"; }

}
