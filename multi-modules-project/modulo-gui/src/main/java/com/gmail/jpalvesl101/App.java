package com.gmail.jpalvesl101;

import com.gmail.jpalvesl101.api.Database;

public class App {
    public static void main(String[] args) {
        // we need to use Database class here
        Database db = new Database();
        System.out.println("db.getDatabaseName() = " + db.getDatabaseName());
    }
}
