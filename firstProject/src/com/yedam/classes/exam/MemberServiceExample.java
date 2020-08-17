package com.yedam.classes.exam;

public class MemberServiceExample {

	public static void main(String[] args) {
		//db
		Member[] members = new Member[3];
		members[0] = new Member("홍길동","hong");
		members[0].setPassword("hong123");
		members[1] = new Member("김유신","kim");
		members[1].setPassword("kim123");
		members[2] = new Member("김도은","뚫어뻥");
		members[2].setPassword("1234");

		
		
		//로그인 정보
		Member mem1 = new Member("홍", "hong");
		mem1.setPassword("12345");
		
		MemberService mService= new MemberService();
		boolean result = mService.login(mem1.getId(), mem1.getPassword(), members);
		if(result) {
			System.out.println(mem1.getName() + "님 로그인 되었습니다.");
		} else {
			System.out.println("id 또는 password를 확인하세요.");
		}
	}//login 반환해주는 값이 boolean타입

}
