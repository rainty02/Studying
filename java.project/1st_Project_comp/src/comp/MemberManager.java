package comp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MemberManager {
/*
	MemberManager 클래스 정의 (메소드기능 - Dao)
	1. 전체 멤버리스트 출력 (관리자용) - MemberDao.getList		
	2. 내 정보 출력 (회원용) - MemberDao.getList		
	3. 아이디 중복체크 (회원가입시) - MemberDao.chKId			
	4. 회원가입, 수정시 비밀번호 일치여부 
	5. 멤버 데이터 입력(회원가입) - MemberDao.chKOverlap, MemberDao.insertMem			
	6. 내 정보 수정 (회원용) -	MemberDao.editMem				
	7. 회원 탈퇴 (회원용) - MemberDao.deleteMem				
	8. 관리자 정보 조회 (관리자용) - MemberDao.getAdminList		
	9. 관리자 비밀번호 재설정 (관리자용) - MemberDao.editAdminMem
*/	
	
	private MemberDao dao;
	private Scanner sc;

	// 객체 생성
	private Connection con = null;

	// 연결
	private String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String pw = "tiger";

	public MemberManager(MemberDao dao) {
		this.dao = dao;
		sc = new Scanner(System.in);
		//		this.currentId = currentId;
	}

	// 1. 전체 리스트 출력 (관리자용)
	void memList() {
		try {
			con = DriverManager.getConnection(jdbcUrl, user, pw);
			List<Member> list = dao.getList(con);

			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■ 고객 정보 리스트 ■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("멤버코드\t아이디\t비밀번호\t이름\t전화번호\t\t주소\t포인트");
			for (Member mem : list) {
				System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\t%d\n", mem.getMemcode(), mem.getId(),
						mem.getPw(), mem.getName(), mem.getPhone(), mem.getAddress(), mem.getPoint());
			}
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 2. 내 정보 출력 (회원용)
	// 매개변수 - Login 클래스 : currentId
	void myInfo(String currentId) {
		try {
			con = DriverManager.getConnection(jdbcUrl, user, pw);

			List<Member> list = dao.getList(con, currentId);

			System.out.println("■■■■■■■■■■■■■■■■■■■■■■고객 정보 리스트■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("아이디\t비밀번호\t이름\t전화번호\t\t주소\t포인트");
			for (Member mem : list) {
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%d\n", mem.getId(), mem.getPw(), mem.getName(),
						mem.getPhone(), mem.getAddress(), mem.getPoint());
			}
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 3. 아이디 중복체크 (회원가입시)
	// 반환타입  String
	String chKOverlap() {
		
		String id = null;
		boolean run = true;
		try {
			con = DriverManager.getConnection(jdbcUrl, user, pw);
			
			while (run) {
				System.out.print("아이디를 입력하세요 > ");
				id = sc.nextLine().trim();
				run = dao.chKId(con, id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}

	// 4. 회원가입, 수정시 비밀번호 일치여부
	// 매개변수 - 사용자에게 입력받은 패스워드
	// 데이터베이스가 아닌 사용자에게 입력받은 값을 비교이므로 멤버클래스의 변수나 생성자를 사용하지 않았음
	boolean chkPw(String pw) {
		boolean result = true;
		System.out.print("비밀번호를 한번 더 입력하세요 > ");
		String chkPassword = sc.nextLine().trim();
		if (!pw.equals(chkPassword)) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			result = true;
		} else {
			result = false;
		}
		return result;
	}


	// 5. 멤버 데이터 입력(회원가입)
	void memAdd() {
		try {
			con = DriverManager.getConnection(jdbcUrl, user, pw);
			System.out.println("환영합니다.");

			// 3. 아이디 중복체크 후 아이디값 반환
			String id = chKOverlap();
			String password = null;
			boolean run = true;

			// 비밀번호 일치체크
			while(run) {
				System.out.print("비밀번호를 입력하세요 > ");
				password = sc.nextLine().trim();
				// 4. 비밀번호 중복체크 후 반복문 탈출
				run = chkPw(password);
			}

			System.out.print("이름를 입력하세요 > ");
			String cafename = sc.nextLine().trim();
			System.out.print("주소를 입력하세요 > ");
			String address = sc.nextLine().trim();
			System.out.print("전화번호를 입력하세요 > ");
			String phone = sc.nextLine().trim();

			Member mem = new Member(cafename, id, password, address, phone);

			int result = dao.insertMem(con, mem);

			if (result > 0) {
				System.out.println("가입되었습니다.");
			} else {
				System.out.println("오류가 발생하여 가입실패했습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 6. 내 정보 수정
	// 매개변수 - Login 클래스 : currentId
	void memEdit(String currentId) {

		try {
			con = DriverManager.getConnection(jdbcUrl, user, pw);

			System.out.println("회원 정보를 수정합니다.");
			System.out.print("이름를 입력하세요 > ");
			String cafename = sc.nextLine().trim();
			
			// 비밀번호 일치체크
			String password = null;
			boolean run = true;
			while(run) {
				System.out.print("비밀번호를 입력하세요 > ");
				password = sc.nextLine().trim();
				run = chkPw(password);
			}
			
			System.out.print("주소를 입력하세요 > ");
			String address = sc.nextLine().trim();
			System.out.print("전화번호를 입력하세요 > ");
			String phone = sc.nextLine().trim();

			Member mem = new Member(cafename, password, address, phone);

			int result = dao.editMem(con, mem, currentId);

			if (result > 0) {
				System.out.println("정보가 수정되었습니다.");
			} else {
				System.out.println("오류가 발생하여 수정실패하였습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 7. 회원 탈퇴
	// 매개변수 - Login 클래스 : currentId
	void memDel(String currentId) {

		try {
			con = DriverManager.getConnection(jdbcUrl, user, pw);

			System.out.println("탈퇴시 취소나 복구가 되지 않습니다.");
			System.out.print("탈퇴하시려면 '탈퇴'를 입력하세요 > ");
			String yes = sc.nextLine().trim();

			if (yes.equals("탈퇴")) {
				int result = dao.deleteMem(con, currentId);
				if (result > 0) {
					System.out.println("탈퇴되었습니다.");
					System.out.println("이용해주셔서 감사합니다.");
					Login.logout();
				} else {
					System.out.println("오류가 발생하여 탈퇴실패하였습니다.");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 추가사항
	// 8. 관리자 정보 조회
	// 매개변수 - Login 클래스 : currentId
	void myAdminInfo(String currentId) {

		try {
			con = DriverManager.getConnection(jdbcUrl, user, pw);

			List<Member> list = dao.getAdminList(con, currentId);

			System.out.println("■■■■■■■■■■■■■■■ 점포 정보  ■■■■■■■■■■■■■■■■");
			System.out.println("주소\t\t전화번호");
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			for (Member mem : list) {
				System.out.printf("%s\t\t\t%s", mem.getAddress(), mem.getPhone());
			}
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 추가사항
	// 9. 관리자 비밀번호 재설정
	// 매개변수 - Login 클래스 : currentId
	void memAdminEdit(String currentId) {

		try {
			con = DriverManager.getConnection(jdbcUrl, user, pw);
			System.out.println("       +------------------------+");
			System.out.println("       |    비밀번호를 재설정 합니다.   |");
			System.out.println("       +------------------------+");
		
			// 비밀번호 일치체크
			String pw = null;
			boolean run = true;
			while(run) {
				System.out.print(" 새 비밀번호 > ");
				pw = sc.nextLine().trim();
				run = chkPw(pw);
			}		

			int result = dao.editAdminMem(con, pw , currentId);

			if (result > 0) {
				System.out.println("  * 정보가 수정되었습니다.");
			} else {
				System.out.println("                   ●●●");
				System.out.println("       오류가 발생하여 수정에 실패하였습니다.");
				System.out.println("                   ●●●");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}