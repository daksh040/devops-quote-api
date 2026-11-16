package com.example.quoteapi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuoteControllerTest {

    private final QuoteController controller = new QuoteController();

    @Test
    void homeReturnsWelcomeMessage() {
        assertEquals(
            "DevOps project is running!",
            controller.home().get("message")
        );
    }

    @Test
    void quoteReturnsOneOfTheConfiguredQuotes() {
        var validQuotes = java.util.Set.of(
            "Every expert was once a beginner.",
            "Small steps lead to big results.",
            "Learning happens by doing."
        );

        assertTrue(validQuotes.contains(controller.quote().get("quote")));
    }

    @Test
    void healthReturnsUp() {
        assertEquals("UP", controller.health().get("status"));
    }
}
