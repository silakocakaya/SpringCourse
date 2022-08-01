package helloworld.xmlconfig;

public class HelloWorldIndia {

	private String message;
	private String message2;
	private String message3;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("India Your Message : " + message);
	}
	
	public void getMessage3() {
		System.out.println("India Your Message3 : " + message3);
	}

	public void setMessage3(String message3) {
		this.message3 = message3;
	}

	public void getMessage2() {
		System.out.println("India Your Message : " + message2);
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}
}
