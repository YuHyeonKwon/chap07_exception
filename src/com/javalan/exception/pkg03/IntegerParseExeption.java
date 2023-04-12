package com.javalan.exception.pkg03;
/**
 * 다음 예외 처리 ( 두 가지 이상의 실행 예외 처리 )
 *  - ArrayIndexoutOfBoundsException 예외처리
 *  - Integer.parseInt 예외 처리
 *  - Exception은 예외의 최고 조상으로 모든 예외 처리 가능함.
 */
public class IntegerParseExeption { // class s

	public static void main(String[] args) { // main s

		String[] array = { "100", "1oo" };

		for (int i = 0; i < array.length; i++) { // Array length 초과
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]: " + value);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("예외의 최고 조상 내가 다 잡는다.");
			} finally {
				System.out.println("다시 실행하세요.");
			}
		}

	} // main e

} // class e
