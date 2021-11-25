public class Gardener implements WeatherWatcher{

    public void update(WeatherType weather) {
        System.out.println("The gardener is encountering " + weather + " weather now");
    }
}