import java.util.Scanner;

class Result
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int m = sc.nextInt();

        if(m >= 75)
            System.out.println("Grade A");
        else if(m >= 60)
            System.out.println("Grade B");
        else if(m >= 35)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}