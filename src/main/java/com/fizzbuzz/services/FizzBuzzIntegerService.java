package com.fizzbuzz.services;

import com.fizzbuzz.models.FizzBuzzInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class FizzBuzzIntegerService {
    private FizzBuzzIntegerDAO fizzBuzzIntegerDAO;

    @Autowired
    public FizzBuzzIntegerService(FizzBuzzIntegerDAO fizzBuzzIntegerDAO){
        this.fizzBuzzIntegerDAO = fizzBuzzIntegerDAO;
    }

    @Transactional
    public List<FizzBuzzInteger> getAll() {
        return fizzBuzzIntegerDAO.getAll();
    }

    @Transactional
    public FizzBuzzInteger getById(Integer id) {
        return fizzBuzzIntegerDAO.getById(id);
    }

    @Transactional
    public FizzBuzzInteger save(FizzBuzzInteger fizzBuzzInteger) {
        return fizzBuzzIntegerDAO.save(fizzBuzzInteger);
    }

    @Transactional
    public void delete(Integer id) {
        FizzBuzzInteger fizzBuzzInteger = fizzBuzzIntegerDAO.getById(id);
        if(fizzBuzzInteger == null) return;
        fizzBuzzIntegerDAO.delete(id);
    }

    @Transactional
    public List<String> generateFizzBuzzValues(Integer id) {
        FizzBuzzInteger fizzBuzzInteger = fizzBuzzIntegerDAO.getById(id);
        if(fizzBuzzInteger == null) return new ArrayList<>();
        return FizzBuzzUtil.createFizzBuzzList(fizzBuzzInteger.getIntegerValue());
    }

    @Transactional
    public Map<String, Long> generateFizzBuzzReport(Integer id) {
        FizzBuzzInteger fizzBuzzInteger = fizzBuzzIntegerDAO.getById(id);
        List<String> fizzBuzzList = FizzBuzzUtil.createFizzBuzzList(fizzBuzzInteger.getIntegerValue());
        return FizzBuzzUtil.createReport(fizzBuzzList);
    }
}
