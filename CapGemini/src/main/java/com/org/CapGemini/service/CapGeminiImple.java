package com.org.CapGemini.service;

import com.org.CapGemini.module.CapGemini;
import com.org.CapGemini.repository.CapGeminiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class CapGeminiImple implements CapGeminiService
{
    @Autowired
    CapGeminiRepository capGeminiRepository;
    @Override
    public void create(CapGemini c)
    {
        capGeminiRepository.save(c);
    }

    @Override
    public String getByAdd(String address) {
        List<CapGemini>l= capGeminiRepository.findAll(address);
        return address;
    }


    @Override
    public void update(CapGemini c)
    {
        capGeminiRepository.save(c);
    }

    @Override
    public void deleteById(Integer id)
    {
        capGeminiRepository.deleteById(id);
    }
}
