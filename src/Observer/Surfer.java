package Observer;

public class Surfer implements WeatherWatcher {

    public void getUpdate(WeatherType weather) {
        if (weather.equals(WeatherType.STORM)) {
            System.out.println("The surfer can't go surfing the weather is " + weather + " now");
        } else
            System.out.println("The surfer can go surfing the weather is " + weather + " now");
    }

}
