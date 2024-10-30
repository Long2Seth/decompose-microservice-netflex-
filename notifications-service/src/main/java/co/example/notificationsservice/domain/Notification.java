package co.example.notificationsservice.domain;

import java.time.LocalDateTime;

public class Notification {
    private Long id;
    private User user;
    private String message;
    private NotificationType type; // e.g., REMINDER, PROMOTION
    private Boolean isRead;
    private LocalDateTime sentAt;
}

