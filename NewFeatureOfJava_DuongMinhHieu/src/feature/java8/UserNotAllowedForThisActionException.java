package feature.java8;

import feature.java8.RepeatingAnnotations.Notify;

@Notify(email = "admin@company.com")
@Notify(email = "owner@company.com")
public class UserNotAllowedForThisActionException
        extends RuntimeException {
    final String user;

    public UserNotAllowedForThisActionException(String user) {
        this.user = user;

    }
}
