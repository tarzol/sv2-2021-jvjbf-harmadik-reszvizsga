package vehiclerental;

import java.time.LocalTime;
import java.util.Random;

public class Bike implements Rentable {

    private String rentingTime;
    private int id;

    public Bike(String rentingTime) {
        this.rentingTime = rentingTime;
        Random rnd = new Random();
        id = rnd.nextInt();
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
