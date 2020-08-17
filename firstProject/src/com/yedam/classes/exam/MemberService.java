package com.yedam.classes.exam;

public class MemberService {

	public boolean login(String id, String password,Member[] ms) {
		boolean result = false;
		for (int i = 0; i< ms.length; i++) {
			if(id.equals(ms[i].getId())&& password.equals(ms[i].getPassword())) {
				result= true;
				break;
			}else
				result=false;
		
		}
			
		/*if(id.contentEquals("뚫어뻥")&&password.equals("1234"))
			return true;
		else
			return false;*/
		return result;
	}

	public void logout(String id) {
		System.out.println("로그아웃");
	}
}
