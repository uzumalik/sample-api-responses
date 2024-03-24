package com.uzu.service;

import com.uzu.model.response.Country;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mohammad Uzair
 **/
@Service
public interface CountryService {

    List<Country> getCountries();
}
