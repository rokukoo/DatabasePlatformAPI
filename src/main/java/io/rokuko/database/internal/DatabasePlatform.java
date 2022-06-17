package io.rokuko.database.internal;

public enum DatabasePlatform {
    MYSQL("mysql"),
    SQLITE("sqlite"),
    POSTGRESQL("postgresql"),
    ORACLE("oracle"),
    MSSQL("mssql"),
    H2("h2"),
    REDIS("redis"),
    MONGODB("mongodb");

    String name;

    DatabasePlatform(String name){
        this.name = name;
    }

}
