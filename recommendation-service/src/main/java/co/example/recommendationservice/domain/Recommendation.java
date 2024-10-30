package co.example.recommendationservice.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Recommendation {
    private Long id;
    private User user;
    private List<Video> recommendedVideos;
    private LocalDateTime generatedAt;
}
