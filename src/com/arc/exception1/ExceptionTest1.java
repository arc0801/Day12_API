package com.arc.exception1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세욤");
		int age = 0;
		try {
			age = sc.nextInt();
			//throw new InputMismatchException();  // -> 오류 발생 시 자동 생성
			ArrayList<String> ar = new ArrayList<String>();
			
			age = 5/age;
			//throw new ArithmeticException();
			System.out.println(ar.get(1));
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("숫자만 입력하세요");
		}//catch (ArithmeticException a) {
		//	System.out.println("0으로는 나눌 수 없어요");
		//}
		
		/*
		try {
		// 예외가 발생할 수 있을 것 같은 것들을 try {} 안에 넣어준다
			age = sc.nextInt();
			age = 5/age;
		}catch(Exception e) {
		// 예외 발생 시 처리하기 위한 실행코드
			System.out.println("예외 발생");
		}
		 */

		System.out.println("Age : " +age);

	}//main

}
