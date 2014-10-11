package headfirstdp.chapter6;

public class MacroCommand implements CommandOrOrder {

	CommandOrOrder[] commands;
	
	public MacroCommand (CommandOrOrder[] commands) {
		this.commands = commands;
	}
	
	public void ExecuteOrOrderUp() {
		for(int i = 0; i < commands.length; i++) {
			commands[i].ExecuteOrOrderUp();
		}
	}

	public void undo() {
		for(int i = commands.length - 1; i >= 0; i++) {
			commands[i].ExecuteOrOrderUp();
		}
	}

}
