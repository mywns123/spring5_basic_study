package spring5_basic_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring5_basic_study.di.ChangePasswordService;
import spring5_basic_study.di.MemberDao;
import spring5_basic_study.di.MemberInfoPrinter;
import spring5_basic_study.di.MemberLIstPrinter;
import spring5_basic_study.di.MemberPrinter;
import spring5_basic_study.di.MemberRegisterService;
import spring5_basic_study.di.VersionPrinter;

@Configuration
public class AppCix {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}

	@Bean
	public MemberLIstPrinter listPrinter() {
		return new MemberLIstPrinter();
	}

	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		return infoPrinter;
	}

	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}

	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService();
	}

	@Bean
	public ChangePasswordService changePwSvc() {
		ChangePasswordService PwSvc = new ChangePasswordService();
		return PwSvc;
	}

}
