    import java.util.*;
	import java.lang.Math;
    public class Main
	{
		public static void main(String args[])
		{
			//int[] a = {'SUN','MON','TUE','WED','THU','FRI','SAT'};
			Scanner scan = new Scanner(System.in);
			String choice = scan.nextLine();
			switch(choice)
			{
				case "SUN" :
					System.out.println("7");break;
				case "MON" : 
					System.out.println("6");break;
				case "TUE" :
					System.out.println("5");break;
				case "WED" :
					System.out.println("4");break;
				case "THU" : 
					System.out.println("3");break;
				case "FRI" :
					System.out.println("2");break;
				case "SAT" :
					System.out.println("1");break;
				default : System.out.println("Enter valid choice");break;
			}
		}
    }