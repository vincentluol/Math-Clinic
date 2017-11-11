import java.util.Scanner;


public class Student {
	Scanner inputStream = new Scanner("newMathClinic.txt");
	private Date date;
	private Name name;
	private String course;
	private String teacher;
	private String timeIn;
	private String timeOut;
	
	public Student(String line){
		System.out.println(line);
		String[] fields = line.split(",");
		this.date = new Date(fields[0]);
		this.name = new Name (fields[1]);
		this.course = fields[2];
		this.teacher = fields[3];
		this.timeIn = fields[4];
		this.timeOut = fields[5];
	}
	
	
	public Date getDate(){
		return date;
		
	}
	
	public Name getName(){
		return name;
	}
	
	public String getCourse(){
		return course;
	}
	
	public String getTeacher(){
		return teacher;
	}
	
	public String getTimeIn(){
		return timeIn;
	}
	
	public String getTimeOut(){
		return timeOut;
	}
}
