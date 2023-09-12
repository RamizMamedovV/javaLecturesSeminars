package seminar2;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Log {
    static {
        try (FileInputStream inputStream = new FileInputStream("log.config")) {
            LogManager.getLogManager().readConfiguration(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Logger log(String className) {
        return Logger.getLogger(className);
    }
}
