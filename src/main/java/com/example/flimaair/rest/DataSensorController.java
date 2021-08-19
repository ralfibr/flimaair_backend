package com.example.flimaair.rest;

import com.example.flimaair.entity.DataSensor;
import com.example.flimaair.entity.Switch;
import com.example.flimaair.repository.DataSensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class DataSensorController {

    @Autowired
DataSensorRepository dataSensorRepository;
    @RequestMapping("/datasensor")
    @GetMapping("/datasensor")
    public List<DataSensor> getAllData(){
        return dataSensorRepository.getDataSensor();
    }

    @PostMapping("/datasensor")
    public DataSensor addDataSensor(@RequestBody DataSensor dataSensor){
        return dataSensorRepository.addDataSensor(dataSensor);
    }


}
