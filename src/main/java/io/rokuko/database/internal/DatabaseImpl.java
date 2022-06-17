package io.rokuko.database.internal;

public class DatabaseImpl implements Database {

    private DatabasePlatform databasePlatform;
    private String databaseName;
    private String host;
    private int port;
    private String user;
    private String password;

    private DatabaseImpl(DatabasePlatform databasePlatform, String databaseName) {
        this.databasePlatform = databasePlatform;
        this.databaseName = databaseName;
    }

    public static DatabaseImpl platform(DatabasePlatform databasePlatform, String databaseName){
        return new DatabaseImpl(databasePlatform, databaseName);
    }

    @Override
    public DatabaseImpl host(String host){
        this.host = host;
        return this;
    }

    @Override
    public Database port(int port) {
        this.port = port;
        return this;
    }

    @Override
    public Database user(String user) {
        this.user = user;
        return this;
    }

    @Override
    public Database password(String password) {
        this.password = password;
        return this;
    }

    @Override
    public Database connect() {
        checkState();

        //TODO: connect to database

        return this;
    }

    public void checkState() throws IllegalStateException {
        if (host == null) {
            throw new IllegalStateException("Host is not set");
        }else if (port == 0) {
            throw new IllegalStateException("Port is not set");
        }else if (user == null) {
            throw new IllegalStateException("User is not set");
        }else if (password == null) {
            throw new IllegalStateException("Password is not set");
        }
    }

}
