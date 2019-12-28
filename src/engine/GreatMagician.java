package engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class GreatMagician implements Observer {
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
    public void update(Observable obs, Object data) {
        logs.add(data.toString());
    }
    public List<String> getLogs() {
        return logs;
    }

}
