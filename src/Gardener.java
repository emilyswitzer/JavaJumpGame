public class Gardener implements WeatherWatcher{

    public void getUpdate(WeatherType weather) {
        System.out.println("The gardener is planting flowers in " + weather + " weather now");
    }
}