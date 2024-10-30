package co.example.userservice.domain;

import java.util.List;

public class User {
    private Long id;
    private String name;
    private String email;
    private String passwordHash;
    private List<Role> roles; // e.g., ROLE_USER, ROLE_ADMIN
}
