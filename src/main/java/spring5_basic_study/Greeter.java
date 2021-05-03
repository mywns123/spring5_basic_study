package spring5_basic_study;

public class Greeter {
	private String format;
	
	public String greet(String guest) {
		return String.format(format, guest);
	}
	
	public void setFormat(String format) {
		//this.format = "%s, 안녕하세요"
		this.format = format;		
	}
}
