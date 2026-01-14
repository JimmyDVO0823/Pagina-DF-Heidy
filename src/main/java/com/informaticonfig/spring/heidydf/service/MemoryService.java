package com.informaticonfig.spring.heidydf.service;

import com.informaticonfig.spring.heidydf.entity.MemoryEntity;
import com.informaticonfig.spring.heidydf.repository.RepoMemory;
import org.springframework.stereotype.Service;

@Service
public class MemoryService {
    private final RepoMemory repo; //Inyeccion

    //Inyeccion por constructor. Gracias a spring solo se inyecta la interfaz
    public MemoryService(RepoMemory repo) {
        this.repo = repo;
    }

    public void saveMemory(MemoryEntity memory) {
        repo.save(memory);
    }

}
