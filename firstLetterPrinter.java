import java.util.Scanner;
class firstLetterPrinter{
	public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
	 String input = in.nextLine();
	 System.out.println(firstLetterPrinter(input));
	}
	static String firstLetterPrinter(String str){
	 int len = str.length();
	 char mus;
	 String jyotirmoy = "";
	 jyotirmoy = jyotirmoy + str.charAt(0);

	  for (int i = 1; i < len; i++)
	  {
	   mus = str.charAt(i);
	   if (mus == ' '){
	    jyotirmoy = jyotirmoy + (str.charAt(i + 1));
	   }
	}
	   System.out.println("the new word is");
return jyotirmoy;
	  }
}