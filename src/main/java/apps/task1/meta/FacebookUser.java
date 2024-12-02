package apps.task1.meta;

import java.time.LocalDate;

import apps.task1.twitter.XCountry;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class FacebookUser {
    private String Email;
    private String UserCountry;
    private LocalDate UserActiveTime;
}