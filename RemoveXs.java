import java.util.Scanner;

public class RemoveXs
{ 
   public static void main(String[] args)
   {

	System.out.print("Please enter a line of text: ");
	Scanner in = new Scanner (System.in);
	String input = in.nextLine();
	int i = 1;
	while (i < input.length() - 1 ) //iterate through the string input
	{
			if (input.charAt (i) == 'x' ) //remove the Xs
			{
				String substring1 = input.substring ( 0, i);//break the input into two strings
				String substring2 = input.substring(i+1, input.length());//exclude the x
				input=substring1+substring2;//put them back together
				i--;
			}
			i++;
	}
	System.out.println(input);

	in.close(); //close the scanner
	}
}