package com.arc.io;

import java.io.File;

public class FileTest3 {

	public static void main(String[] args) {
		File file = new File("c:\\test\\sub1");

		//String [] ar = file.list();
		File [] ar = file.listFiles();

		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}

		for(int i=0;i<ar.length;i++) {
			ar[i].delete();

			//file = new File("c:\\test\\sub1\\"+ar[i]);

			//file.delete();
		}

	}//main

}
