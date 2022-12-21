// بسم الله الرحمن الرحيم
import java.util.Locale;
import java.util.Scanner;

public class Main
{

    // day 1
    public static void DrawShape()
    {
        for(int i =0;i<10;i+=2)
        {
            if(i==4)
            {
                System.out.println();
                continue;
            }
            for(int j =0 ;j<(i+1);j++)
            { System.out.print(" *");}

            System.out.println();
        }
    }

    // day 2 & 3
    public static void AvrageOfArray(int size)
    {
        float arr [] =new float[size];
        float sum = 0.0f;
        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);
        for (int i =0;i < arr.length;i++)
        {
            System.out.println("enter the value " + i);
            arr[i]= Scanner.nextFloat();
            sum+=arr[i];
        }
        float Avarge = (sum/arr.length);
        System.out.println(" The Avarge = "+ Avarge);
    }

    // day 5
    public static int [][] Print2Darray()
    {
        int arr [][] =new int[2][3];
        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);

        // Scan
        for(int row =0 ;row< arr.length;row++)
            for (int col =0;col<arr[row].length;col++)
            {
                System.out.println("enter the value ");
                arr[row][col]=Scanner.nextInt();
            }

        // diplay
        System.out.println(" Array  ");
        for(int row =0 ;row< arr.length;row++)
        {
            for (int col =0;col<arr[row].length;col++)
            {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

       return arr;
    }

   // day 6
   public static int [] Add5andPrint ( int Array[])
   {
       // Add 5 to each element
       for(int i =0;i<Array.length;i++)
           Array[i]+=5;
       // display it
       System.out.println("The Array : ");
       for (int i :Array)
           System.out.print(i+" ");

       return Array;
   }

  // day 7
    public static void MethodOverLoad(int x )
    {
        for(int i =0 ; i< x;i++)
            System.out.println("OOP");
    }
    public static void MethodOverLoad(float x )
    {
        System.out.println("Sum ="+(x*3));
    }
    public static void MethodOverLoad(String name )
    {
        System.out.println("Hello " + name);
    }








    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Please pick a number from 1 to 7 ");
        int currentDay = Scanner.nextInt();

        switch (currentDay)
        {
            case 1 :
                System.out.println("Congratulions , You have choesed this beautiful Shape (: ");
                DrawShape();
                break;

            case 2:
            case 3:
                System.out.println("Please enter The Size of the Array ");
                int size = Scanner.nextInt();
                AvrageOfArray(size);
                break;

            case 4 :
                System.out.println("Ana ta3ban ya captin ): ");
                break;

            case 5:
                System.out.println("You Have an Array has a fixed Size (2x3) ");
                System.out.println("Please fill it (:  ");
                Print2Darray();
                break;

            case 6 :
                int Array[]=new int[4];
                System.out.println("Please enter FOUR Values");
                for (int i =0;i<Array.length;i++)
                {Array[i]= Scanner.nextInt();}
                Add5andPrint(Array);
                break;

            case 7 :
                System.out.println("You Have three methods have the same name (int - float -String ) ");
                System.out.println("enter integer number ");
                int intNum=Scanner.nextInt();
                MethodOverLoad(intNum);
                System.out.println("enter float number ");
                float floNum= Scanner.nextFloat();
                MethodOverLoad(floNum);
                System.out.println("enter a name ");
                String name  ="Amr";
                name=Scanner.next();
                MethodOverLoad(name);
                break;

        }

    }
}