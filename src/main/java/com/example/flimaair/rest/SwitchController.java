package com.example.flimaair.rest;

import com.example.flimaair.entity.DataSensor;
import com.example.flimaair.entity.Switch;
import com.example.flimaair.repository.SwitchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SwitchController {

    @Autowired
    SwitchRepository switchRepository;
    @RequestMapping("/switch")
    @GetMapping("/switch")
    public List<Switch> getSwitch(){
        return  switchRepository.getSwitch();
    }
    @PostMapping("/switch")
    public Switch update(@RequestBody Switch sw){
        return switchRepository.update(sw);
    }
}
