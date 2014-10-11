package headfirstdp.chapter6;

public class RemoteLoader {
	
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = 
				new RemoteControlWithUndo();
//		LightOrCook livingRoomLight =
//				new LightOrCook("Living Room");
//		LightOrCook kitchenLight =
//				new LightOrCook("Kitchen");
		CeilingFan ceilingFan =
				new CeilingFan("Living Room");
//		GarageDoorOrCook garageDoor =
//				new GarageDoorOrCook("");
//		Stereo stereo = new Stereo("Living Room");
		
//		LightOnOrCreateCommandObject livingRoomLightOn =
//				new LightOnOrCreateCommandObject(livingRoomLight);
//		LightOffOrCreateCommandObject livingRoomLightOff =
//				new LightOffOrCreateCommandObject(livingRoomLight);
//		LightOnOrCreateCommandObject kitchenLightOn =
//				new LightOnOrCreateCommandObject(kitchenLight);
//		LightOffOrCreateCommandObject kitchenLightOff =
//				new LightOffOrCreateCommandObject(kitchenLight);
//		
//		CeilingFanOn ceilingFanOn =
//				new CeilingFanOn(ceilingFan);
//		CeilingFanOff ceilingFanOff =
//				new CeilingFanOff(ceilingFan);
//		
//		GarageDoorUpCommand garageDoorUp =
//				new GarageDoorUpCommand(garageDoor);
//		GarageDoorDownCommand garageDoorDown =
//				new GarageDoorDownCommand(garageDoor);
//		
//		StereoOnWithCDCommand stereoOnWithCD =
//				new StereoOnWithCDCommand(stereo);
//		StereoOffWithCDCommand stereoOff =
//				new StereoOffWithCDCommand(stereo);
//		
//		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
//		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
//		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
		
		CeilingFanMediumCommand ceilingFanMedium =
				new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh =
				new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff =
				new CeilingFanOffCommand(ceilingFan);
		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
		
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		
		remoteControl.offButtonWasPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
//		
//		remoteControl.onButtonWasPushed(1);
//		remoteControl.offButtonWasPushed(1);
//		remoteControl.onButtonWasPushed(2);
//		remoteControl.offButtonWasPushed(2);
//		remoteControl.onButtonWasPushed(3);
//		remoteControl.offButtonWasPushed(3);
		
	}

}
