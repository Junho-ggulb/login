package hello.login.domain.member;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class Member {
	
	private Long id;
	
	@NotEmpty
	private String loginId; //로그인 ID
	
	@NotEmpty
	private String name; //사용자 이름
	
	@NotEmpty
	private String password;
	
	

}
