package engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public final class GreatMagician implements Observer {
    /*
        Singleton Design Pattern:
        - We need a single Admin in the game
        Observer Design Pattern:
        - Admin must receive log notifications
     */
    private static GreatMagician instance;
    private List<String> logs;

    private GreatMagician() {
        logs = new ArrayList<>();
    }
    public static GreatMagician getInstance() {
        if (instance == null) {
            instance = new GreatMagician();
        }
        return instance;
    }
    // Stores the logs received
    public void update(final Observable obs, final Object data) {
        logs.add(data.toString());
    }
    public List<String> getLogs() {
        return logs;
    }

}
