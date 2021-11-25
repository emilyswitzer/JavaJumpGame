public class Fisher implements WeatherWatcher{

    public void update(WeatherType weather) {
        System.out.println("The fisher is encountering " + weather + " weather now");
    }
}
