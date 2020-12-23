package fileSystem;

import java.util.*;

public class Directory 
{
	private String name;
	public HashMap<String, File> files;
	public HashMap<String, Directory> folders;
	//Directory currentDir;
	Directory parentDir;
	
	
	public Directory()
	{
		this("/");
		/*folders = new HashMap<String, Directory>();
		folders.put("home", new Directory("home"));*/
	}
	
	private Directory(String newName)
	{
		folders = new HashMap<String, Directory>();
		files = new HashMap<String, File>();
		setName(newName);
	}
	
	public void createSubDirectory(String newName)
	{
		Directory newDir = new Directory(newName);
		folders.put(newName, newDir);
		newDir.parentDir = this;
		//return newDir;
	}
	
	public void createFile(String newName)
	{
		
		files.put(newName, new File(newName));
		
	}
	
	public void listFilesInDirectory()
	{
		System.out.println(files.keySet());		
		
		System.out.println(folders.keySet());
	}
	
	public void listSortedFiles()
	{
		 List<Map.Entry<String, File> > list = 
	               new LinkedList<Map.Entry<String, File>>(files.entrySet()); 
		
	
		 Collections.sort(list, new Comparator<Map.Entry<String, File>>()
		 { 
			 public int compare(Map.Entry<String, File> o1,  
					 Map.Entry<String, File> o2) 
			 { 
				 Integer value1 = o1.getValue().getSize();
				 Integer value2 = o2.getValue().getSize();
	            	
				 return (value1.compareTo(value2)); 
			 } 
		 }); 
	          
		 // put data from sorted list to hashmap  
		 HashMap <String, File> temp = new LinkedHashMap<String, File>(); 
		 for (Map.Entry<String, File> aa : list) 
		 { 
			 temp.put(aa.getKey(), aa.getValue()); 
	     }   
		 
		 System.out.println(temp.keySet());
		 
	
	}
	
	public void countLinesInFile(File file)
	{
		
	}
	
	public Directory getSubdirectory(String subdirectoryName)
	{
		return folders.get(subdirectoryName);
	}
	
	public Directory getParentDirectory(String parentDirectoryName)
	{
		return parentDir;
	}
	
	public void writeIntoFileDir(String fileName, String lineNumber, String lineContent)
	{

		
		if (fileName.equals(files.get(fileName).getName()) )
		{
			
		 	files.get(fileName).writeIntoFile(fileName, lineNumber, lineContent);
		}
	 
	}
	
	public void displayFileContentDir(String fileName)
	{
		
		if (fileName.equals(files.get(fileName).getName()))
		{
			
			files.get(fileName).displayFileContent();
		}
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}


	
}
