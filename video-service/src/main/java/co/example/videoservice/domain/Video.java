package co.example.videoservice.domain;

import java.time.Duration;
import java.util.List;

public class Video {
    private Long id;
    private String title;
    private String description;
    private String genre;
    private String quality; // e.g., 1080p, 4K
    private Duration duration;
    private String url;
    private List<Subtitle> subtitles;
    private List<Language> availableLanguages;
}