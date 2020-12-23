package fileSystem;

public class WriteCommand implements Command 
{

	Terminal terminal;
	Directory dir;
	
	WriteCommand(Terminal terminal)
	{
		this.terminal = terminal;
		dir = terminal.getCurrent();
	}
	
	@Override
	public void execute(String[] command) 
	{
		
		dir.writeIntoFileDir(command[1], command[2], command[3]);
	}

}
