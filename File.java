package fileSystem;


public class File
{
	private String fileName;
	private int size;
	private String[] content;
	
	public File()
	{
		fileName = "New file";
		size = 0;
		
		content = new String[1];
		content[0] = "";
	}
	
	public File(String newFileName)
	{
		this.fileName = newFileName;
		this.size = 0;
		
		content = new String[1];
		this.content[0] = "";
	}
	
	public int getSize()
	{
		return size;
	}
	
	public String getName()
	{
		return fileName;
	}
	
	private void sizeUpdate()
	{
		for (int i = 0; i < content.length; i++)
		{
			this.size += content[i].length();
		}
		this.size += content.length;
	}
	
	public void writeIntoFile(String fileName, String lineNumber, String lineContent)
	{
		if (!this.fileName.equals(fileName))
		{
			
			return;
		}

		int lineNumberToInt = Integer.parseInt(lineNumber);
		
		if (lineNumberToInt > content.length)
		{
			String[] tempContent = new String[lineNumberToInt];
			System.arraycopy(content, 0, tempContent, 0, tempContent.length);
			content = tempContent;
			content[lineNumberToInt-1] = lineContent;
			
		}
		else if (lineNumberToInt <= content.length)
		{
			content[lineNumberToInt-1] = content[lineNumberToInt-1] + lineContent;
		}
		
		sizeUpdate();
		
		
	}
	
	public void overwriteLineInFile(int lineNumber, String lineContent)
	{
		if (lineNumber > content.length)
		{
			String[] tempContent = new String[lineNumber];
			System.arraycopy(content, 0, tempContent, 0, tempContent.length);
			content = tempContent;
			content[lineNumber-1] = lineContent;
			
		}
		else if (lineNumber <= content.length)
		{
			content[lineNumber-1] = lineContent;
		}
		
		sizeUpdate();
	}
	
	public void displayFileContent()
	{
		
		for (int i = 0; i < content.length; i++)
		{
			System.out.println(content[i]);
		}
	}
	
	public void wordCountInFile(String fileName)
	{
		if (this.fileName.equals(fileName))
		{
			
		    int wordCount=0;
			for (int i = 0; i < this.getSize(); i++)
			{
				String[] wordArray = content[i].trim().split("\\s+");
				wordCount += wordArray.length;
			}

		     System.out.println("Word count is = " + wordCount);
		    
		}
		
	}
	
	public void wordCountGivenText(String text)
	{
		int wordCount = 0;
			
		String[] wordArray = text.trim().split("\\s+");
		wordCount = wordArray.length;
		
	    System.out.println("Word count is = " + wordCount);
					
	}
	

	
	
}
