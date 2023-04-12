package com.javalan.exception.pkg04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource { // class s

	public static void main(String[] args) { // main s

		FileReader reader = null;

		try {
			reader = new FileReader("c:/filetest/input.txt");	// 자원 오픈(open)
			int data;
			while ((data = reader.read()) != -1) {
				System.out.print((char) data);		// int타입을 -> char타입으로 변환
			}
		} catch (FileNotFoundException f) {
			System.out.println("파일이 존재하지 않거나 경로가 잘못되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // main e

} // class e
