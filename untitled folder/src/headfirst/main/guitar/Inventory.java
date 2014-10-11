package headfirst.main.guitar;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class Inventory {
	private List<Guitar> guitars;
	
	public Inventory() {
		this.guitars = new LinkedList<Guitar>();
	}
	
	public void addGuitar (String serialNumber,
		double price, Builder builder,
		String model, Type type,
		Wood backWood, Wood topWood) {
		guitars.add(new Guitar(serialNumber,
			price, builder, model,
			type, backWood, topWood));
	}
	
	Guitar getGuitar(String serialNumber) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}
	
	List<Guitar> search(Guitar searchGuitar) {
		List<Guitar> matchingGuitars = new LinkedList<Guitar>();
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
			Guitar guitar = (Guitar) i.next();
			
			Builder builder = searchGuitar.getBuilder();
			if ((builder != null) && (!builder.equals("")) &&
					(!builder.equals(guitar.getBuilder()))) {
				continue;
			}
			String model = searchGuitar.getModel();
			if ((model != null) && (!model.equals("")) &&
					(!model.equals(guitar.getModel()))) {
				continue;
			}
			Type type = searchGuitar.getType();
			if ((type != null) && (!type.equals("")) &&
					(!type.equals(guitar.getType()))) {
				continue;
			}
			Wood backWood = searchGuitar.getBackWood();
			if ((backWood != null) && (!backWood.equals("")) &&
					(!backWood.equals(guitar.getBackWood()))) {
				continue;
			}
			Wood topWood = searchGuitar.getTopWood();
			if ((topWood != null) && (!topWood.equals("")) &&
					(!topWood.equals(guitar.getTopWood()))) {
				continue;
			}
			matchingGuitars.add(guitar);
		}
		
		return matchingGuitars;
	}
	
}
