package com.org.CapGemini.repository;

import com.org.CapGemini.module.CapGemini;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CapGeminiRepository extends CrudRepository<CapGemini,Integer>
{

    List<CapGemini> findAll(String s);
}
