package com.arc.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class WeatherService {

	public static void main(String[] args) {
		WeatherService ws = new WeatherService();
		ws.init();
	}

	public ArrayList<Weather> init() {
		ArrayList<Weather> ar = new ArrayList<Weather>();
		//날씨 정보 초기화
		//weatherInfo.txt 읽어서
		//파싱, 객체를 모아서 리턴
		File file = new File("C:\\test", "weatherInfo.txt");
		//System.out.println(file.exists());
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(file); //한글자만 불러오기때문에 사용하기 불편
			br = new BufferedReader(fr); //그래서 보조하기 위한 것

			boolean check = true;
			//String str = null;

			while(check) {
				//while((str=br.readLine())!= null)
				String str = br.readLine();
				if(str==null) {
					break;
				}
				Weather weather = new Weather();
				String [] w = str.split(",");
				weather.setCity(w[0].trim());
				weather.setGion(Double.parseDouble(w[1].trim()));
				weather.setHumidity(Integer.parseInt(w[2].trim()));
				weather.setStaus(w[3].trim());

				/*
				StringTokenizer st = new StringTokenizer(str, ",");

				while(st.hasMoreTokens()){  
				-> 한 줄에서 한 개의 정보만 얻으면 되기때문에 while이 필요없다
					한 줄에서 여러 개의 정보를 얻어야하면 while 써야 함
				weather.setCity(st.nextToken().trim());
				weather.setGion(Double.parseDouble(st.nextToken().trim()));
				weather.setHumidity(Integer.parseInt(st.nextToken().trim()));
				weather.setStaus(st.nextToken().trim());
				 */
				ar.add(weather);
				/*
					System.out.println(weather.getCity());
					System.out.println(weather.getGion());
					System.out.println(weather.getHumidity());
					System.out.println(weather.getStaus());
				 */
				//}

				//System.out.println(str);
			}//while
			for(int i=0;i<ar.size();i++) {
				System.out.println(ar.get(i).getCity());
				System.out.println(ar.get(i).getGion());
				System.out.println(ar.get(i).getHumidity());
				System.out.println(ar.get(i).getStaus());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//try

		return ar;


	}//init
}
