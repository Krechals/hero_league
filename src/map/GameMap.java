package map;

import hero.Hero;

import java.util.ArrayList;
import java.util.List;

public final class GameMap {
    // Singleton Design Pattern - GameMap
    private static GameMap instance;
    private List<List<TerrainList>> mapTerrain;
    private List<List<Hero>> mapPlayer1;
    private List<List<Hero>> mapPlayer2;

    private GameMap() {
        // NOT_CALLED
    }
    private GameMap(final List<String> mapString) {
        mapTerrain = new ArrayList<>();
        mapPlayer1 = new ArrayList<>();
        mapPlayer2 = new ArrayList<>();
        for (int i = 0; i < mapString.size(); ++i) {
            mapTerrain.add(new ArrayList<>());
            mapPlayer1.add(new ArrayList<>());
            mapPlayer2.add(new ArrayList<>());

            // Create map with TerrainFactory design pattern
            for (int j = 0; j < mapString.get(i).length(); ++j) {
                if (mapString.get(i).charAt(j) == 'L') {
                    mapTerrain.get(i).add(TerrainList.LAND);
                } else if (mapString.get(i).charAt(j) == 'V') {
                    mapTerrain.get(i).add(TerrainList.VOLCANIC);
                } else if (mapString.get(i).charAt(j) == 'D') {
                    mapTerrain.get(i).add(TerrainList.DESERT);
                } else {
                    mapTerrain.get(i).add(TerrainList.WOODS);
                }
                mapPlayer1.get(i).add(null);
                mapPlayer2.get(i).add(null);
            }
        }
    }
    public TerrainList getTerrain(final int x, final int y) {
        return mapTerrain.get(x).get(y);
    }
    public static GameMap getInstance(final List<String> mapString) {
        if (instance == null) {
            instance = new GameMap(mapString);
        }
        return instance;
    }
    public List<List<Hero>> getMapPlayer2() {
        return mapPlayer2;
    }
    public List<List<Hero>> getMapPlayer1() {
        return mapPlayer1;
    }

    /**
     * Set hero on matrix 1 or 2. Wizards are always on matrix 2,
     * they must be attacked first.
     * @param h: Hero to be placed on matrix
     * @param x: Line of hero's position
     * @param y: Column of hero's position
     */
    public void setHeroOnMap(final Hero h, final int x, final int y) {
        // Erase map every new round
        if (h == null) {
            mapPlayer1.get(x).set(y, null);
            mapPlayer2.get(x).set(y, null);
            return;
        }
        // Set hero on map
        if (mapPlayer1.get(x).get(y) == null) {
            mapPlayer1.get(x).set(y, h);
        } else if (mapPlayer2.get(x).get(y) == null) {
            if (mapPlayer1.get(x).get(y).getInitial() == 'W') {
                Hero tmp = mapPlayer1.get(x).get(y);
                mapPlayer2.get(x).set(y, tmp);
                mapPlayer1.get(x).set(y, h);
            } else {
                mapPlayer2.get(x).set(y, h);
            }
        }
    }
}
