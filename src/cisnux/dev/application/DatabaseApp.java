package cisnux.dev.application;

import cisnux.dev.errors.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("cisnux", null);
    }

    public static void connectDatabase(String username, String password){
        if (username == null || password == null)
            throw new DatabaseError("couldn't connect to database");
    }
}
