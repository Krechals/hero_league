package DataLogs;

public class DataNewRound implements DataInterface {
    int round;

    public DataNewRound(int r) {
        this.round = r;
    }
    public String toString() {
        return "~~ Round " + round + " ~~";
    }

}
