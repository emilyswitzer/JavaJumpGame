public interface iObservable {

    void addWeatherObserver(WeatherWatcher obs);

    void removeObserver(WeatherWatcher obs);

    void updateObserver();
}
