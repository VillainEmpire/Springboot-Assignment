package com.geekster.weatherApplication;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import  java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherApplication {

	public static void main(String[] args) throws Exception {
		URL getUrl = new URL("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current_weather=true");
		HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();

		connection.setRequestMethod("GET");
		int responseCode = connection.getResponseCode();

		if(responseCode == HttpURLConnection.HTTP_OK) {
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuffer jsonResponseData = new StringBuffer();
			String readLine = null;

			while ((readLine = in.readLine()) != null) {
				jsonResponseData.append(readLine);
			}
			in.close();
			JSONObject masterData =  new JSONObject(jsonResponseData.toString());
			JSONObject weather = (JSONObject) masterData.get("current_weather");


			System.out.println("current weather : " +weather.get("temperature") );
		}
		else{
			System.out.println("This is not valid URL "+responseCode);
		}
	}

}
