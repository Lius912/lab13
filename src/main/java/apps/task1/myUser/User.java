package apps.task1.myUser;

import java.time.LocalDate;


public interface User {
    public String getEmail();
    public String getCountry();
    public LocalDate getLastActiveTime();
}
