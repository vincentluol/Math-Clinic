public class Name implements Comparable<Name>{
	private int numID;
	
	public Name(String s){
		numID = Integer.parseInt(s.substring(2, s.length()));
	}
	
	public int compareTo(Name n){
		if (this.numID > n.numID)
			   return +1;
			else if (this.numID < n.numID)
			   return -1;
			else
			   return 0;
	}
	
	public boolean equals(Name n){
		return this.compareTo(n) == 0;
	}
	
	public String toString(){
		return "ID" + numID;
	}
	
}