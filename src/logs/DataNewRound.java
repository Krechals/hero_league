package logs;

public class DataNewRound implements DataInterface {
    private int round;

    public DataNewRound(final int r) {
        this.round = r;
    }
    public final String toString() {
        return "~~ Round " + round + " ~~";
    }

}
