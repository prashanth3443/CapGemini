package com.org.CapGemini.controller;

import com.org.CapGemini.module.CapGemini;
import com.org.CapGemini.service.CapGeminiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/capgemini.com")
public class CapGeminiController
{
    @Autowired(required = true)
    CapGeminiService capGeminiService;
    @PostMapping("/create")
    public void create(@RequestBody CapGemini c)
    {
        capGeminiService.create(c);
    }
    @GetMapping("/getByAdd/{address}")
    public String getByAdd( String address) {
       String l=capGeminiService.getByAdd(address);
        return address;
    }
    @PutMapping("/update")
    public void update(@RequestBody CapGemini c)
    {
        capGeminiService.update(c);
    }
    @DeleteMapping("/deleteById/{Id}")
    public void deleteById(@PathVariable Integer id)
    {
        capGeminiService.deleteById(id);
    }
}
