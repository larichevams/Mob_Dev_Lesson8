package ru.mirea.laricheva.yandexdriver;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

public class App extends Application {
    private final String MAPKIT_API_KEY = "3925c94b-a46a-41f8-a446-7f0fafe36787";
    @Override
    public void onCreate() {
        super.onCreate();
//        Log.d(MainActivity.class.getSimpleName(), MAPKIT_API_KEY);
        MapKitFactory.setApiKey(MAPKIT_API_KEY);
    }
}
