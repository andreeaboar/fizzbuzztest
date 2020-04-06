package com.fizzbuzz.controllers;

import com.fizzbuzz.models.FizzBuzzInteger;
import com.fizzbuzz.services.FizzBuzzIntegerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/fizzbuzzintegers")
public class FizzBuzzIntegerController {
    private FizzBuzzIntegerService fizzBuzzIntegerService;

    @Autowired
    public FizzBuzzIntegerController(FizzBuzzIntegerService fizzBuzzIntegerService) {
        this.fizzBuzzIntegerService  = fizzBuzzIntegerService;
    }

    @GetMapping
    public ResponseEntity<List<FizzBuzzInteger>> getAll() {
        return new ResponseEntity<>(fizzBuzzIntegerService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FizzBuzzInteger> getById(@PathVariable Integer id) {
        return new ResponseEntity<>(fizzBuzzIntegerService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<FizzBuzzInteger> save(@RequestBody FizzBuzzInteger fizzBuzzInteger) {
        return new ResponseEntity<>(fizzBuzzIntegerService.save(fizzBuzzInteger), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody FizzBuzzInteger fizzBuzzInteger) {
        FizzBuzzInteger toBeUpdatedFizzBuzzInteger = fizzBuzzIntegerService.getById(fizzBuzzInteger.getId());
        if(toBeUpdatedFizzBuzzInteger == null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        fizzBuzzIntegerService.save(fizzBuzzInteger);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@RequestBody FizzBuzzInteger fizzBuzzInteger) {
        FizzBuzzInteger toBeUpdatedFizzBuzzInteger = fizzBuzzIntegerService.getById(fizzBuzzInteger.getId());
        if(toBeUpdatedFizzBuzzInteger == null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        fizzBuzzIntegerService.delete(fizzBuzzInteger.getId());
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("{id}/generatefizzbuzz")
    public ResponseEntity<List<String>> generate(@PathVariable Integer id) {
        return new ResponseEntity<>(fizzBuzzIntegerService.generateFizzBuzzValues(id), HttpStatus.OK);
    }

    @GetMapping("{id}/report")
    public ResponseEntity<Map<String, Long>> report(@PathVariable Integer id) {
        return new ResponseEntity<>(fizzBuzzIntegerService.generateFizzBuzzReport(id), HttpStatus.OK);
    }
}
