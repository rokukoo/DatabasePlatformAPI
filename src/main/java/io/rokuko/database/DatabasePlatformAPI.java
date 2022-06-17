package io.rokuko.database;

import io.rokuko.database.internal.Database;
import io.rokuko.database.internal.DatabaseImpl;
import io.rokuko.database.internal.DatabasePlatform;

public class DatabasePlatformAPI {

    public static Database createDatabase(DatabasePlatform databasePlatform, String databaseName) {
        return DatabaseImpl.platform(databasePlatform, databaseName);
    }

}
