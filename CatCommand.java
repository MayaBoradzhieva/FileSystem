package fileSystem;

public class CatCommand implements Command
{

	Terminal terminal;
	Directory dir;
	
	CatCommand(Terminal terminal)
	{
		this.terminal = terminal;
		dir = terminal.getCurrent();
	}
	
	
	@Override
	public void execute(String[] command)
	{
		dir.displayFileContentDir(command[1]);
		
	}

}
