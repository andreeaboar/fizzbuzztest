package com.fizzbuzz.services;

import com.fizzbuzz.models.FizzBuzzInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class FizzBuzzIntegerDAO {
    private  EntityManager entityManager;

    @Autowired
    public FizzBuzzIntegerDAO (EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<FizzBuzzInteger> getAll() {
        Query query = entityManager.createQuery("from FizzBuzzInteger");
        List<FizzBuzzInteger> fizzBuzzIntegers = query.getResultList();
        return fizzBuzzIntegers;
    }

    public FizzBuzzInteger getById(Integer id) {
        return entityManager.find(FizzBuzzInteger.class, id);
    }

    public FizzBuzzInteger save(FizzBuzzInteger fizzBuzzInteger) {
        FizzBuzzInteger savedFizzBuzzInteger = entityManager.merge(fizzBuzzInteger);
        return savedFizzBuzzInteger;
    }

    public void delete(Integer id) {
        Query query = entityManager.createQuery("delete from FizzBuzzInteger where id=:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}
