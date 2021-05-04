package spring5_basic_study.di;

import java.util.Collection;

public class MemberLIstPrinter {
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	public MemberLIstPrinter(MemberDao memberDao, MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	}
	
	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m -> printer.Print(m));
	}
	
	
}