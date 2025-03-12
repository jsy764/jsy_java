package log_in;

import java.util.Scanner;

import DBM.userDao;

public class log implements Active {
	
	private userDao daoo;
	private String id;
	private String password;
	
	public log() { this.daoo = new userDao();}
	
	
	public String signIn() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n---- 로그인 ----");
		System.out.print("ID : ");
		String uId = scan.nextLine();
		System.out.print("PW: ");
		String uPw = scan.nextLine();
		
		if(daoo.loginIp(uId,uPw))
		return uPw;
		
		return null;
		
	}
}

