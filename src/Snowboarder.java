public class Snowboarder implements WeatherWatcher{

    public void update(WeatherType weather) {
        System.out.println("The snowboarder is encountering " + weather + " weather now");
    }
}