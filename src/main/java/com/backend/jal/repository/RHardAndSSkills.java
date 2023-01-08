package com.backend.jal.repository;

import com.backend.jal.entity.HardAndSSkills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RHardAndSSkills extends JpaRepository<HardAndSSkills, Integer>{
    Optional<HardAndSSkills> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
