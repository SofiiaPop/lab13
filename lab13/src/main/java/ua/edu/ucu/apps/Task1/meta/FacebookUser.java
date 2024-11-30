package ua.edu.ucu.apps.Task1.meta;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class FacebookUser {
    private String userMail;
    private String country;
    private LocalDate lastActiveTime;
}
