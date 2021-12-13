package Observer;

public class Fisher implements WeatherWatcher {

    public void getUpdate(WeatherType weather) {
        if (weather.equals(WeatherType.STORM)) {
            System.out.println("The fisher can't go fishing the weather is " + weather + " now");
        } else
            System.out.println("The fisher can go fishing the weather is " + weather + " now");
    }
    }

