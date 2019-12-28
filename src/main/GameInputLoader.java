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

    // Gets data from input with fileIO.jar
    public GameInput load() {
        List<String> terrain = new ArrayList<>();
        List<String> playesrType = new ArrayList<>();
        List<Integer> playersLocation = new ArrayList<>();
        List<String> moves = new ArrayList<>();
        List<String> angelsType = new ArrayList<>();
        List<Integer> angelsRound = new ArrayList<>();
        List<Integer> angelsLocation = new ArrayList<>();

        int lines = 0;
        int columns = 0;
        int noPlayers = 0;
        int noRounds = 0;
        int currentRoundAngels = 0;
        String angelData = new String();

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

            // Read Angel appearance
            for (int round = 0; round < noRounds; ++round) {
                currentRoundAngels = fs.nextInt();
                for (int j = 0; j < currentRoundAngels; ++j) {
                    angelsRound.add(round);
                    angelData = fs.nextWord();
                    int dataIndex = 0;
                    // Split Angel's data from input for easier access
                    for (String data : angelData.split(",")) {
                        if (dataIndex == 0) {
                            angelsType.add(data);
                        } else {
                            angelsLocation.add(Integer.parseInt(data));
                        }
                        ++dataIndex;
                    }
                }
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
                    .setAngelRound(angelsRound)
                    .setAngelType(angelsType)
                    .setAngelLocation(angelsLocation)
                    .build();
    }
}
