public class WeatherNotification {

    public static void main(String[] args) {

        Weather w = new Weather();
        w.addWeatherObserver(new Gardener());
        w.addWeatherObserver(new Fisher());
        w.addWeatherObserver(new Snowboarder());
        w.addWeatherObserver(new Surfer());

        w.changeWeather();
        w.changeWeather();
        w.changeWeather();
        w.changeWeather();
    }
}
