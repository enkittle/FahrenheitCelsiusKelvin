import java.util.*;
public class convertTemp {

	 public static void main (String arg []){

    Scanner keyboard = new Scanner(System.in);
    double start;
    double convertion;
    int unit;
    int convertUnit;


    System.out.println("Choose a Starting Unit:");
    System.out.println("1 - Fahrenheit");
    System.out.println("2 - Celcius");
    System.out.println("3 - Kelvin");
    System.out.printf("%n");
    
    System.out.print("Enter a unit: ");
    unit = keyboard.nextInt();
    
    System.out.printf("%n");

    System.out.print("Enter tempature: ");
    start = keyboard.nextDouble();
    
    System.out.printf("%n");


    System.out.println("Convert to:");
	System.out.println("1 - Fahrenheit");
    System.out.println("2 - Celcius");
	System.out.println("3 - Kelvin");
	
	System.out.printf("%n");
	
	 System.out.print("Enter unit: ");
	 convertUnit = keyboard.nextInt();
	 
	 System.out.printf("%n");
	 
	 
	 if(unit == 1) {
		 if(convertUnit == 1) {
			 System.out.printf("%.2f Fahrenheit", start);
		 }
		 if(convertUnit == 2) {
			 convertion = ((0.5556)*(start - 32));
			 System.out.printf("%.2f Celcius", convertion);
		 }
		 if(convertUnit == 3) {
			 convertion = (273+((0.556)*(start - 32)));
			 System.out.printf("%.2f Kelvin", convertion);
		 }
		 
	 }
	 
	 
	 if(unit == 2) {
		 if(convertUnit == 1) {                    //doesn't work
			 convertion = ((0.556 * start) + 32);
			 System.out.printf("%.2f Fahrenheit", convertion);
		 }
		 if(convertUnit == 2) {
			 System.out.printf("%.2f Celcius", start);
		 }
		 if(convertUnit == 3) {
			 convertion = (273 + start);
			 System.out.printf("%.2f Kelvin", convertion);
		 }
		 
	 }
	 
	 
	 if(unit == 3) {
		 if(convertUnit == 1) {                      //doesn't work
			 convertion = ((0.556 * (start - 273)) + 32);
			 System.out.printf("%.2f Fahrenheit", convertion);
		 }
		 if(convertUnit == 2) {
			 convertion = (start - 273);
			 System.out.printf("%.2f Celcius", convertion);
		 }
		 if(convertUnit == 3) {
			 System.out.printf("%.2f Kelvin", start);
		 }
		 
	 }


 }

	
}
