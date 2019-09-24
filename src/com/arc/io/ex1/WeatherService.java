package com.arc.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WeatherService {

	public void init() {
		//날씨 정보 초기화
		//weatherInfo.txt 읽어서
		//파싱, 객체를 모아서 리턴
		File file = new File("C:\\test", "weatherInfo.txt");
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			boolean check = true;

			while(check) {
				String str = br.readLine();
				if(str==null) {
					break;
				}
				System.out.println(str);
			}//while
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




	}//init
}
