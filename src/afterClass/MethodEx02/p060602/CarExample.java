package afterClass.MethodEx02.p060602;

public class CarExample {
	public static void main(String[] args) {
		
		//객체 생성
		Car myCar = new Car();
		
		
		System.out.println(myCar.Car("현대", "기차","색간빨"));
		
		//필드값 읽기
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		
		
		
		myCar.speed = 60;
		System.out.println("수정속도: " + myCar.speed);
		
		
		
	}
}
