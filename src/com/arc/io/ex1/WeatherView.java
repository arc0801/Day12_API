package com.arc.io.ex1;

import java.util.ArrayList;

public class WeatherView {
	/*
	public static void main(String[] args) {
		int [] a = {10, 30, 60, 55};
		for(int n:a) {
			
		}
	}
	*/
	
	public void view(ArrayList<Weather> ar) {
		//향상된 for문
		//for(저장된 DataType 변수명 : collection의 변수명){}
		for(Weather weather:ar) {
			System.out.println(weather.getCity());
			System.out.println(weather.getGion());
			System.out.println(weather.getHumidity());
			System.out.println(weather.getStaus());
		}
		
		
	}
}
