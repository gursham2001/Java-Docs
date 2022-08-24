package com.sparta.gs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiTesting {

    // HttpRequest, HttpClient, HttpResponse
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient(); // newHttpClient - returns new http client with defualt settings
        // we can use builder to make our own

        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create("https://api.chucknorris.io/jokes/random"))
                .build();

        try {
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            System.out.println(response.statusCode()); returns status code
//            System.out.println(response.headers().toString()); gives back headers as a string
            System.out.println(response);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        // first thing it sends is the request obj (url etc) and the second is th ebody handler
    }
}
