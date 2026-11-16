package com.example.quoteapi;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    private final String[] quotes = {
        "Every expert was once a beginner.",
        "Small steps lead to big results.",
        "Learning happens by doing."
    };

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of("message", "DevOps project is running!");
    }

    @GetMapping("/quote")
    public Map<String, String> quote() {
        int index = ThreadLocalRandom.current().nextInt(quotes.length);
        return Map.of("quote", quotes[index]);
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }
}
