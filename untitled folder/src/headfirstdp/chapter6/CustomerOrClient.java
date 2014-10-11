package headfirstdp.chapter6;

public class CustomerOrClient {
	
	public static void main(String[] args) {
		SimpleRemoteControlOrWaitress remote = 
				new SimpleRemoteControlOrWaitress();
		LightOrCook light = new LightOrCook("Room");
		GarageDoorOrCook garageDoor = new GarageDoorOrCook("");
		LightOnOrCreateCommandObject lightOnCommandObject =
				new LightOnOrCreateCommandObject(light);
		GarageDoorUpCommand garageOpenCommandObject = 
				new GarageDoorUpCommand(garageDoor);
		
		remote.setCommand(lightOnCommandObject);
		remote.buttonWasPressed();
		remote.setCommand(garageOpenCommandObject);
		remote.buttonWasPressed();
	}

}
