package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {
    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineers() {
        List<SoftwareEngineer> swes = List.of(
                new SoftwareEngineer(1,"Jhon Smith", "Nextjs-Java-Postgress"),
                new SoftwareEngineer(2,"Alex Bones", "python-SQL-Tableau"),
                new SoftwareEngineer(3,"Max Willo", "Docker-Kubernetes-AWS-Azure"),
                new SoftwareEngineer(4,"Katerine ShapeWill", "React-nodejs-Nextjs-Tallwindcss-vercel")
        );

        return swes;
    }
}
