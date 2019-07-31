import java.util.*;

class ArrayProject
{
  public static void main(String args[])
   {
     int r,c,r1,c1;
     int i,j,k,sum=0;
     Scanner cin = new Scanner(System.in);
     System.out.println("Enter number of rows of first matrix: ");
     r = cin.nextInt();
     System.out.println("Enter number of columns of first matrix: ");
     c = cin.nextInt();
     int a[][] = new int[r][c];
     System.out.println("Enter first matrix: ");
     for(i=0; i<r; i++)
     for(j=0;j<c;j++)
     a[i][j] = cin.nextInt();
         
      System.out.println("Enter number of rows of second matrix: ");
      r1 = cin.nextInt();
      System.out.println("Enter number of columns of second matrix: "); 
      c1 = cin.nextInt();

      if(c != r1)
       { System.out.println("matrix cannot be multiply...");}
      else
      {
        int b[][] = new int[r1][c1];
        int multiply[][] = new int[r][c1];
        System.out.println("Enter second matrix: ");
        for(i=0;i<r1;i++)
        for(j=0;j<c1;j++)
        b[i][j] = cin.nextInt();
 
 
      for(i=0; i<r;i++)
       {
         for(j=0;j<c1;j++)
           {
             for(k=0;k<r1;k++)
              {
                sum = sum + a[i][k] * b[k][j];
              }

           multiply[i][j] = sum;
           sum = 0;
           }
       }

      System.out.println("Result of matrix multiplication: ");
       for(i=0;i<r;i++)
         {
           for(j=0;j<c1;j++)
            {
              System.out.print(multiply[i][j]+" ");
              System.out.println();
            }
         }
      
  }
}

}