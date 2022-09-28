package me.samcefalo.patterns.criacional.factory.db.after.factory;

import me.samcefalo.patterns.criacional.factory.db.after.models.DB;
import me.samcefalo.patterns.criacional.factory.db.after.models.OracleDB;

public class OracleDBFactory implements DBFactory {

    @Override
    public DB getDatabase() {
        return new OracleDB();
    }

}
