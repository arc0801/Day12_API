package com.arc.io.ex1;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherMenu wm = new WeatherMenu();
		//wm.start();
		WeatherService ws = new WeatherService();
		ws.init();
	}
}
