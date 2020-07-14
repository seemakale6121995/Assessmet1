package intellect;
import java.util.*;


	public class TwentyOne {

	    public void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter month, 1-12: ");
	        int month  = input.nextInt();
	        if (month > 12)
	            System.out.print("Invalid month " + month);

	        else        
	            System.out.print("Enter a year: ");


	        int year = input.nextInt();



	    switch (month * 1){
	    case 1: System.out.print("January " + year); 
	    System.out.print(" has 31 days."); break;
	    case 2: System.out.print("February " + year); 
	    System.out.print(" has 28 days."); break;
	    case 3: System.out.print("March " + year); 
	    System.out.print(" has 31 days."); break;
	    case 4: System.out.print("April " + year);
	    System.out.print(" has 30 days."); break;
	    case 5: System.out.print("May " + year);
	    System.out.print(" has 31 days."); break;
	    case 6: System.out.print("June " + year);
	    System.out.print(" has 30 days."); break;
	    case 7: System.out.print("jJuly " + year);
	    System.out.print(" has 31 days."); break;
	    case 8: System.out.print("August " + year);
	    System.out.print(" has 31 days."); break;
	    case 9: System.out.print("September " + year);
	    System.out.print(" has 30 days."); break;
	    case 10: System.out.print("October " + year);
	    System.out.print(" has 31 days."); break;
	    case 11: System.out.print("November " + year);
	    System.out.print(" has 30 days."); break;
	    case 12: System.out.print("December " + year);
	    System.out.print(" has 31 days.");
	        }
	    }
	}



