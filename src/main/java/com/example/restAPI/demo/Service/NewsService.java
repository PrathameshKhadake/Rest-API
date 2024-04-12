package com.example.restAPI.demo.Service;

import com.example.restAPI.demo.DTO.NewResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    @Autowired
    RestTemplate restTemplate;

//    https://newsapi.org/v2/everything?q=bitcoin&apiKey=9461b0630ccb48db807ec219d57c7973
    String baseURL = "https://newsapi.org/v2/everything?q=";
    public Object getNews(String countryCode, String apiKey) {

        String URL = prepareURL(countryCode, apiKey);

        NewResponse response = restTemplate.getForObject(URL, NewResponse.class);
        return response;

    }

    public String prepareURL(String countryCode, String apiKey){
        return baseURL + countryCode + '&' + "apiKey=" + apiKey;
    }
}
