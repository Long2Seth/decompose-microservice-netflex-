package co.example.deliverynetworkservice.domain;

import java.util.List;

public class CDNNode {
    private Long id;
    private String location; // geographic location of the CDN node
    private String ipAddress;
    private List<Video> cachedVideos;
}
