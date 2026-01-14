package com.informaticonfig.spring.heidydf;

import com.informaticonfig.spring.heidydf.entity.MemoryEntity;
import com.informaticonfig.spring.heidydf.repository.RepoMemory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class HeidyDfApplication implements CommandLineRunner {

    @Autowired
    RepoMemory repoMemory;
    public static void main(String[] args) {
        SpringApplication.run(HeidyDfApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("App iniciada correctamente");
        List<MemoryEntity> memory = repoMemory.findAll();
        memory.stream().forEach(System.out::println);
    }
}
