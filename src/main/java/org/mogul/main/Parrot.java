package org.mogul.main;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Parrot {
    private String name;
    // Omitted getters and setters
    @PostConstruct
    public void init() {
        this.name = "Kiki";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
