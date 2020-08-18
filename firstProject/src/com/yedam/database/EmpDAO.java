package com.yedam.database;

/*import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;*/
import java.sql.*;//sql의 모든 걸 임포트 해주겠다

public class EmpDAO {
//입력
	public void addEmployee(Employee emp) {
		Connection conn = DBConnection.getConnection();// 필드안에 카피해도 되지만 클래스 바로 밑에 입력하면 모든 필드 적용됨
//		insert into emp_temp(employee_id, last_name, email, hire_date, job_id)
//		values (301, 'test', 'test', '2020-05-05', 'IT_PROG')//↓여기에 이거랑 똑같이 만들어야함
		String sql = "insert into emp_temp(employee_id, last_name, email, hire_date, job_id)" 
				+ "values("
				+ emp.getEmployeeId() + 
				",\'"+ emp.getLastName() 
				+ "',\'" + emp.getEmail() 
				+ "',\'" + emp.getHireDate() 
				+ "',\'" + emp.getJobId() + "\')";// employee_id, last_name, email, hire_date, job_id 이 다섯개의 항목은 꼭 들어가야 에러가 안남
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r+"건 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateEmp(int ups, int upe) {
		Connection conn = DBConnection.getConnection();
		String upd= "update emp_temp set salary="+ups+"where employee_id="+upe;
		System.out.println(upd);
		
		try {
			PreparedStatement psmt = conn.prepareStatement(upd);
			int r = psmt.executeUpdate();
			System.out.println(r+"건 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void removeEmp(int aa) {//삭제하기
		
		Connection conn = DBConnection.getConnection();
		String del= "delete from emp_temp where employee_Id="+ aa;
		System.out.println(del);
		
		
		
		try {
			PreparedStatement psmt = conn.prepareStatement(del);
			int r = psmt.executeUpdate();
			System.out.println(r+"건 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Employee[] getEmpList() {
		Connection conn = DBConnection.getConnection();
		Employee[] employees = new Employee[100];// 나중엔 배열안씀 ㅠㅠ 배열도 이해못했는데,,,,,,,,,ㅠㅠㅠㅠ
		try {
			String sql = "select * from emp_temp";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int idx = 0;
			while (rs.next()) {// 여기 안에서 돌면서 배열에 하나하나 넣을거임
				Employee emp = new Employee();// 에러난 이유는 메인값이 없는 ? 기본 생성자를 안만들어줘서 그럼
				String firstName = rs.getString("first_name");
				emp.setFirstName(firstName);// 이렇게 해도 되지만
				emp.setLastName(rs.getString("last_name"));// 이렇게 해도 됨? 망했다,,,
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setEmail(rs.getString("email"));
				emp.setJobId(rs.getString("job_id"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setPhoneNumber(rs.getString("phone_number"));

				employees[idx++] = emp;
			}
			System.out.println("--end of data--");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;// 배열 반환,,,ㅠㅠ//에러 이유: 임플로이즈라는 변수가 변수로 이해가 안되서 ?
	}// end of getEmpList()

//	public static void main(String[] args) {
//		DBConnection dbCon = new DBConnection();
//		Connection conn= DBConnection.getConnection();//static 타입이라서 바로 호출 가능?
	/*
	 * try { String sql = "select * from emp_temp"; PreparedStatement pstmt =
	 * conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery();
	 * while(rs.next()) { System.out.println(rs.getString("first_name") +","+
	 * rs.getString("last_name") +","+rs.getString("email") +","+rs.getInt("salary")
	 * ); } System.out.println("--end of data--"); } catch (SQLException e) { //
	 * TODO Auto-generated catch block e.printStackTrace(); }
	 */
//		System.out.println("프로그램 종료.");
//	}//end of main()
}// end of class
