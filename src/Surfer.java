public class Surfer implements WeatherWatcher {

    public void update(WeatherType weather) {
        System.out.println("The surfer is encountering " + weather + " weather now");
    }
}
