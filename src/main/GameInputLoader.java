package main;

import fileio.FileSystem;

import java.util.ArrayList;
import java.util.List;

public final class GameInputLoader {
    private final String mInputPath;
    private final String mOutputPath;

    GameInputLoader(final String inputPath, final String outputPath) {
        mInputPath = inputPath;
        mOutputPath = outputPath;
    }

    public GameInput load() {
        List<String> terrain = new ArrayList<>();
        List<String> playesrType = new ArrayList<>();
        List<Integer> playersLocation = new ArrayList<>();
        List<String> moves = new ArrayList<>();

        int lines = 0;
        int columns = 0;
        int noPlayers = 0;
        int noRounds = 0;

        try {
            FileSystem fs = new FileSystem(mInputPath, mOutputPath);

            lines = fs.nextInt();
            columns = fs.nextInt();

            for (int i = 0; i < lines; ++i) {
                terrain.add(fs.nextWord());
            }

            noPlayers = fs.nextInt();
            for (int i = 0; i < noPlayers; ++i) {
                playesrType.add(fs.nextWord());
                playersLocation.add(fs.nextInt());
                playersLocation.add(fs.nextInt());
            }

            noRounds = fs.nextInt();

            for (int i = 0; i < noRounds; ++i) {
                moves.add(fs.nextWord());
            }

            fs.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return new GameInput.Builder()
                    .setLines(lines)
                    .setColumns(columns)
                    .setTerrain(terrain)
                    .setPlayerNumber(noPlayers)
                    .setPlayersType(playesrType)
                    .setPlayersLocatiomn(playersLocation)
                    .setRounds(noRounds)
                    .setPlayerMoves(moves)
                    .build();
    }
}
