package com.arc.io.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherMenu {

	private Scanner sc;
	private WeatherService ws;
	private WeatherView wv;

	public WeatherMenu() {
		sc = new Scanner(System.in);
		ws = new WeatherService();
		wv = new WeatherView();
		
	}//WeatherMenu

	public void start() {
		//1. 날씨 정보 초기화
		//2. 날씨 정보 전체 출력
		//3. 날씨 검색 출력
		//4. 날씨 정보 추가
		//5. 날씨 정보 삭제
		//6. 프로그램 종료
		boolean check = true;
		int select = 0;
		ArrayList<Weather> ar = null;
		
		while(check) {
			System.out.println("1. 날씨 정보 초기화");
			System.out.println("2. 날씨 정보 전체 출력");
			System.out.println("3. 날씨 검색 출력");
			System.out.println("4. 날씨 정보 추가");
			System.out.println("5. 날씨 정보 삭제");
			System.out.println("6. 프로그램 종료");
			select = sc.nextInt();

			switch(select) {
			case 1:
				ar = ws.init();
				break;

			case 2:
				wv.view(ar);
				break;

			case 3:

				break;

			case 4:

				break;

			case 5:

				break;
				
			case 6:
				check = false;
				break;

			default:
				System.out.println("잘못된 번호를 입력하셨습니다.");
				System.out.println("1~6 사이의 번호를 입력해주세요.");
				break;
			}//switch


		}//while


	}//start
}
