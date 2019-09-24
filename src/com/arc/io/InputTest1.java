package com.arc.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputTest1 {

	public static void main(String[] args) {
		System.out.println("한글자 입력");
		InputStream io = System.in; //byte
		InputStreamReader ir = new InputStreamReader(io); //char
		BufferedReader br = new BufferedReader(ir);
		
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
		try {
			int num = ir.read();
			char ch = (char)num;
			System.out.println(ch);
		} catch (IOException e) {
			
		}
	}

}
