import java.util.ArrayList;
import java.util.List;

public class Weather implements iObservable{

    private WeatherType current;
    private final List<WeatherWatcher> observers;

    public Weather() {
        observers = new ArrayList<>();
        current = WeatherType.SUNNY;
    }

    public void addObserver(WeatherWatcher ww) {
        observers.add(ww);
    }

    public void removeObserver(WeatherWatcher ww) {
        observers.remove(ww);
    }

    public void changeWeather() {
        WeatherType types[] = WeatherType.values();
        current = types[(current.ordinal() + 1)];
        System.out.println(("The weather changed to "+ current));
        updateObserver();
    }

    public void updateObserver() {
        for (WeatherWatcher ww : observers) {
            ww.getUpdate(current);
        }
    }
}