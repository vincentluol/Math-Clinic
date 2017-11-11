public class Date implements Comparable<Date> {

	private int day;
	private String month;
	private int monthNum;

	/**
	 * s must be in the format dd-mmm, where mmm is Sep, Dec, etc.
	 * 
	 */
	public Date(String s)
	{
		String [] fields = s.split("-");
		day = Integer.parseInt(fields[0]);
		month = fields[1];
		String monthList = "JulAugSepOctNovDecJanFebMarAprMayJun";  
		monthNum = monthList.indexOf(month);  
	}

	public String getMonth()
	{
		return month;
	}

	public int getDay()
	{
		return day;
	}

	//compares the order of dates
	public int compareTo(Date rhs)
	{
		if (this.monthNum < rhs.monthNum)
			return -1;
		else if (this.monthNum > rhs.monthNum)
			return +1;
		else if (this.day > rhs.day)
			return +1;
		else if (this.day < rhs.day)
			return -1;
		else
			return 0;
	}

	public boolean equals(Date d){
		return this.compareTo(d) == 0;
	}
	
	public String toString()
	{
		return getDay()+"-"+getMonth();
	}
}