package com.example.swegger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class SwaggerController
{
    @GetMapping
    public List<String> getPatients() {
        return List.of("Ram", "Shyam", "Sita");
    }
}
