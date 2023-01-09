/*
Q1 - Accept a single digit from the user and display it in words. For example, if digit entered is 9, display Nine.
#include<stdio.h>
int main(){
    int number;
    printf("Enter the single digit number = ");
    scanf("%d",&number);
    switch (number)
    {
        case 1:
        printf("One");
        break;
        case 2:
        printf("Two");
        break;
        case 3:
        printf("Three");
        break;
        case 4:
        printf("Four");
        break;
        case 5:
        printf("Five");
        break;
        case 6:
        printf("Six");
        break;
        case 7:
        printf("Seven");
        break;
        case 8:
        printf("Eight");
        break;
        case 9:
        printf("Nine");
        break;
        default:
        printf("Enter the valid single digit number");
        break;
    }
    return 0;
}
*/

/*
Q2 - Write a program, which accepts two integers and an operator as a character (+ - * / ), 
performs the corresponding operation and displays the result.
#include<stdio.h>
int main(){
    int ans ,num1 ,num2, operation;
    printf("Enter the operaraion want to perform \n");
    printf("1 = ADD , 2 = SUBTRACT 3 = MULTIPLY 4 = DIVIDE \n");
    scanf("%d",&operation);
    printf("Enter the first number =");
    scanf("%d",&num1);
    printf("Enter the second number =");
    scanf("%d",&num2);
    switch (operation)
    {
        default:
        printf("Please enter valid operation and number");
        break;

        case 1:
        ans = num1 + num2;
        printf ("Addition of two number = %d" ,ans);
        break;

        case 2:
        ans = num1 - num2;
        printf ("Subtraction of two number is = %d",ans);
        break;

        case 3:
        ans = num1*num2;
        printf("Multiplication of two number is = %d" ,ans);
        break;

        case 4:
        ans = num1/num2;
        printf("Division of two number is = %d",ans);
        break;
    }
    return 0;
}
*/

/*
Q3 - Accept two numbers in variables x and y from the user and perform the following operations

#include<stdio.h>
int main(){
    int x ,y , operation,quotient,reminder ,temp ,number;
    printf("Enter the operation want to perform \n");
    printf("1 - Equality Check if x is equal to y \n");
    printf("2 - Less Than Check if x is less than y \n");
    printf("3 - Quotient and Remainder Divide x by y and display the quotient and remainder \n");
    printf("4 - Range : Accept a number and check if it lies between x and y (both inclusive) \n");
    printf("5 - Swap : Interchange x and y \n");
    scanf("%d",&operation);
    printf("Enter the x and y = \n");
    scanf("%d%d",x,y);
    switch (operation)
    {
        case 1:
        if (x==y)
        {
            printf("X is Equal to y");
        }
        else{
            printf("X is not Equal to Y");
        }
        break;

        case 2:
        if (x<y)
        {
            printf("X is Less than y");
        }
        else{
            printf("X is greater than Y");
        }
        break;

        case 3:
        quotient = x/y;
        reminder = x%y;
        printf("Quotient = %d and Reminder = %d ",quotient ,reminder);
        break;

        case 4:
        printf("Enter the number =");
        scanf("%d" ,&number);
        if (number<=x&&number>=y)
        {
            printf("The Entered Number is lies between range X and Y");
        }
        else {
            printf("The Number not in range");
        }
        
        case 5:
        temp = x;
        x=y;
        y= temp;
        printf("After swaping Number is X=%d and Y= %d" ,x,y);
        break;

        default:
        printf("Please Enter valid details");
        break;
    }
    return 0;
}
*/

/*
Q4 Accept radius from the user and write a program having menu with the following options and corresponding actions:
#include<stdio.h>
int main(){
    int operation, radious,area , circumference , volume;
    printf("Enter the operation want to perform \n");
    printf("1 - Area of Circle \n");
    printf("2 - Circumference of Circle \n");
    printf("3 - Volume of Sphere \n");
    scanf("%d",&operation);
    printf("Enter the radious of circle \n");
    scanf("%d",&radious);
    switch (operation)
    {
        case 1:
        area = 3.14* radious *radious;
        printf("Area of circle is = %d" ,area);
        break;
        case 2:
        circumference= 2 *3.14*radious;
        printf("Circumference of circle is = %d",circumference);
        break;
        case 3:
        volume = (4/3)*3.14*radious*radious;
        printf("Volume of sphere is = %d" ,volume);
        break;
        default:
        printf("Please enter valid details");
        break;
    }
return 0;
}
*/


/*
Q5 Write a program having menu that has three options - add, subtract or multiply two fractions. 
The two fractions and the options are taken as input and the result is displayed as output. 
Each fraction is read as two integers, numerator and denominator.
#include<stdio.h>
int main(){
    int choice;
    float num1,ans,deno1 , num2 , deno2;
    printf("Enter the first numerator and denominator = ");
    scanf("%f%f",&num1,&deno1);
    float fraction1=num1/deno1;
    printf("Enter the second numerator and denominator = ");
    scanf("%f%f",&num2,&deno2);
    float fraction2=num2/deno2;
    printf("Enter the choice 1 - add , 2 - subtract , 3 - multiply");
    scanf("%d",&choice);
    switch (choice)
    {
        case 1:
        ans= fraction1+fraction2;
        printf("Addition of two fraction is = %f \n" ,ans);
        break;
        case 2:
        ans=fraction1 -fraction2;
        printf("Subtraction of two fraction = %f \n" ,ans);
        break;
        case 3:
        ans=fraction1*fraction2;
        printf("Multiplication of two fraction is = %f \n",ans);
        break;
        default:printf("Please Enter the valid details");
        break;
    }
    return 0;
}*/