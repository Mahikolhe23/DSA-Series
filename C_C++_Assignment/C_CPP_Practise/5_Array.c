/*
1D Array
Q1 - Write a program to accept n numbers in an array and display the largest and smallest number. 
Using these values, calculate the range of elements in the array. 
#include<stdio.h>
int main(){
    int n,i;
    printf("Enter the numbers of element in array =");
    scanf("%d",&n);
    int arr[n];
    for (i = 0; i < n; i++)
    {   
        printf("Enter the number ");
        scanf("%d",&arr[i]);
    }
    for (i = 0; i < n; i++)
    {
        printf("%d \n",arr[i]);
    }
    int max ,min;
    for (i = 0; i < n; i++)
    {
        max=0;
        if(max<arr[i])
        {
            max=arr[i];
        }
    }
    printf("Maximum number in the array is = %d \n",max);
    return 0;
}
*/


/*
Q2 - Write a program to accept an array of n elements and a number say key. 
Check whether key is present in the array or not.
#include<stdio.h>
int main(){
    int n,i ,key;
    printf("Enter the numbers of element required in array =");
    scanf("%d",&n);
    int arr[n];
    for (i = 0; i < n; i++)
    {   
        printf("Enter the numbers in array ");
        scanf("%d",&arr[i]);
    }
    printf("Enter the key you want to search = ");
    scanf("%d",&key);
    for (int i = 0; i < n; i++)
    {
        if (key==arr[i])
        {
            printf("Key is found");
        }
    }
    return 0;
}
*/


/*
Q3 - Write a program to accept an integer array and an integer say num and 
counts the occurrences of the num in the array.
#include<stdio.h>
int main(){
    int n ,num, count=0;
    printf("Enter the number that you want to create an array");
    scanf("%d",&n);
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter the number for showing occurence");
    scanf("%d",&num);
    for (int i = 0; i < n; i++)
    {
        if (num==arr[i])
        {
            count++;
        }
    }
    printf("%d",count);
    return 0;
}
*/

/*
Q4 - Write a program to accept n numbers from the user and store them in an array.
Then sort the array in descending order and display it.
#include <stdio.h>
int main (){
   int i, j, a, n,element;
   int num[element];
   printf("enter number of elements in an array\n");
   scanf("%d", &n);
   printf("Enter the elements\n");
   for (i = 0; i < n; ++i)
      scanf("%d", &num[i]);
   for (i = 0; i < n; ++i)
   {
      for (j = i + 1; j < n; ++j)
      {
         if (num[i] > num[j])
         {
            a = num[i];
            num[i] = num[j];
            num[j] = a;
         }
      }
   }
   printf("The numbers in ascending order is:\n");
   for (i = 0; i < n; ++i){
      printf("%d\n", num[i]);
   }
   return 0;
}
*/

/*
Q5 - Write a program to accept a decimal number and convert it to binary.
#include<stdio.h>
int main()
{
    int n,r,m=1,bin=0;
    printf("\nEnter the Number : ");
    scanf("%d",&n);
    while(n!=0)
    {
        r=n%2;
        bin=bin+(r*m);
        m=m*10;
        n=n/2;
    }
    printf("\nBinary Value : %d",bin);
  return 0;
}
*/
/*
2D Array
Q1- Write a program to accept, display and print the sum of elements of each 
row and sum of elements of each column of a matrix.
#include<stdio.h>
int main(){
    int n,m,sum;
    printf("\n Enter the Row size of matrix = ");
    scanf("%d",&n);
    printf("\n Enter the Column size of matrix = ");
    scanf("%d",&m);
    int arr[n][m];
    for (int i = 0; i < n; ++i)
    {
        for (int j = 0; j < m; ++j)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    for (int i = 0; i < m; ++i) 
        {
            for (int j = 0; j < n; ++j) 
            {
                sum = sum + arr[i][j] ;
            }
 
            printf("Sum of the %d row is = %d\n", i, sum);
            sum = 0;
 
        }
    return 0;
}
*/

