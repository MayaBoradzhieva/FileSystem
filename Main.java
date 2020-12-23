package fileSystem;

public class Main 
{

	public static void main(String[] args) 
	{

//		File a = new File("Maya");
//		a.writeIntoFile(1,"Maya Boradzhieva");
//		a.displayFileContent();
	Directory home = new Directory();
	//	Directory d = home.createSubDirectory("newDir");
	//	File b = d.createFile("newFile");
//		d.listFilesInDirectory();
//		d.createSubDirectory("blqblq");
//		d.listFilesInDirectory();
	//	b.writeIntoFile(1, "hdhd");
	//	b.displayFileContent();
		

		 
		Terminal term = new Terminal(home, home);
		
		term.run();
	}

}
