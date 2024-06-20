public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double minimumProductionRate = 221;
        return minimumProductionRate * speed * successRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }

    private double successRate(int speed) {
        double rate;
        if (speed > 9) {rate = 0.77;}
        else if (speed > 8) {rate = 0.8;}
        else if (speed > 4) {rate = 0.9;}
        else {rate = 1;}
        return rate;
    }
}
