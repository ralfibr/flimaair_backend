package com.example.flimaair.repository;

import com.example.flimaair.entity.DataSensor;
import com.example.flimaair.entity.Switch;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@Repository
public class SwitchRepository implements SwitchInterface {


    @PersistenceContext
    EntityManager em;


    @Override
    public Switch getId(int id) {
        Switch sw = em.find(Switch.class,id);
        if(sw == null){
            throw new NullPointerException("No datasensor with this id");
        }else {
            return sw;
        }
    }

    @Override
    public List<Switch> getSwitch() {
        TypedQuery<Switch> query = em.createQuery("SELECT p FROM Switch p",Switch.class);
        return  query.getResultList();
    }

    @Override
    @Transactional
    public Switch update(Switch sw) {
        return  em.merge(sw);
    }
}
