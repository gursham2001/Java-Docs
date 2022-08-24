package com.sparta.gs.pojo;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class App {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            ChuckNorrisPojo chuckNorrisPojo = mapper.readValue(new URL("https://api.chucknorris.io/jokes/random"),
                    ChuckNorrisPojo.class);
            System.out.println(chuckNorrisPojo.toString());
            System.out.println(chuckNorrisPojo.getIconUrl().contains("https"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
