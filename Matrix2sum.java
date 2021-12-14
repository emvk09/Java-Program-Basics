import java.util.Scanner;
public class Matrix2sum
{
    public static void main(String arr[])
    {
        Scanner sc= new Scanner(System.in);
        int i, j, x, y;
        System.out.println("Enter the rows:");
        x= sc.nextInt();
        System.out.println("Enter the columns:");
        y= sc.nextInt();
        int num1[][]= new int[x][y];
        int num2[][]= new int[x][y];
        int sum[][]= new int[x][y];
        
        for (i= 0; i< x; i++)
        {
            System.out.format("Enter the elements in row %d of 1st matrix \n", i);
            for(j= 0; j< y; j++)
                num1[i][j]= sc.nextInt();
        }

        for (i= 0; i< x; i++)
        {
            System.out.format("Enter the elements in row %d of 2nd matrix \n", i);
            for(j= 0; j< y; j++)
                num2[i][j]= sc.nextInt();
        }

        System.out.format("The sum of the matrices is:");
        for (i= 0; i< x; i++)
        {
            for(j= 0; j< y; j++)    
            {
                sum[i][j]= num1[i][j]+ num2[i][j];
                System.out.format("%d \t", sum[i][j]);
            }
            System.out.println("\n");
        }
    }
}