public class Surfer implements WeatherWatcher {

    public void getUpdate(WeatherType weather) {
        System.out.println("The surfer is surfing in " + weather + " weather now");
    }
}
