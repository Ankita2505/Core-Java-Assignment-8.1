package files;
//program for file copy.

import java.io.*;// Importing Input Output Packages

public class Assignment8_1 
{

	public static void main(String args[]) throws IOException  //Start of main Class
	{ 
		int i; 
		
		FileInputStream sourceFile; //create a file and read data from it.
		FileInputStream readFile;//create a file and read data from it.
		FileOutputStream destinationFile; //create a file and write data into it.
		try 
		{ 
			// open source file 
			try 
			{ 
				//sourceFile = new FileInputStream(args[0]);
				sourceFile = new FileInputStream("C:\\Users\\PRANSHU\\eclipse-workspace\\FileHandling\\inputfile.txt");
			} 
			catch(FileNotFoundException e) 
			{ 
				System.out.println("Input File Not Found"); 
				return; 
			} 
			// open destination file 
			try 
			{ 
				//destinationFile = new FileOutputStream(args[1]); 
				destinationFile = new FileOutputStream("C:\\Users\\PRANSHU\\eclipse-workspace\\FileHandling\\outputfile.txt");
			} 
			catch(FileNotFoundException e) 
			{ 
				System.out.println("Error Opening Output File"); 
				return; 
			} 
			int readLine; //will read your line 

			// Display the contents of the source file and copy the contents to destination file

			System.out.println("-------------------------------------");
			System.out.println("Displaying contents of Source File");
			System.out.println("-------------------------------------");
			while ((readLine = sourceFile.read()) != -1) 
			{ 
				destinationFile.write((char) readLine);
				System.out.print((char) readLine);
			}
			destinationFile.close();
			// Read from the output file to verify if contents were written properly.
			System.out.println("\n");
			System.out.println("-------------------------------------");
			System.out.println("Displaying contents of Destination File");
			System.out.println("-------------------------------------");

			readFile = new FileInputStream("C:\\Users\\PRANSHU\\eclipse-workspace\\FileHandling\\outputfile.txt");
			while ((readLine = readFile.read()) != -1) 
			{
				System.out.print((char) readLine);
			}
		} 
		catch(ArrayIndexOutOfBoundsException e) 
		{ 
			System.out.println("Usage: CopyFile From To"); 
			return; 
		} 
		// Copy File from source to destination file 
		try 
		{ 
			do 
			{ 
				i = sourceFile.read(); 
				if(i != -1) destinationFile.write(i); 
			} while(i != -1); 
			System.out.println("Files copied from source to destination successfully");
		} 
		catch(IOException e) 
		{ 
			System.out.println("File Error"); 
		} 
		finally 
		{

			if (sourceFile != null) 
			{
				sourceFile.close();//Closing Source file
			}
			if (destinationFile != null)
			{
				destinationFile.close();//Closing Destination File
			}
			if (readFile != null)
			{
				readFile.close();// Closing Read File
			}

		}
	} 
}


