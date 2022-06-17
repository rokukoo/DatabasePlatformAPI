package io.rokuko.database.internal;

public interface Database {

    Database host(String host);

    Database port(int port);

    Database user(String user);

    Database password(String password);

    Database connect();

}
