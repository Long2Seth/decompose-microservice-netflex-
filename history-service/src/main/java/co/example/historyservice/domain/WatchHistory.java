package co.example.historyservice.domain;

import java.time.Duration;
import java.time.LocalDateTime;

public class WatchHistory {
    private Long id;
    private User user;
    private Video video;
    private LocalDateTime watchedAt;
    private Duration watchedDuration;
}
