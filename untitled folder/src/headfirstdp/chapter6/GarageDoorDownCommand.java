package headfirstdp.chapter6;

public class GarageDoorDownCommand 
	implements CommandOrOrder {

	GarageDoorOrCook garageDoor;
	
	public GarageDoorDownCommand(GarageDoorOrCook garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	public void ExecuteOrOrderUp() {
		garageDoor.down();
	}
	
	public void undo() {
		garageDoor.up();
	}
	
	
}
