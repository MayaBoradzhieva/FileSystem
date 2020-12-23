package fileSystem;

public class CreateFileCommand implements Command
{


	Terminal terminal;
	Directory dir;
	
	CreateFileCommand(Terminal terminal)
	{
		this.terminal = terminal;
		dir = terminal.getCurrent();
	}
	
	@Override
	public void execute(String[] command) 
	{
		/*mkdir new
		create_file filename*/
		//System.out.println( "filename" + command[1]);
		dir.createFile(command[1]);
        
	}

}
