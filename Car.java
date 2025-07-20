package classfiles;

public class Car extends Vehicle {
    public float CalcRate(float rate, int hour, boolean gps) {
        if (gps) {
            return rate * hour + 50;
        } else {
            return rate * hour;
        }
    }
}
