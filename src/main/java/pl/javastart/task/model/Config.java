package pl.javastart.task.model;

public class Config {

    private final int minRequiredEarnings = 2000;
    private final double percentage = 0.03;

    public int getMinRequiredEarnings() {
        return minRequiredEarnings;
    }

    public double getPercentage() {
        return percentage;
    }
}
