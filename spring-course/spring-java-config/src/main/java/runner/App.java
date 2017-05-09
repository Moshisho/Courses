package runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tools.Toolbox;
import widgets.IWidget;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx;
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		IWidget w = ctx.getBean(IWidget.class);
		
		w.use();
		
		Toolbox t = ctx.getBean("acme", Toolbox.class);
		t.use();
		
		System.out.println("--------------------------------");
		
		t = ctx.getBean("spring", Toolbox.class);
		t.use();
		
		ctx.close();
		

	}

}
