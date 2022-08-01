package xmlconfig.helloworld;

public class HelloWorld {

	private String message;
	private String message2;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
	
	public void init() {
		System.out.println("Init Method Of HelloWorld");
	}

	public void destroy() {
		System.out.println("Destroy Method Of HelloWorld");
	}
	public void initDef() {
		System.out.println("---Default Init Method");
	}

	public void destroyDef() {
		System.out.println("---Default Destroy Method");
	}

	public void getMessage2() {
		System.out.println("Your Message2 : " + message2);
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}
}
