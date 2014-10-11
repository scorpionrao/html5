package headfirstdp.chapter6;

public class GarageDoorUpCommand 
	implements CommandOrOrder {

	GarageDoorOrCook garageDoor;
	
	public GarageDoorUpCommand(GarageDoorOrCook garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	public void ExecuteOrOrderUp() {
		garageDoor.up();
	}
	
	public void undo() {
		garageDoor.down();
	}
	
	
}
