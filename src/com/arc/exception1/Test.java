package com.arc.exception1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public void t1() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력해");
		int num = sc.nextInt();
		
		num = 100/num;
		
		System.out.println(num);
	}
}
