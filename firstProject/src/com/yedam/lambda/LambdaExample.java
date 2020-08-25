package com.yedam.lambda;
//람다표현식: 
//추상 메소드가 두개일 경우,
//함수적 인터페이스 (functional interface)
//쓰는 이유 : ??????????????
interface MyFunctionalInterface {
	public void run(); //추상메소드
}
class MyFuncClass implements MyFunctionalInterface{
//추상메소드를 반드시 구현해야하는 의무가 있음
	@Override
	public void run() {//클래스를 정의 할때마다 런의 기능이 다름 그럴땐 ,...?
		System.out.println("ruuuuuuuuuuun.");		
	}
	
}
public class LambdaExample {
	public static void main(String[] args) {
//		MyFunctionalInterface myintf = new MyFuncClass();
//		MyFunctionalInterface myintf = new MyFunctionalInterface();
		MyFunctionalInterface myintf =() -> {
			System.out.println("runn.");
		};
		//MyFunctionalInterface가 반드시 구현해야하는 메소드는 run
/*삭제		@Override
		public void run()
		{
			System.out.println("runn.");
		};*/
		myintf.run();
		
		ShowContent sc =// new ShowContent() 

		/*	@Override
			public void show*/
			//(String content)//string 생략 
			(content) -> {
				System.out.println("내용은 "+content +" 입니다.");
			}
			
		;
		sc.show("바나나");
		
		
		ShowContent sc2 = new ShowContent() {

			@Override//익명의 구현객체를 만들겠다
			public void show(String content) {
				System.out.println("this is"+content);
				// TODO Auto-generated method stub
				
			}
			
		};
				
		
/*		ShowContent sc2 = (content) -> {
			System.out.println("this is"+ content);//this is 바나나
		};*/
		sc2.show("바나나");
		
		Calculate cal = (a,b) -> a+b;
		System.out.println("결과 : "+ cal.sum(10,5));
			
		
	}
}
