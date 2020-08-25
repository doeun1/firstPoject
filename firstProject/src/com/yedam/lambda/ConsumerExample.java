package com.yedam.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = (t) -> {
				//new Consumer<String>() {

			//@Override
			//public void 
			//accept(String t) {//구현할 메소드 : accept
			System.out.println(t+"님 반갑습니다.");
		};
		consumer.accept("최재영");
		
		BiConsumer<String, String> biCon = (a,b) ->{
			System.out.println(a+"는"+ b);
		};
		biCon.accept("사과", "맛있다");
		
		BiConsumer<Integer, Integer> biInt = (a, b) -> {
			System.out.println(a+"*"+b+"="+(a*b));
		};
		biInt.accept(24, 5);
	
	}
}
