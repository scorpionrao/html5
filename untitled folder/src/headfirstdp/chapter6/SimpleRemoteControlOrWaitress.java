package headfirstdp.chapter6;

public class SimpleRemoteControlOrWaitress {
	CommandOrOrder slot;
	
	public SimpleRemoteControlOrWaitress() {}
	
	public void setCommand(CommandOrOrder command) {
		slot = command;
	}
	
	public void buttonWasPressed() {
		slot.ExecuteOrOrderUp();
	}

}
