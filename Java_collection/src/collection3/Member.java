package collection3;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	private Long id; // 회원번호
	private String memberId; // 회원 아이디
	private String email; // 회원 이메일
	private String password; // 회원 비밀번호
	private String birth; // 생년월일(8자리)
	
//	public Member() {}
//	public Member(Long id, String memberId, String password, 
//			String email, String birth) {
//		this.id=id;
//		this.memberId=memberId;
//		this.password=password;
//		this.email=email;
//		this.birth=birth;
//	}
	
}

// 클래스 정의
// 인스턴스변수의 접근제어자는 private
// 인스턴스변수에 대해 get, set 메서드
// toString 메서드 만들기