package co.example.paymentservice.domain;

import java.math.BigDecimal;
import java.time.Duration;

public class SubscriptionPlan {
    private Long id;
    private String name; // e.g., Basic, Premium
    private BigDecimal price;
    private Duration duration; // e.g., Monthly, Yearly
}

