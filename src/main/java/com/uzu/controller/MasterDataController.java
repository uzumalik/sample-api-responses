package com.uzu.controller;

import com.uzu.model.response.Country;
import com.uzu.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Mohammad Uzair
 **/
@RestController
public class MasterDataController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public List<Country> getListOfCountries(){
        return countryService.getCountries();
    }
}
