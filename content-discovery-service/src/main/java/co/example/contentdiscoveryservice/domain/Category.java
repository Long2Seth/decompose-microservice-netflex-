package co.example.contentdiscoveryservice.domain;

import java.util.List;

public class Category {
    private Long id;
    private String name; // e.g., Action, Drama, Comedy
    private List<Video> videos;
}
