package tools;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import widgets.IWidget;

@Component
public class Toolbox {
	private String name;
	
	@Autowired
	private Set<IWidget> widgets;
	
	public Toolbox() {
		this.name = "ACME Toolset for Dummies";
	}
	
	public Toolbox(String name) {
		this.name = name;
	}
	
	public void use(){
		System.out.println("Opening toolbox: " + name);
		for (IWidget w : widgets) {
			System.out.print("trying:\t");
			w.use();
		}
	}	
}
