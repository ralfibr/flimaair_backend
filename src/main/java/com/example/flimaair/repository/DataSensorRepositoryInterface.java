package com.example.flimaair.repository;

import com.example.flimaair.entity.DataSensor;

import java.util.List;

public interface DataSensorRepositoryInterface {
    DataSensor getId(int id);
    List<DataSensor> getDataSensor();
    DataSensor addDataSensor(DataSensor project);
}
