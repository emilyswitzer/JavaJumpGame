public class Fisher implements WeatherWatcher{

    public void getUpdate(WeatherType weather) {
        System.out.println("The fisher is fishing in " + weather + " weather now");
    }
}
