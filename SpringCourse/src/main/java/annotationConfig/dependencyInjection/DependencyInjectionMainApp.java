package annotationConfig.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionMainApp {

	public static void main(String[] args) {
		
	      ApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);

	      TextEditor te = (TextEditor) context.getBean("textEditor");
	      te.spellCheck();
	}
}
