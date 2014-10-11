package headfirstdp.chapter6;

public class RemoteLoader1 {
	
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = 
				new RemoteControlWithUndo();
		LightOrCook light =
				new LightOrCook("Living Room");
		Stereo stereo = new Stereo("Living Room");
		
		LightOnOrCreateCommandObject livingRoomLightOn =
				new LightOnOrCreateCommandObject(light);
		LightOffOrCreateCommandObject livingRoomLightOff =
				new LightOffOrCreateCommandObject(light);
		StereoOnWithCDCommand stereoOnWithCD =
				new StereoOnWithCDCommand(stereo);
		StereoOffWithCDCommand stereoOff =
				new StereoOffWithCDCommand(stereo);
		
		CommandOrOrder[] partyOn = {livingRoomLightOn, stereoOnWithCD};
		CommandOrOrder[] partyOff = {livingRoomLightOff, stereoOnWithCD};
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On ---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off ---");
		remoteControl.offButtonWasPushed(0);
		

		
	}

}
