package P1;

class RevereString{
	public static void main(String[] args) {
		String str = "Krishna";
		String revString = "";
		
		for(int i = str.length()-1; i>=0; --i)
		{
			revString += str.charAt(i); 
		}
		System.out.println(revString);
	}
}
