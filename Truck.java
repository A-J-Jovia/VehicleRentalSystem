package classfiles;

public class Truck extends Vehicle {
    public float CalcRate(float rate, int hour, float loadWeight) {
        if (loadWeight > 1000) {
            return rate * hour + 200;
        } else {
            return rate * hour;
        }
    }
}
