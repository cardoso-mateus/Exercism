public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        boolean applyPenalty = daysSkipped > 4;
        return applyPenalty ? 0.85 : 1;
    }

    public int bonusMultiplier(int productsSold) {
        boolean applyBonus = productsSold > 19;
        return applyBonus ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = (1000 + bonusForProductsSold(productsSold)) * salaryMultiplier(daysSkipped);
        boolean isSalaryCapped = salary > 2000;
        return isSalaryCapped ? 2000 : salary;
    }
}
