package map;

import hero.Hero;

import java.util.ArrayList;
import java.util.List;

public class GameMap {
    private static GameMap instance;
    List<List<TerrainList>> mapTerrain;
    List<List<Hero>> mapPlayer1;
    List<List<Hero>> mapPlayer2;

    private GameMap(List<String> mapString) {
        mapTerrain = new ArrayList<>();
        mapPlayer1 = new ArrayList<>();
        mapPlayer2 = new ArrayList<>();
        for (int i = 0; i < mapString.size(); ++i) {
            mapTerrain.add(new ArrayList<>());
            mapPlayer1.add(new ArrayList<>());
            mapPlayer2.add(new ArrayList<>());
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
    public static GameMap getInstance(List<String> mapString) {
        if (instance == null) {
            instance = new GameMap(mapString);
        }
        return instance;
    }
    public List<List<TerrainList>> getMapTerrain() {
        return mapTerrain;
    }
    public List<List<Hero>> getMapPlayer2() {
        return mapPlayer2;
    }
    public List<List<Hero>> getMapPlayer1() {
        return mapPlayer1;
    }
    public void setHeroOnMap(Hero h, int x, int y) {
        // Erase map
        if (h == null) {
            mapPlayer1.get(x).set(y, null);
            mapPlayer2.get(x).set(y, null);
            return;
        }
        // Set hero on map
        if (mapPlayer1.get(x).get(y) == null) {
            mapPlayer1.get(x).set(y, h);
        } else if (mapPlayer2.get(x).get(y) == null) {
            mapPlayer2.get(x).set(y, h);
        }
    }
}
