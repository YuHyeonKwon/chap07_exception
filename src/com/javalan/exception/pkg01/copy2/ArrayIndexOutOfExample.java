package com.javalan.exception.pkg01.copy2;
/**
 * 실행 예외(Runtime Exception) 테스트 클래스
 * - ArrayIndexOutOfBoundException: 존재하지 않는 배열 인덱스 참조
 */
public class ArrayIndexOutOfExample { // class s
	
	public static void main(String[] args) { // main s
		
		String[] arrStr = new String[2];
		arrStr[0] = "hi java";
		arrStr[1] = "hi javascript";
		
		System.out.println(arrStr[1]);
//		System.out.println(arrStr[2]);	// 인덱스에 없는 값 ArrayIndexOutOfBoundException 
		
		// 교수 객체 저장용 배열 선언
		Professor[] profs = new Professor[2];
		profs[0] = new Professor(50);
		profs[1] = new Professor(55);
		
		// 배열의 크기를 +1 : ArrayIndexOutOfBoundException
		for (int i = 0; i < profs.length; i++) {
			System.out.println(profs[i].age);
		}
	} // main e

} // class e

// 교수 클래스
class Professor {
	//필드
	public int age = 10;
	
	// 기본생성자
	 Professor() {
	}
	
	// 오버로딩 생성자
	 Professor(int age) {
		this.age = age;
	}
}
