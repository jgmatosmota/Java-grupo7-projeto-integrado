package com.mycompany.jframe.hemera.tech.slack;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;

public class Slack {
    static SlackChaveB chave = new SlackChaveB();

    private static HttpClient client = HttpClient.newHttpClient();
    private static final String webhook = chave.getChave();

    public static void sendMessage(JSONObject content) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder(URI.create(webhook))
                .header("accept", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(content.toString()))
                .build();


        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            //System.out.println(String.format("Status: %s", response.statusCode()));
            //System.out.println(String.format("Response: %s", response.body()));

        }

    }

