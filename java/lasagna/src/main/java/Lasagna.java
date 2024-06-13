public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        int recipeTime = 40;
        return recipeTime;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int i) {
        return expectedMinutesInOven() - i;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int i) {
        int minutesPerLayer = 2;
        return i * minutesPerLayer;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutes) {
        int timeSpentByLayer = preparationTimeInMinutes(layers);
        int numberOfMinutesInTheOven = minutes;
        return timeSpentByLayer + minutes;
    }
}
