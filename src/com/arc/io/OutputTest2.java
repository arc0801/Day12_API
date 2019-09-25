package com.arc.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class OutputTest2 {

	public static void main(String[] args) {
		//c:\test\t2.txt
		//q나 Q를 입력하면 종료
		Scanner sc = new Scanner(System.in);
		File file = new File("c:\\test", "t2.txt");
		FileWriter fw = null;


		try {
			fw = new FileWriter(file, true);
			boolean check = true;

			while(check) {
				System.out.println("저장할 내용을 입력하세요");
				String str = sc.next(); //스페이스바 이전까지의 내용 가저감 cf>nextLine()

				if(str.toUpperCase().equals("q")) {
					break;
				}//if

				fw.write(str+"\r\n");
				fw.flush();
			}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}//main
}
