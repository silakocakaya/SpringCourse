package annotationConfig.helloWorld;

public class HelloWorld {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void init() {
		System.out.println("Hello World init method");
	}

	public void cleanup() {
		System.out.println("Hello World destroy method");
	}
}