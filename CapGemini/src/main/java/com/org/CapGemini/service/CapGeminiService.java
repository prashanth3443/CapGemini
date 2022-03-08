package com.org.CapGemini.service;

import com.org.CapGemini.module.CapGemini;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public interface CapGeminiService
{
    public void create(@RequestBody CapGemini c);

    public String getByAdd(String address);
    public void update(@RequestBody CapGemini c);
    public void deleteById(@PathVariable Integer id);
}
