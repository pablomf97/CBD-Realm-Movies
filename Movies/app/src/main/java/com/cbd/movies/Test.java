package com.cbd.movies;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import org.json.simple.parser.JSONParser;

public class Test {

    public static void main (String[] args) {

        try {
            OkHttpClient client = new OkHttpClient();
            MediaType mediaType = MediaType.parse("application/octet-stream");
            RequestBody body = RequestBody.create(mediaType, "{}");
            Request request = new Request.Builder()
                    .url("https://api.themoviedb.org/3/movie/500?api_key=fec8580348d9fddde0d7df6f24086685&language=en-US")
                    .get()
                    .build();

            Response response = client.newCall(request).execute();

            System.out.println(response.header("X-RateLimit-Limit"));

            JSONParser parser = new JSONParser();
            org.json.simple.JSONObject o = (org.json.simple.JSONObject) parser.parse(response.body().string());

            System.out.println(o.get("title"));

        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }
}