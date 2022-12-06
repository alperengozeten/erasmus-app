package com.erasmuarrem.ErasMove.controllers;

import com.erasmuarrem.ErasMove.models.Course;
import com.erasmuarrem.ErasMove.models.ExchangeUniversity;
import com.erasmuarrem.ErasMove.services.ExchangeUniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exchangeUniversity")
public class ExchangeUniversityController {

    private final ExchangeUniversityService exchangeUniversityService;

    @Autowired
    public ExchangeUniversityController(ExchangeUniversityService exchangeUniversityService) {
        this.exchangeUniversityService = exchangeUniversityService;
    }

    @GetMapping
    public List<ExchangeUniversity> getExchangeUniversities() {
        return exchangeUniversityService.getExchangeUniversities();
    }

    @GetMapping("/{id}")
    public ExchangeUniversity getExchangeUniversityByID(@PathVariable("id") Long id) {
        return exchangeUniversityService.getExchangeUniversityByID(id);
    }

    @GetMapping("/name/{name}")
    public ExchangeUniversity getExchangeUniversityByName(@PathVariable("name") String universityName) {
        return exchangeUniversityService.getExchangeUniversityByName(universityName);
    }

    @GetMapping("/country/{name}")
    public List<ExchangeUniversity> getExchangeUniversitiesByCountryName(@PathVariable("name") String countryName) {
        return exchangeUniversityService.getExchangeUniversitiesByCountryName(countryName);
    }

    @PostMapping("/rejectedCourses/{id}")
    public void addRejectedCourseByID(@RequestBody Course course, @PathVariable("id") Long exchangeUniversityID) {
        exchangeUniversityService.addRejectedCourseByID(course, exchangeUniversityID);
    }

    @PostMapping("/add")
    public void addExchangeUniversity(@RequestBody ExchangeUniversity exchangeUniversity) {
        exchangeUniversityService.addExchangeUniversity(exchangeUniversity);
    }

    @DeleteMapping("/{id}")
    public void deleteExchangeUniversityByID(@PathVariable("id") Long id) {
        exchangeUniversityService.deleteExchangeUniversityByID(id);
    }
}
