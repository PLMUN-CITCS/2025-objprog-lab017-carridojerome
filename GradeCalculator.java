import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Score (0-100):");
		int grade = scanner. nextInt();
		
		if(grade>=90)
		{
		    System.out.println("Your Grade A");
		  }
		else if (grade>=80)
		{
		    System.out.println("Your Grade B");
		}  
		else if (grade>=70)
		{
		    System.out.println("Your Grade C");
		}  
		else if (grade>=60)
		{
		    System.out.println("Your Grade D");
		}  
		else
		{
		    System.out.println("Grade F");
		}
		
		

	}

}