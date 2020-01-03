package engine;

import logs.DataInterface;

import java.util.Observable;

public final class DataRepository extends Observable {

    /* Singleton Design Pattern:
        - We need to add data to our repo from multiple locations
        Observer Design Pattern:
        - We need to send updates to Admins with every log/notification
     */
    private static DataRepository instance;

    private DataRepository() {

    }
    public static DataRepository getInstance() {
        if (instance == null) {
            instance = new DataRepository();
        }
        return instance;
    }

    /**
     * Adds data to our record.
     * @param dataRecord Log that enters our data record
     */
    public void addData(final DataInterface dataRecord) {
        setChanged();
        notifyObservers(dataRecord);
    }
}
