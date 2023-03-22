/*Q1 - Write a program that accepts numbers continuously as long as 
the number is positive and prints the sum of the given numbers.
#include<stdio.h>
int main(){
    int num,sum;
    printf("Enter the number");
    while (1)
    {
        if (num<0)
        {
            break;
        }
        sum = sum + num;
    }
    printf("Sum of all number = %d \n",sum);
    return 0;
}
*/

/*Q2  Write a program to accept two integers x and n and compute x raised to n.
#include<stdio.h>
#include<math.h>
int main(){
    int ans,x,n;
    printf("Enter the number X= \n");
    scanf("%d",&x);
    printf("Enter the Power N= \n");
    scanf("%d",&n);
    ans = pow(x,n);
    printf("X raised to power n = %d \n",ans);
    return 0;
}
*/


/*
Q3 - Write a program to accept a character, an integer n and display the next n characters.
#include<stdio.h>
int main(){
    char ch;
    int n;
    printf("Enter a character you want print =");
    scanf("%c",&ch);
    printf("Enter the Number of times to print that character =");
    scanf("%d",&n);
    for (int i = 0; i<n; i++)
    {
        printf("%c ",ch);
    }
    return 0;
}
*/

/*
Q4 Write a program to calculate factorial of a number.For e.g. factorial of 5 = 5! = 5 *4*3*2*1 = 120
#include<stdio.h>
int main(){
    int num , fact=1;
    printf("Enter tha number to calculate factorial = ");
    scanf("%d",&num);
    for (int i = 1; i <=num; i++)
    {
        fact = fact * i;    
    }
    printf("Factorial of number %d is = %d  ",num,fact);
    return 0;
}
*/

/*
Q5 Write a program to calculate factors of a given number
#include<stdio.h>
int main(){
    int num , factor;
    printf("Enter the number for calculating factor of number = ");
    scanf("%d",&num);
    factor =1;
    for (int i = 2; i<=num; i++)
    {
        if (num%i==0)
        {
            factor ++;
        }
    }
    printf("Number of factors of %d is = %d\n",num,factor);
    return 0;
}
*/


/*
Q6 - Accept two numbers and calculate GCD of them.
#include<stdio.h>
int main(){
    int num1 ,num2, GCD;
    printf("Enter the first number =  ");
    scanf("%d",&num1);
    printf("Enter the second number =  ");
    scanf("%d",&num2);
    for (int i = 1; i<=num1&&i<=num2; i++)
    {
        if (num1%i==0&&num2%i==0)
        {
            GCD=i;
        }
    }
    printf("GCD of %d and %d is = %d ",num1,num2,GCD);
    return 0;
}
*/

/*
Q7 -Write a menu driven program to do following operations :
a) Compute area of circle
b) Compute area of rectangle
c) Compute area of triangle
d) Exit
Display menu, ask choice to the user, depending on choice accept 
the parameters and perform the operation. Continue this process until user selects exit option.
#include<stdio.h>
#include<stdlib.h>
int main(){
    int operation , area;
    int heihght , l,b ,radious , base;

    printf("Please enter the number you want to do \n");
    printf("1 - Compute area of circle \n");
    printf("2 - Compute area of rectangle \n");
    printf("3 - Compute area of triangle \n");
    printf("4 - Exit");
    scanf("%d",&operation);
    switch (operation)
    {
        case 1:
                printf("Enter the radious of circle = ");
                scanf("%d",&radious);
                area = 3.14 * radious *radious;
                printf("Area of circle is = %d",area);     
        break;

        case 2:
                printf("Enter the breath and length of rectangle = ");
                scanf("%d%d",b,l);
                area = l * b;
                printf("Area of rectangle is = %d", area);
        break;

        case 3:
                printf("Enter the basea and height of triangle =");
                scanf ("%d%d",&base ,&heihght);
                area = (1/2)*base*heihght;
                printf("Area of triangle is = %d",area);
        break;

        default:
        printf("End of program ");
        exit(0);
        break;
    }
    return 0;
}
*/

/*

Q8 - Write a program to print all prime numbers between 1 to n.
#include<stdio.h>
void main()
{
    int i,j,n;
    
    printf("Enter the number till which you want prime numbers\n");
    scanf("%d",&n);
    
    printf("Prime numbers are:-\n");    
    for(i=2;i<=n;i++)
    {
        int c=0;
        for(j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                c++;
            }
        }
         
       if(c==2)
        {
            printf("%d ",i);
        }
    }
}
*/