
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MathClinicMain {
	private static ArrayList<Student>Students = new ArrayList<Student>();
	private static ArrayList<Date>Dates = new ArrayList<Date>();
	private static ArrayList<String>Courses = new ArrayList<String>();
	private static ArrayList<Name>Names = new ArrayList<Name>();

	public static void main(String[] args){
		ReplaceIDs.createFile();
		Scanner inputStream=null;
		try {
			inputStream = new Scanner(new File ( "newMathClinic.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (inputStream.hasNext()){
			String line = inputStream.nextLine();
			Student s = new Student(line);
			Students.add(s);
		}
		System.out.println();
		inputStream.close();
		visitsPerDate();
		visitsPerCourse();
		visitsPerStudent();
	}

	public static void visitsPerDate(){
		System.out.println("Visits Per Date:");
		for (int i = 0; i < Students.size(); i++){
			Dates.add(Students.get(i).getDate());
		}
		java.util.Collections.sort(Dates);
		int numStudents = 1;
		for (int i = 0; i < Dates.size(); i++){
			if (i == Dates.size()-1){
				System.out.println(Dates.get(i) + ": " + numStudents);
			}
			else if (Dates.get(i).equals(Dates.get(i+1))){
				numStudents += 1;
			}
			else{
				System.out.println(Dates.get(i)+": "+numStudents);
				numStudents = 1;
			}
		}
		System.out.println();

	}

	public static void visitsPerCourse(){
		System.out.println("Visits Per Course:");
		for (int i = 0; i < Students.size(); i++){
			Courses.add(Students.get(i).getCourse());
		}
		java.util.Collections.sort(Courses);
		int numStudents = 1;
		for (int i = 0; i < Courses.size(); i++){
			if (i == Courses.size()-1){
				System.out.println(Courses.get(i) + ": " + numStudents);
			}
			else if (Courses.get(i).equals(Courses.get(i+1))){
				numStudents += 1;
			}
			else{
				System.out.println(Courses.get(i)+": "+numStudents);
				numStudents = 1;
			}
		}
		System.out.println();
	}

	public static void visitsPerStudent(){
		System.out.println("Visits Per Student:");
		for (int i = 0; i < Students.size(); i++){
			Names.add(Students.get(i).getName());
		}
		java.util.Collections.sort(Names);
		int visits = 1;
		for (int i = 0; i < Names.size(); i++){
			if (i == Names.size()-1){
				System.out.println(Names.get(i) + ": " + visits);
			}
			else if (Names.get(i).equals(Names.get(i+1))){
				visits += 1;
			}
			else{
				System.out.println(Names.get(i)+": "+visits);
				visits = 1;
			}
		}
		System.out.println();
	}
}








//	public static void visitsPerDate(){
////		for (int i = 0; i < Students.size(); i++){
////			if (!map.containsKey(Students.get(i).getDate()))
////				map.put(Students.get(i).getDate(), 0);
//////		}
//////		for (int k = 0; k < Students.size(); k++){
//////			if (map.containsKey(Students.get(k).getDate()));
//////				map.put(Students.get(k).getDate(), map.get(Students.get(k).getDate())+1);
//////		}
//////			
//////			
////			else
////				map.put(Students.get(i).getDate(), map.get(Students.get(i).getDate())+1);
////			System.out.println(map.get(Students.get(i).getDate()));
////			
////		}
//////		for (int i = 0; i < map.size(); i++)
//////			System.out.println(map.get(Students.get(i).getDate()));
////			System.out.println(map2.values());
//			
//			
//		for (int i = 0; i < Students.size(); i++){
//			String s = Students.get(i).getDate();
//			//System.out.println(s);
//			if (!dateMap.containsKey(s))
//				dateMap.put(s, 1);
//			else{
//				dateMap.put(s, dateMap.get(s)+1);
//			}
//		}
//		String [] foo = (dateMap.keySet()).toArray(new String [0]);
//		Arrays.sort(foo);
//		for (Object o:foo)
//		{
//			System.out.println("TEST: "+o+" "+dateMap.get(o));
//		}
//		
//		System.out.println(dateMap.values());
//	}

//	public static void visitsPerCourse(){
//		for (int i = 0; i < Students.size(); i++){
//			Courses.add(Students.get(i).getDate());
//	}

//			
//	
//
//	public static void visitsPerStudent(){
//		for (int i = 0; i < Students.size(); i++){
//			String s = Students.get(i).getCourse();
//			if (!nameMap.containsKey(s))
//				courseMap.put(s, 1);
//			else{
//				courseMap.put(s, courseMap.get(s)+1);
//			}
//		}
//		System.out.println(courseMap.values());
//	}


