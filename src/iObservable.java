public interface iObservable {

    void addObserver(WeatherWatcher obs);

    void removeObserver(WeatherWatcher obs);

    void updateObserver();
}
