package fileSystem;

public class MakeDirectoryCommand implements Command
{

	Terminal terminal;
	Directory dir;
	Directory newDir;
	
	MakeDirectoryCommand(Terminal terminal)
	{
		this.terminal = terminal;
		dir = terminal.getCurrent();
		
	}

	@Override
	public void execute(String[] command)
	{
		dir.createSubDirectory(command[1]);
		
	}

}
