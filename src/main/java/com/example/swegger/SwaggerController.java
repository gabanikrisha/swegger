package com.example.swegger;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class SwaggerController
{
    private List<String> patients = new ArrayList<>(List.of("Ram", "Shyam", "Sita"));

    @GetMapping
    public List<String> getPatients() {
        return List.of("Ram", "Shyam", "Sita");
    }

//    @PutMapping("/{index}")
//    public String updatePatient(@PathVariable int index, @RequestBody String newName) {
//        if (index < 0 || index >= patients.size()) {
//            return "Invalid patient index: " + index;
//        }
//        patients.set(index, newName);
//        return "Patient updated successfully to: " + newName;
//    }
}
