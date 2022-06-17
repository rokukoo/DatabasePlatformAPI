# DatabasePlatformAPI
A multi platform database api which contains sqlite, mysql, redis, mongodb and so on.

You can use it when you want to use a database in your project.
For example, you can use it to store your data in a database.
And here is a bukkit plugin develop example.
```java
    private Database database;

    @Override
    public onEnable(){
        this.database = DatabasePlatformAPI
                            .createDatabase(DatabasePlatform.MYSQL, pluginName)
                            .host("localhost")
                            .port(3306)
                            .user("root")
                            .password("root")
                            .connect();
    }
```