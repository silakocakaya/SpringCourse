package xmlconfig.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionMainApp {

	public static void main(String[] args) {
		
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	      TextEditor te = (TextEditor) context.getBean("textEditor");
	      te.spellCheck();
	      te.commentCheck();
	      
	      System.out.println("--------------");
	      TextEditor te2 = (TextEditor) context.getBean("textEditorByName");
	      te2.spellCheck();
	      te2.commentCheck();
	}
}
