public class WeatherNotification {

    public static void main(String[] args) {

        Weather w = new Weather();
        w.addObserver(new Gardener());
        w.addObserver(new Fisher());
        w.addObserver(new Surfer());

        w.changeWeather();
        w.changeWeather();
    }
}
