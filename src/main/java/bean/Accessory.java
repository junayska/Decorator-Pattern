package bean;

public abstract class Accessory implements ICar {

    protected final ICar decoratedCar;

    public Accessory(ICar ic){
        this.decoratedCar = ic;
    }

    public double getPrice(){
        return decoratedCar.getPrice();
    }

    public String descriptionOfCar(){
        return decoratedCar.descriptionOfCar();
    }

}
