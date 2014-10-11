package headfirstdp.chapter6;

public class RemoteControlWithUndo {
	CommandOrOrder[] onCommands;
	CommandOrOrder[] offCommands;
	CommandOrOrder undoCommand;
	
	public RemoteControlWithUndo() {
		onCommands = new CommandOrOrder[7];
		offCommands = new CommandOrOrder[7];
		
		CommandOrOrder noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, CommandOrOrder onCommand,
			CommandOrOrder offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].ExecuteOrOrderUp();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].ExecuteOrOrderUp();
		undoCommand = onCommands[slot];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.ExecuteOrOrderUp();
	}
	
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n------- Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuffer.append("[slot " + i + "] " + 
					onCommands[i].getClass().getName() + " " +
					offCommands[i].getClass().getName() + "\n");
		}
		stringBuffer.append("[undo] " + undoCommand.getClass().getName());
		return stringBuffer.toString();
	}
	
}
