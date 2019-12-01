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
        mTerrain = null;
        mPlayersType = null;
        mPlayersMoves = null;
        mPlayersLocation =  null;
        mRounds = -1;
        mLineSize = -1;
        mColumnSize = -1;
        mPlayersNumber = -1;
    }
    protected GameInput(final Builder builder) {
        mLineSize = builder.mLinesBuilder;
        mColumnSize = builder.mColumnsBuilder;
        mTerrain = builder.mTerrainBuilder;
        mPlayersNumber = builder.mPlayerNumberBuilder;
        mPlayersType = builder.mPlayersTypeBuilder;
        mPlayersLocation = builder.mPlayersLocationBuilder;
        mRounds = builder.mRoundsBuilder;
        mPlayersMoves = builder.mPlayerMovesBuilder;

    }
    public static class Builder {

        private int mLinesBuilder;
        private int mColumnsBuilder;
        private List<String> mTerrainBuilder;
        private int mPlayerNumberBuilder;
        private List<String> mPlayersTypeBuilder;
        private List<Integer> mPlayersLocationBuilder;
        private int mRoundsBuilder;
        private List<String> mPlayerMovesBuilder;

        public final GameInput build() {
            return new GameInput(this);
        }
        public final Builder setLines(final int lines) {
            mLinesBuilder = lines;
            return this;
        }
        public final Builder setColumns(final int columns) {
            mColumnsBuilder = columns;
            return this;
        }
        public final Builder setTerrain(final List<String> terrain) {
            mTerrainBuilder = terrain;
            return this;
        }
        public final Builder setPlayerNumber(final int playerNumber) {
            mPlayerNumberBuilder = playerNumber;
            return this;
        }
        public final Builder setPlayersType(final List<String> playersType) {
            mPlayersTypeBuilder = playersType;
            return this;
        }
        public final Builder setPlayersLocatiomn(final List<Integer> playersLocation) {
            mPlayersLocationBuilder = playersLocation;
            return this;
        }
        public final Builder setRounds(final int rounds) {
            mRoundsBuilder = rounds;
            return this;
        }
        public final Builder setPlayerMoves(final List<String> playerMoves) {
            mPlayerMovesBuilder = playerMoves;
            return this;
        }

    }
    public final List<String> getPlayersType() {
        return mPlayersType;
    }

    public final List<Integer> getPlayersLocation() {
        return mPlayersLocation;
    }

    public final List<String> getPlayersMoves() {
        return mPlayersMoves;
    }

    public final int getLineSize() {
        return mLineSize;
    }

    public final int getColumnSize() {
        return mColumnSize;
    }

    public final int getPlayersNumber() {
        return mPlayersNumber;
    }

    public final List<String> getTerrain() {
        return mTerrain;
    }

    public final int getRounds() {
        return mRounds;
    }
}
