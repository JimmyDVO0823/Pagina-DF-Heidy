package com.informaticonfig.spring.heidydf.repository;


import com.informaticonfig.spring.heidydf.entity.MemoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoMemory extends JpaRepository<MemoryEntity, Long> {

}