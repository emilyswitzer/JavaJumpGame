public class Snowboarder implements WeatherWatcher{

    public void getUpdate(WeatherType weather) {
        System.out.println("The snowboarder is snowboarding in " + weather + " weather now");
    }
}