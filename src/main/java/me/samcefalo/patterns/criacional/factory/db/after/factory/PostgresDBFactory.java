package me.samcefalo.patterns.criacional.factory.db.after.factory;

import me.samcefalo.patterns.criacional.factory.db.after.models.DB;
import me.samcefalo.patterns.criacional.factory.db.after.models.PostgresDB;

public class PostgresDBFactory implements DBFactory {

    @Override
    public DB getDatabase() {
        return new PostgresDB();
    }

}
