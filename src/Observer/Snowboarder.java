package Observer;

import Observer.WeatherType;
import Observer.WeatherWatcher;

public class Snowboarder implements WeatherWatcher {


    public void getUpdate(WeatherType weather) {

        if (weather.equals(WeatherType.SNOW)) {
            System.out.println("The snowboarder can snowboard the weather is " + weather + " now");
        } else
            System.out.println("The snowboarder can't snowboard the weather is " + weather + " now");
    }
}