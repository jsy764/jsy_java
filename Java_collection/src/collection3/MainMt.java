package collection3;

import java.util.ArrayList;

public class MainMt {

	public static void main(String[] args) {
//		ArrayList<Member> list = new ArrayList<>();
//		
//		list.add(new Member(1l, "jsy", "aa_nen@naver.com", "1234", "20001214"));
//		
//		list.add(new Member(2l, "dw", "dw@gmail.com", "1234", "19800728"));
//		
//		System.out.println(list);
		
		MemberDao dao = new MemberDao();
		
		ArrayList<Member> memberList = dao.select();
		
		for(Member m : memberList) {
			System.out.println(m);
		}
	}

}
