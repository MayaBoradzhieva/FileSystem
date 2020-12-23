package fileSystem;

public class ChangeDirectoryCommand implements Command
{ 
	// ako ima naklonena cherta e absoluten put, t.e. /home 
	

	Terminal terminal;
	Directory dir;
	
	ChangeDirectoryCommand(Terminal terminal)
	{
		this.terminal = terminal;
		dir = terminal.getCurrent();
	}
	
	@Override
	public void execute(String[] command) 
	{
		
		if (command[1].equals("..")) 
		{
			terminal.setCurrent(dir.parentDir);
		}
		
		else 
		{
			String[] commandSplit = command[1].split("/");
			
			for (int i = 0; i < commandSplit.length; i++)
			{
				if (command[i].equals(terminal.getCurrent().folders.get(command[i]).getName()))
				{
					terminal.setCurrent(terminal.getCurrent().folders.get(command[i]));
				}
			}
		}
		
	}
}
