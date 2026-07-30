import java.util.Scanner;

class Array1D
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter 5 Numbers:");

        for(int i = 0; i < 5; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Array Elements:");

        for(int i = 0; i < 5; i++)
        {
            System.out.println(a[i]);
        }
    }
}