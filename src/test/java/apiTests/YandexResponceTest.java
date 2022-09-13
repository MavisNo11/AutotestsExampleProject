package apiTests;

import io.netty.handler.codec.http.DefaultHttpRequest;
import io.netty.handler.codec.http.HttpRequest;
import org.json.JSONObject;
import org.junit.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class YandexResponceTest {

    @Test
    public void checkResponse200Test() {


        try {
            URL url = new URL("https://google.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoOutput(true);

            JSONObject json;
            try (OutputStream out = connection.getOutputStream()) {
                json = new JSONObject(out);
            }
        }
        catch (Exception e) {}





    }
}
