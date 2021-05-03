package spring5_basic_study.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCix {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
		
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao());
	}
	
	@Bean
	public ChangePasswordService changePwSvc() {
		ChangePasswordService PwSvc = new ChangePasswordService();
		PwSvc.setMemberDao(memberDao());
		return PwSvc;
	}
	
	
	
}
