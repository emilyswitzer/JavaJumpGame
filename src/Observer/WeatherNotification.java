package Observer;

public class WeatherNotification {

    public static void main(String[] args) {

        WeatherApp w = new WeatherApp();
        w.addObserver(new Snowboarder());
        w.addObserver(new Fisher());
        w.addObserver(new Surfer());
        w.addObserver(new Gardener());

        w.changeWeather();
        w.changeWeather();
    }
}
