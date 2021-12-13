package Observer;

public class Gardener implements WeatherWatcher {

    public void getUpdate(WeatherType weather) {
        if (weather.equals(WeatherType.SUNNY)) {
            System.out.println("The gardener can plant flowers the weather is " + weather + " now");
        } else
            System.out.println("The gardener can't plant flowers the weather is " + weather + " now");

    }
}