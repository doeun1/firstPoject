package com.yedam.database;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpMain { // 메인 메소드를 가지는 클래스
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);//
		EmpService service = new EmpServiceImp1(); //호출
		
		while(run) {
			System.out.println("*******************************");
			System.out.println("1.리스트 2.입력 3.수정 4.삭제 9.종료");
			System.out.println("*******************************");
			System.out.print("선택 > ");//
			int selectNo = -9;
			
			try {
				selectNo=scn.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("숫자로 입력하기");
				scn.nextLine();
				continue;
			} 
			
			if(selectNo == 1) {//전체 리스트 가져오기
				//EmpDAO dao = new EmpDAO();
				Employee[] emps = service.showList();
				for (Employee emp:emps) {
					if(emp != null)
					System.out.println(emp);
				}
			}else if(selectNo == 2) {//사원번호 , 이름, 이메일, 입사일, 잡아이디
				System.out.println("사원번호 입력: ");
				int aa = scn.nextInt(); scn.nextLine();
				System.out.println("이름 입력: ");
				String bb = scn.nextLine();
				System.out.println("이메일 입력 :");
				String cc = scn.nextLine();
				System.out.println("입사일 입력 : ");
				String dd = scn.nextLine();
				System.out.println("업무 입력 : ");
				String ee = scn.nextLine();
				
				
				
			//	EmpDAO dao = new EmpDAO();
				
				Employee emp = new Employee();
				emp.setEmployeeId(aa);
				emp.setLastName(bb);
				emp.setEmail(cc);
				emp.setHireDate(dd);                                  
				emp.setJobId(ee);
			//	dao.addEmployee(emp);
				service.addEmp(emp);
			}else if(selectNo == 3) {//수정하기
				System.out.println("사원 수정하기");
				int upe = scn.nextInt();
				System.out.println("연봉 수정하기");
				int ups = scn.nextInt();
//				EmpDAO dao = new EmpDAO();
//				dao.updateEmp(ups, upe);
				Employee emp = new Employee();
				service.modEmp(emp);
				
			}else if(selectNo == 4) {//삭제하기(EmpDAO 클래스 참조하여 삭제)
				System.out.println("id 삭제 : ");
				int delId = scn.nextInt(); scn.nextLine();
//				EmpDAO dao = new EmpDAO();
//				dao.removeEmp(delId);
				service.delEmp(delId);
				
			}else if(selectNo == 9) {
				run=false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
