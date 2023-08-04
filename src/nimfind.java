import java.util.Scanner;

public class nimfind
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("(n): ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("numbers:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }
        int minimum = min(arr);
        System.out.println(minimum);
        scanner.close();
    }

    public static int min(int[] arr)
    {
        int min = arr[0]; // Initialize min to the first element
        for (int num : arr)
        {
            if (num < min)
            {
                min = num;
            }
        }
        return min;
    }
}