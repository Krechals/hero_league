package map;

import java.util.ArrayList;
import java.util.List;

public class GameMap {
    private static GameMap instance;
    List<List<Character>> map;

    private GameMap(int x, int y) {
        map = new ArrayList<List<Character>>();
        for (int i = 0; i < x; ++i) {
            map.add(new ArrayList<Character>());
        }
    }
    public GameMap getInstance(int x, int y) {
        if (instance == null) {
            return new GameMap(x, y);
        }
        return instance;
    }
}
