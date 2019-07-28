package com.samples.restclient.services;

import com.samples.restclient.json.JokeResponse;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JokeService {

    private static final String BASE = "http://api.icndb.com/jokes/random?limitTo=[nerdy]";

    private RestTemplate restTemplate;

    public JokeService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String getJoke(String firstName, String lastName) {
        String url = String.format("%s&firstName=%s&lastName=%s", BASE, firstName, lastName);

        JokeResponse response = restTemplate.getForObject(url, JokeResponse.class);
        String output = null;
        if (response != null) {
            output = response.getValue().getJoke();
        }
        return output;
    }

}