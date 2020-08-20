package com.yedam.collection;
//com.yedam.classes.exam.Member;인데 난 없음
//com.yedam.collection.Member;
public class Member {
	private String name;
	private int age;
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	//hashcode, equals 활용, 논리적으로 동일한 객체.
	//해쉬코드랑 이퀄즈 오버라이딩 부모는 오브젝트
	@Override
	public int hashCode() {//똑같은 문자열은 문자열로 해쉬코드,,어쩌고 저쩌고
		return this.age;
//		return this.name.hashCode();//이름만 같으면 같은 객체로 보겠다?아니 근데 이걸 여기서 본다고? 밑에가 아니고?
//		return this.age;
//		return age;
//		return 0;//모든 클래시스가 0을 호출?
		// TODO Auto-generated method stub
//		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Member mem= (Member) obj;
		return this.name.equals(mem.name);//이름만 같으면 같은 객체로 보겠다
		//		return true;
		// TODO Auto-generated method stub
//		return super.equals(obj);
	}
	
	
	
	
	
	
	
	
}
