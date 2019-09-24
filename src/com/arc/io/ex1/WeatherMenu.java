package com.arc.io.ex1;

import java.util.Scanner;

public class WeatherMenu {

	private Scanner sc;

	public WeatherMenu() {
		sc = new Scanner(System.in);
	}//WeatherMenu

	public void start() {
		//1. 날씨 정보 초기화
		//2. 날씨 정보 전체 출력
		//3. 날씨 검색 출력
		//4. 날씨 정보 추가
		//5. 날씨 정보 삭제
		//6. 프로그램 종료
		boolean check = true;
		while(check) {
			System.out.println("1. 날씨 정보 초기화");
			System.out.println("2. 날씨 정보 전체 출력");
			System.out.println("3. 날씨 검색 출력");
			System.out.println("4. 날씨 정보 추가");
			System.out.println("5. 날씨 정보 삭제");
			System.out.println("6. 프로그램 종료");
			int select = sc.nextInt();

			switch(select) {
			case 1:

				break;

			case 2:

				break;

			case 3:

				break;

			case 4:

				break;

			case 5:

				break;

			default:

			}//switch


		}//while


	}//start
}
