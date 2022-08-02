package xmlconfig.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloWorldMainApp {

	public static void main(String[] args) {

		System.out.println("---ClassPathXmlApplicationContext");
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.getMessage();

		System.out.println();
		System.out.println("---FileSystemXmlApplicationContext");
		//Classpath yerine butun uxanti verilir
		ApplicationContext contextFile = new FileSystemXmlApplicationContext(
				"C:\\Users\\sila.kaya\\git\\SpringCourse\\src\\main\\resources\\Beans.xml");

		HelloWorld obj = (HelloWorld) contextFile.getBean("helloWorld");
		obj.getMessage();
		
		//Singleton
		System.out.println();
		System.out.println("---Singleton");
		
		HelloWorld helloWorldSingletonA = (HelloWorld) context.getBean("helloWorldSingleton");
		helloWorldSingletonA.setMessage("Singleton A");
		helloWorldSingletonA.getMessage();
		
		HelloWorld helloWorldSingletonB = (HelloWorld) context.getBean("helloWorldSingleton");
		helloWorldSingletonB.getMessage();
		
		//Prototype
		System.out.println();
		System.out.println("---Prototype");
		
		HelloWorld helloWorldPrototypeA = (HelloWorld) context.getBean("helloWorldPrototype");
		helloWorldPrototypeA.setMessage("Prototype A");
		helloWorldPrototypeA.getMessage();
		
		HelloWorld helloWorldPrototypeB = (HelloWorld) context.getBean("helloWorldPrototype");
		helloWorldPrototypeB.getMessage();
		
	}
}
