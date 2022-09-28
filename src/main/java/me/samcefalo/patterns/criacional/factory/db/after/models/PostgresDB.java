package me.samcefalo.patterns.criacional.factory.db.after.models;

public class PostgresDB extends DB {

    @Override
    public void query(String sql) {
        System.out.println("Querying " + sql + " in Postgres database");
    }

    @Override
    public void update(String sql) {
        System.out.println("Uptade querry " + sql + " in Postgres database");
    }

}
