import java.util.Scanner;

class PersonalInfo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter City: ");
        sc.nextLine();   // Clear buffer
        String city = sc.nextLine();

        System.out.println("\n--- Personal Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}