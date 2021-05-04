package spring5_basic_study.di;

import org.springframework.beans.factory.annotation.Autowired;

public class VersionPrinter {
	@Autowired	
	private int majorVersion;
	@Autowired
	private int minorVersion;

	public void Printer() {
		System.out.printf("이 프로그램의 버전은 %d.%d입니다.\n\n", majorVersion, minorVersion);
	}

	/*
	 * public void setMajorVersion(int majorVersion) { this.majorVersion =
	 * majorVersion; }
	 * 
	 * public void setMinorVersion(int minorVersion) { this.minorVersion =
	 * minorVersion; }
	 */

}
