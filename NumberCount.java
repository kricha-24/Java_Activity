import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
int n;
int c=0;
int s=0;
Scanner sc=new Scanner(System.in);

// System.out.print("Enter the number of elements you want to store: ");

n=sc.nextInt();

int[] array = new int[10];

// System.out.println("Enter the elements of the array: ");

for(int i=0; i<n; i++)
{
array[i]=sc.nextInt();
}
        if (n>0)
        {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==n && array[i]>0)
            {
                c++;
            }
            else if(array[i]<0)
            {
               s++;
            }
            else
            {
                c=c;
            }
        }
        if (s>0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
System.out.println(c);
    }
}
    else{
        System.out.println("Invalid Input");
    }
}
}
Z