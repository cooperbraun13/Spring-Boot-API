package com.coopcode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(
                        "js, node, react, tailwindcss",
                        "James",
                        1
                ),
                new SoftwareEngineer(
                        "java, spring, spring boot",
                        "Jamila",
                        1
                )
        );
    }

}
