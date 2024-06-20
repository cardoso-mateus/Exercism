public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double productionRate;
        if (speed > 9) {
            productionRate = speed * (221 * 0.77);
        } else if (speed > 8) {
            productionRate = speed * (221 * 0.8);
        } else if (speed > 4) {
            productionRate = speed * (221 * 0.9);
        } else {
            productionRate = speed * 221;
        }
        return productionRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
