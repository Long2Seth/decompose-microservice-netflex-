package co.example.deliverynetworkservice.domain;

import java.time.Duration;

public class Video {
    private Long id;
    private String title;
    private String description;
    private String genre;
    private String quality; // e.g., 1080p, 4K
    private Duration duration;
    private String url; // CDN location of the video file
//    private List<Subtitle> subtitles;
//    private List<Language> availableLanguages;
}
