package me.samcefalo.patterns.criacional.factory.db.after.models;

public abstract class DB {

    public abstract void query(String sql);

    public abstract void update(String sql);

}
