package bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class ICarTest {

    @Test
    public void testCarWithoutDecoration() throws Exception {
        ICar car = new SkodaOctavia();
        assertEquals(car.descriptionOfCar() , "Skoda Octavia");

    }

    @Test
    public void testCarWithDecoration() throws Exception {
        ICar car = new SkodaOctavia();
        ICar ac = new AirCondition(car);
        assertEquals(ac.descriptionOfCar(), "Skoda Octavia, Air Condition");
    }


}