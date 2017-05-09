package widgets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sprocket implements IWidget {

	@Value("ACME Sprocket")
	private String name;
	
	@Autowired	
	private IShield shield;
	
	@Override
	public void use() {
		System.out.println("using Widget " + name);		
		System.out.println("      Shield: " + shield.power());
	}

}




