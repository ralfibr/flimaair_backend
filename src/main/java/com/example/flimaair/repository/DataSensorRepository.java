package com.example.flimaair.repository;

import com.example.flimaair.entity.DataSensor;
import com.sun.tools.jconsole.JConsolePlugin;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@Repository
public class DataSensorRepository implements DataSensorRepositoryInterface {

    @PersistenceContext
    EntityManager em;


    @Override
    public DataSensor getId(int id) {
        DataSensor dataSensor = em.find(DataSensor.class,id);
        if(dataSensor == null){
            throw new NullPointerException("No datasensor with this id");
        }else {
            return dataSensor;
        }
    }

    @Override
    public List<DataSensor> getDataSensor() {
        TypedQuery<DataSensor> query = em.createQuery("SELECT p FROM DataSensor p",DataSensor.class);
        return query.getResultList();

    }

    @Override
    @Transactional
    public DataSensor addDataSensor(DataSensor dataSensor) {
      return   em.merge(dataSensor);
    }
}
