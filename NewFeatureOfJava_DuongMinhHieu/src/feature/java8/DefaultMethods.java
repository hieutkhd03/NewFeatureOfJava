package feature.java8;

import java.util.Date;

public class DefaultMethods {

    public interface Logging {
        void log(String message);

        default void log(String message, Date date) {
            System.out.println(date.toString() + ": " + message);
        }
    }

    // Lớp thực thi interface Logging
    public static class ConsoleLogger implements Logging {
        @Override
        public void log(String message) {
            System.out.println("Log: " + message);
        }
    }

    public static void main(String[] args) {
        // Tạo một đối tượng ConsoleLogger
        ConsoleLogger logger = new ConsoleLogger();

        // Sử dụng phương thức log cơ bản
        logger.log("This is a simple log message.");

        // Sử dụng phương thức log với ngày tháng
        logger.log("This is a log message with a date.", new Date());
    }
}

