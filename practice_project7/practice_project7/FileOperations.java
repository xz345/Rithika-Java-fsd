package practice_project7;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations
{
	FileWriter fw=null;
	public static void main(String[] args) {
		// Specify the file path
		String filePath = "example.txt";

		// Create a file
		createFile(filePath);

		// Read and print the file content
		readFile(filePath);

		// Update the file
		updateFile(filePath, "Updated content");

		// Read and print the updated content
		readFile(filePath);

		// Delete the file
		deleteFile(filePath);
	}

	// Create a file
	public static void createFile(String filePath)
	{
		try {
			FileWriter writer = new FileWriter(filePath);
			writer.write("Hello, World!");
			writer.close();
			System.out.println("File created successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Read and print the file content
	public static void readFile(String filePath) 
	{
		try {
			FileReader reader = new FileReader(filePath);
			int character;
			while ((character = reader.read()) != -1) {
				System.out.print((char) character);
			}
			reader.close();
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Update the file content
	public static void updateFile(String filePath, String newContent) 
	{
		try {
			FileWriter writer = new FileWriter(filePath);
			writer.write(newContent);
			writer.close();
			System.out.println("File updated successfully.");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Delete the file
	public static void deleteFile(String filePath) 
	{
		File file = new File(filePath);
		if (file.delete()) {
			System.out.println("File deleted successfully.");
		} else {
			System.out.println("Failed to delete the file.");
		}
	}

}

