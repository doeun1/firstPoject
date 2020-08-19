package com.yedam.interfaces;

/*class Anonymous{
	void run() {
		System.out.println("실행.");
	}
}
class chileAnonymous extends AnonymousExample {
	
}
interface AnonymInterface {
	void run();
}

public class AnonymousExample{
	public static void main(String[] args) {
		AnonymInterface anonymIntf = new AnonymInterface() {
			
		};
		anonymIntf.run();
		
		AnonymousExample anonym = new AnonymousExample() {//anonymous는 부모클래스
			String str;
			
			
			
		};
	}
}*/

class Anonymous {
   void run() {
      System.out.println("실행");
   }
}

class ChildAnonymous extends Anonymous {
   
}

interface AnonymInterface {
   void run();
}

public class AnonymousExample {
   public static void main(String[] args) {
      AnonymInterface anonymintf = new AnonymInterface() {//익명의 구현객체

         @Override
         public void run() {
        	 System.out.println("자식 구현 객체 실행");
         }
         
      };
      
      Anonymous anonym = new Anonymous() {//anonymous는 부모클래스
         String str;
                  
         @Override
         void run() {
            System.out.println("자식 실행");
         }
         
      };
      anonym.run();
   }
}
