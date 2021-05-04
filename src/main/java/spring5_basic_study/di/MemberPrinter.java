package spring5_basic_study.di;

public class MemberPrinter {
	public void Print(Member member) {
		System.out.printf(
				"회원정보 : 아이디 = %d, 이메일 = %s, 이름 = %s, 등록일 = %tF %n",
				member.getId(),
				member.getEmail(),
				member.getName(),
				member.getRegisterDateTime()				
				);
	}
}
