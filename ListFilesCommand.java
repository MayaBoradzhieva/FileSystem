package fileSystem;

public class ListFilesCommand implements Command  
{

	Terminal terminal;
	Directory dir;
	
	ListFilesCommand(Terminal terminal)
	{
		this.terminal = terminal;
		dir = terminal.getCurrent();
	}
	
	@Override
	public void execute(String[] command)
	{
		dir.listFilesInDirectory();
	}

}
