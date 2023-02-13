package basic;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		int day=4;
		switch (day) {
		case 1:
			System.out.println("Happy Monday");
			break;
		case 2:
			System.out.println("Happy Tuesday");
			break;
		case 3:
			System.out.println("Happy Wednesday");
			break;
		case 4:
			System.out.println("Happy Thursday");
			break;
		case 5:
			System.out.println("Happy Friday");
			break;
		case 6:
			System.out.println("Happy Saturday");
			break;
		case 7:
			System.out.println("Happy Sunday");
			default:
				System.out.println("Wrong input");
		}//end switch
				

	}//end main

}//end class
