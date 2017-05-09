package widgets.addons;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import widgets.IShield;

@Component
@Primary
public class CosmicRaysShiled implements IShield {

	@Override
	public String power() {
		return "Solar Winds Screen";
	}

}
