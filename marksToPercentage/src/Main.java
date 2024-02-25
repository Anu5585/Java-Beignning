import java.util.Scanner; //importing class scanner for taking input from user
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Taking Input using keyboard
        System.out.println("Enter Your Name : " );
        String name= sc.nextLine();
        System.out.println("Your Name is : " + name);
        // Taking Input of Marks
        System.out.println("Enter Subject 1 Marks : ");
        int mark1 = sc.nextInt();
        System.out.println("Your 1st Subject Marks : " + mark1);
        System.out.println("Enter Subject 2 Marks : ");
        int mark2 = sc.nextInt();
        System.out.println("Your 2nd Subject Marks : " + mark2);
        System.out.println("Enter Subject 3 Marks : ");
        int mark3 = sc.nextInt();
        System.out.println("Your 3rd Subject Marks : " + mark3);
        System.out.println("Enter Subject 4 Marks : ");
        int mark4 = sc.nextInt();
        System.out.println("Your 4th Subject Marks : " + mark4);
        System.out.println("Enter Subject 5 Marks : ");
        int mark5 = sc.nextInt();
        System.out.println("Your 5th Subject Marks : " + mark5);
        int sum = mark1 + mark2 + mark3 + mark4 + mark5 ;
        int obtainedMarks = 500;
        System.out.println("Total Marks is : " + obtainedMarks );
        System.out.println("Marks You Obtained : " + sum );
        int percentage = sum *100 /obtainedMarks;
        System.out.println("Hurray! You Got : "+ percentage + "%" );
    }
}