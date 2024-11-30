package ua.edu.ucu.apps.Task1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import ua.edu.ucu.apps.Task1.myuser.User;

public class MessageSender {
    public void send(String text, User user, String country) {
        if (user.getCountry().equals(country) && isActiveInNextHour(user.getLocalDate())) {
            System.out.println("Message sent to " + user.getEmail() + ": " + text);
        } else {
            System.out.println("User not eligible to receive the message.");
        }
    }

    private boolean isActiveInNextHour(LocalDate lastActiveTime) {
        LocalDateTime lastActiveDateTime = lastActiveTime.atStartOfDay();
        LocalDateTime now = LocalDateTime.now();

        return !lastActiveDateTime.isAfter(now.plusHours(1));
    }
}
