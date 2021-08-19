package com.example.flimaair.entity;
import com.sun.istack.NotNull;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DataSensor  {
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private double temperature;
    private double humidity;
    private double gasSensor;




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getGasSensor() {
        return gasSensor;
    }

    public void setGasSensor(double gasSensor) {
        this.gasSensor = gasSensor;
    }
}
