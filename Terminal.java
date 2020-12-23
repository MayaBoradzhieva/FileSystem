package fileSystem;

import java.util.HashMap;
import java.util.Scanner;

public class Terminal
{
	private HashMap<String, Command> commands;
	private Directory root; 
	private Directory current;
	
	
	Terminal(Directory current, Directory root)
	{
		this.setCurrent(current);
		this.setRoot(root);
	
		commands = new HashMap<>();
		commands.put("cat", new CatCommand(this));
		commands.put("cd", new ChangeDirectoryCommand(this));
		commands.put("create_file", new CreateFileCommand(this));
		commands.put("mkdir", new MakeDirectoryCommand(this));
		commands.put("write", new WriteCommand(this));
		commands.put("ls", new ListFilesCommand(this));
		commands.put("ls --sorted desc", new ListSortedFilesCommand(this));
	}
	
	public void run()
	{
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		
		while (running)
		{
			String line = scanner.nextLine();
			String[] words = line.split(" ");
			
			if (words[0].equals("exit"))
			{
				running = false;
			}	
			else 
			{
				
				commands.get(words[0]).execute(words);
			
			}
		}
		
		scanner.close();
	}

	public Directory getRoot() 
	{
		return root;
	}

	public void setRoot(Directory root) 
	{
		this.root = root;
	}

	public Directory getCurrent() 
	{
		return current;
	}

	public void setCurrent(Directory current) 
	{
		this.current = current;
	}

}
