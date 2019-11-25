package main;

import java.util.List;

public class GameInput {
    private final List<String> mTerrain;
    private final List<String> mPlayersType;
    private final List<Integer> mPlayersLocation;
    private final List<String> mPlayersMoves;
    private int mLineSize;
    private int mColumnSize;
    private int mPlayersNumber;
    private int mRounds;

    public GameInput() {
        mTerrain = mPlayersType = mPlayersMoves= null;
        mPlayersLocation =  null;
        mRounds = mLineSize = mColumnSize = mPlayersNumber = -1;
    }

    public GameInput(final int N, final int M, final List<String> terrain,
                     final int playersNumber, final List<String> playersType,
                     final List<Integer> playersLocation, final int rounds,
                     final List<String> playerMoves) {
        mLineSize = N;
        mColumnSize = M;
        mTerrain = terrain;
        mPlayersNumber = playersNumber;
        mPlayersType = playersType;
        mPlayersLocation = playersLocation;
        mRounds = rounds;
        mPlayersMoves = playerMoves;
    }

    public List<String> getPlayersType() {
        return mPlayersType;
    }

    public List<Integer> getPlayersLocation() {
        return mPlayersLocation;
    }

    public List<String> getPlayersMoves() {
        return mPlayersMoves;
    }

    public int getLineSize() {
        return mLineSize;
    }

    public int getColumnSize() {
        return mColumnSize;
    }

    public int getPlayersNumber() {
        return mPlayersNumber;
    }

    public List<String> getTerrain() {
        return mTerrain;
    }

    public final int getRounds() {
        return mRounds;
    }

    public final boolean isValidInput() {
        boolean membersInstantiated1 = mTerrain != null && mPlayersType != null;
        boolean membersInstantiated2 = mPlayersLocation != null && mPlayersMoves != null;
        boolean membersNotEmpty1 = mTerrain.size() > 0 && mPlayersType.size() > 0;
        boolean membersNotEmpty2 = mPlayersLocation.size() > 0 && mPlayersMoves.size() > 0;

        return membersInstantiated1 && membersInstantiated2 && membersNotEmpty1 && membersNotEmpty2;
    }
}
