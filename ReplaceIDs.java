
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
public class ReplaceIDs{

	private static HashMap<String, String> map = new HashMap<>();


	public static void createFile(){
		//read original file
		Scanner inputStream = null;
		try {
			String origFileName = "MathClinic.csv";
			File origFile = new File(origFileName);
			inputStream = new Scanner(origFile);
		} catch (Exception e)
		{
			System.out.println("The error was: "+e);
			e.printStackTrace();
		}
		
		//create new file
		BufferedWriter writer = null;
		try {
			File newFile = new File("newMathClinic.txt");
			writer = new BufferedWriter(new FileWriter(newFile));
		} catch (Exception e) {
			e.printStackTrace();
		}
		int number = 1;

		while(inputStream.hasNext()){
			//read single line, put in string 
			String line = inputStream.nextLine();
			//skip first line
			if (line.startsWith("Date"))
				continue;
			String[] fields =  new String[5];
			fields = line.split(",");
			//if it is a new name create a new ID, otherwise same ID
			if (!map.containsKey(fields[1] + fields[2])){
				map.put(fields[1] + fields[2], "ID" + number);
				number += 1;
			} 
			//replace the name with the ID
			fields[1] = map.get(fields[1] + fields[2]);
			String newLine = fields[0]+","+fields[1]+","+fields[3]+","+fields[4]+","+fields[5]+","+fields[6];
			//print new text file
			try {
				writer.write(newLine+"\n");
			} catch (Exception e) {	
				e.printStackTrace();
			}  // catch

		} // while
		
		//after loop, close scanner
		inputStream.close();
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // createFile method
} // class

