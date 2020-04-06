package com.fizzbuzz.services;

import com.fizzbuzz.models.FizzBuzzInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<FizzBuzzInteger> getAll() {
        return fizzBuzzIntegerDAO.getAll();
    }

    public FizzBuzzInteger getById(Integer id) {
        return fizzBuzzIntegerDAO.getById(id);
    }

    public FizzBuzzInteger save(FizzBuzzInteger fizzBuzzInteger) {
        return fizzBuzzIntegerDAO.save(fizzBuzzInteger);
    }

    public void delete(Integer id) {
        FizzBuzzInteger fizzBuzzInteger = fizzBuzzIntegerDAO.getById(id);
        if(fizzBuzzInteger == null) return;
        fizzBuzzIntegerDAO.delete(id);
    }

    public List<String> generateFizzBuzzValues(Integer id) {
        FizzBuzzInteger fizzBuzzInteger = fizzBuzzIntegerDAO.getById(id);
        if(fizzBuzzInteger == null) return new ArrayList<>();
        return FizzBuzzUtil.createFizzBuzzList(fizzBuzzInteger.getIntegerValue());
    }

    public Map<String, Long> generateFizzBuzzReport(Integer id) {
        FizzBuzzInteger fizzBuzzInteger = fizzBuzzIntegerDAO.getById(id);
        List<String> fizzBuzzList = FizzBuzzUtil.createFizzBuzzList(fizzBuzzInteger.getIntegerValue());
        return FizzBuzzUtil.createReport(fizzBuzzList);
    }
}
