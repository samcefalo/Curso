package me.samcefalo.patterns.criacional.singleton;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ConnectionPool {

    private final List<Connection> connectionPool = new ArrayList<>();
    private int poolSize;
    private static final ConnectionPool singleton = new ConnectionPool();

    private ConnectionPool(){
        System.out.println("Creating ConnectionPool..");
        connectionPool.add(new Connection());
    }

    public static ConnectionPool getInstance(){
        return singleton;
    }
}
