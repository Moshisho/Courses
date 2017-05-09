package widgets.addons;

import org.springframework.stereotype.Component;

import widgets.IShield;

@Component
public class ForceField implements IShield{

	@Override
	public String power() {
		return "Shielding from Charged Particles";
	}

}
