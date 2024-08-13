//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3 {
    public static void main(String[] args){
        //Make a scanner 
        Scanner myScanner = new Scanner (System.in);
        
        
        //Create my variable 
    int length = 0;
    int width = 0;
    int area = 0;
    int perimeter = 0;
    
        
        //Ask for user input 
    System.out.println("Please enter the length: ");
    length = myScanner.nextInt();
    System.out.println("Please enter the width: "); 
    width = myScanner.nextInt();
    
        //Calculate it 
    area = (length*width); 
    perimeter = (length+length)+(width+width);
        
        //Output 
    System.out.println("The length is: " + length); 
    System.out.println("The width is: " + width); 
    System.out.println("The area is: " + area); 
    System.out.println("The perimeter is: " + perimeter); 
}
}
