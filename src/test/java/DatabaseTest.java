import io.rokuko.database.internal.DatabasePlatform;
import io.rokuko.database.DatabasePlatformAPI;
import org.junit.jupiter.api.Test;


public class DatabaseTest {

    @Test
    public void testDatabase() {
        DatabasePlatformAPI
                .createDatabase(DatabasePlatform.MYSQL, "test")
                .host("localhost")
                .port(3306)
                .user("root")
                .password("root")
                .connect();


    }

}
