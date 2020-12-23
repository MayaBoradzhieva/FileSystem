package fileSystem;

public class ListSortedFilesCommand implements Command 
{

	Terminal terminal;
	Directory dir;
	
	ListSortedFilesCommand(Terminal terminal)
	{
		this.terminal = terminal;
	}
	
	@Override
	public void execute(String[] command) 
	{
		dir.listSortedFiles();

	}

}
