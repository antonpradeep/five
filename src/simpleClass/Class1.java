package simpleClass;

public class Class1 {
	
	
 int Day=4;
	 
		public void printDayOfTheWeek() {
			
			switch (Day){

			case 0:
			System.out.println("sunday");
			break;

			case 1:
			System.out.println("Monday");
			break;

			case 2:
			System.out.println("Tuesday");
			break;

			case 3:
			System.out.println("Wednesday");
			break;

			case 4:
			System.out.println("Thursday");
			break;

			case 5:
			System.out.println("Friday");
			break;

			case 6:
			System.out.println("Saturday");
			break;

			default:
			System.out.println("Invalid Day");
			}
}
	
		
		public int getDay() {
			return Day;
		}

		public void setDay(int Day) {
			this.Day = Day;
		}			
}