/*
Q2 -Write a program to accept a matrix A of size mXn and store its transpose in matrix B. Display matrix B.
#include <stdio.h>
void main()
{
    static int array[10][10];
    int i, j, m, n;

    printf("Enter the order of the matrix \n");
    scanf("%d %d", &m, &n);
    printf("Enter the coeficients of the matrix\n");
    for (i = 0; i < m; ++i)
    {
        for (j = 0; j < n; ++j)
        {
            scanf("%d", &array[i][j]);
        }
    }
    printf("The given matrix is \n");
    for (i = 0; i < m; ++i)
    {
        for (j = 0; j < n; ++j)
        {
            printf(" %d", array[i][j]);
        }
        printf("\n");
    }
    printf("Transpose of matrix is \n");
    for (j = 0; j < n; ++j)
    {
        for (i = 0; i < m; ++i)
        {
            printf(" %d", array[i][j]);
        }
        printf("\n");
    }
}
*/

/*
Q3 - Write a program to add and multiply two matrices. 
Perform necessary checks before adding and multiplying the matrices.
#include<stdio.h>    
#include<stdlib.h>  
int main()
{  
    int a[10][10],b[10][10],mul[10][10],r,c,i,j,k;      
    printf("enter the number of row=");    
    scanf("%d",&r);    
    printf("enter the number of column=");    
    scanf("%d",&c);    
    printf("enter the first matrix element=\n");    
    for(i=0;i<r;i++)    
    {    
        for(j=0;j<c;j++)    
            {    
                scanf("%d",&a[i][j]);    
            }    
    }       
    printf("enter the second matrix element=\n");    
    for(i=0;i<r;i++)    
    {    
        for(j=0;j<c;j++)    
            {    
                scanf("%d",&b[i][j]);    
            }    
    }    
    printf("multiply of the matrix=\n");    
    for(i=0;i<r;i++)    
    {    
        for(j=0;j<c;j++)    
            {    
                mul[i][j]=0;    
            for(k=0;k<c;k++)    
                {    
                    mul[i][j]+=a[i][k]*b[k][j];    
                }    
            }    
    }    
    //for printing result    
    for(i=0;i<r;i++)    
    {    
        for(j=0;j<c;j++)    
            {    
                printf("%d\t",mul[i][j]);    
            }    
            printf("\n");    
    }    
    return 0;  
}  
*/

/*
Q4 - Write a program to perform the following operations on a square matrix. Write
i) Check if the matrix is symmetric.
ii) Display the trace of the matrix (sum of diagonal elements).
iii) Check if the matrix is an upper triangular matrix.
#include<stdio.h>
int main(){
    int a[3][3],i,j,r,c,o,b[3][3],trace;
    printf("enter the number of row=");    
    scanf("%d",&r);    
    printf("enter the number of column=");    
    scanf("%d",&c);    
    printf("enter the matrix element=\n");    
    for(i=0;i<r;i++)    
    {    
        for(j=0;j<c;j++)    
            {    
                scanf("%d",&a[i][j]);    
            }    
    }
    printf("Enter the Operation want to perform. \n");
    printf("1 - Check if the matrix is symmetric. \n");
    printf("2 - Display the trace of the matrix (sum of diagonal elements). \n");
    printf("3 - Check if the matrix is an upper triangular matrix.");
    scanf("%d",&o);
    switch (o)
    {
        case 1:
                printf("Transpose of matrix is \n");
            for (j = 0; j < c; ++j)
            {
                for (i = 0; i < r; ++i)
                    {
                        if (a[i][j]==b[i][j])
                        {
                            printf("Matrix A is symmetric Matrix ");
                        }
                    }
            }    
        break;
        case 2:
                printf("Trace of matrix is :");
                trace =a[0][0]+a[1][1]+a[2][2];
                printf("%d",trace);
        break;
        case 3:
                for ( i = r; i < r; i++)
                {
                    for (j = 0; j < c; j++)
                    {
                        if (a[1][0]==0&&a[2][0]==0&&a[2][1]==0)
                        {
                            printf("this is upper triangular matrix");
                        }
                    }
                }
                
        break;
        default:printf("this is normal matrix ");
        break;
    }
    return 0;
}
*/