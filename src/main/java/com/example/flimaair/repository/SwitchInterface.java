package com.example.flimaair.repository;

import com.example.flimaair.entity.DataSensor;
import com.example.flimaair.entity.Switch;

import java.util.List;

public interface SwitchInterface  {
    Switch getId(int id);
   List <Switch> getSwitch();
    Switch update(Switch sw);
}
