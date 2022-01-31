package vehiclerental;

import java.time.LocalTime;
import java.util.Random;

public class Car implements Rentable{

    private String rentingTime;
    private int id;
    private int pricePerMinute;

    public Car(String rentingTime, int pricePerMinute) {
        this.rentingTime = rentingTime;
        Random rnd = new Random();
        id = rnd.nextInt();
        this.pricePerMinute = pricePerMinute;
    }

    @Override
    public int calculateSumPrice(long minutes) {
        return (int)minutes * 15;
    }

    @Override
    public LocalTime getRentingTime() {
        return null;
    }

    @Override
    public void rent(LocalTime time) {

    }

    @Override
    public void closeRent() {

    }

    @Override
    public int compareTo(Rentable o) {
        return Rentable.super.compareTo(o);
    }
}
