/*
Q1 - Write a program to accept an integer and check if it is even or odd.
#include<stdio.h>
int main(){
    int num;
    printf("Enter the Number");
    scanf("%d",&num); 
    if(num%2==0){
        printf("Number is even");
    }
    else{
        printf("Number is Odd");
    }
    return 0;
}*/



/*
Q2  Write a program to accept a number and check if it is divisible by 5 and 7.
#include<stdio.h>
int main(){
    int num;
    printf("Enter the Number");
    scanf("%d",&num); 
    if(num%5==0&&num%7==0){
        printf("Number is divisible by 5 and 7");
    }
    else{
       printf("Number is not divisible by 5 and 7");
    }
    return 0;
}
*/


/*
Q3 - Write a program, which accepts annual basic salary of an employee and calculates and displays the 
Income tax as per the following rules.
Basic: < 1, 50,000 Tax = 0  1,50,000 to 3,00,000 Tax = 20%  >3,00,000 Tax = 30%

#include<stdio.h>
int main(){
    int salary;
    printf("Enter basic salary of employee = ");
    scanf("%d",&salary); 
    if(salary<150000){
        salary = salary - 0;
        printf("Income Tax as per slab rate  =  %d \n",salary);
    }
    if (salary >150000 && salary <300000)
    {
        salary = salary - 0.2 * salary;
        printf("Income Tax as per 20 percent slab rate  =  %d \n",salary);
    }
    if(salary > 300000){
        salary = salary - 0.3 * salary;
        printf("Income Tax as per 30 percent slab rate =  %d \n",salary);
    }
    return 0;
}
*/


/*
Q4 - Accept a lowercase character from the user and check whether 
the character is a vowel or consonant. (Hint: a, e, i, o, u are vowels)
#include<stdio.h>
int main(){
    char ch ,a,e,i,o,u;    
    printf("Enter the character = ");
    scanf("%c",&ch);
    if (ch==97||ch==101||ch==105||ch==111||ch==117)
    {
        printf("Enter character is vowel");
    }
    else
    {
        printf("Enter character is consonant");
    }
    return 0;
}
*/


/*
Q5 - Write a C program to input angles of a triangle and check whether triangle is valid or not.
#include<stdio.h>
int main(){
    int angle1,angle2 , angle3 ,Angle;
    printf("Enter the first angle of triangle = ");
    scanf ("%d",&angle1);
    printf("Enter the second angle of triangle = ");
    scanf ("%d",&angle2);
    printf("Enter the third angle of triangle = ");
    scanf ("%d",&angle3);
    Angle = angle1 + angle2 + angle3;
    if (Angle==180)
    {
        printf("This angle is valid triangle");
    }
    else
    {
        printf("This angle is not  valid triangle");
    }
    return 0 ;
}
*/

/*Q6 - Write a C program to check whether a entered character is uppercase or lowercase alphabet
#include<stdio.h>
int main(){
    char ch;
    printf("Enter the character for check = ");
    scanf("%c", &ch);
    if(ch>=65&&ch<=90){
        printf("Character is Uppercase");
    }
    if (ch>=97&&ch<=122)
    {
        printf("Character is Smallcase");
    }
    return 0;
}*/


/*Q7 - Write a C program to accept a character and invert the case of it.
#include<stdio.h>
int main(){
    char ch;
    printf("Enter the charcter = ");
    scanf("%c",&ch);
    if(ch>=65&&ch<=90){
        ch = ch + 32;
        printf("This Uppercase character converted to lowercase = %c \n",ch);
    }
    else {  
        ch = ch - 32;
        printf("This lowercase character converted to Uppercase = %c \n",ch);
    }
    return 0;
}
*/

/*Q8 - Write a program to accept 3 numbers and compute minimum and maximum from them.
#include<stdio.h>
int main(){
    int num1 ,num2, num3,min, max;
    printf("Enter the Any Threee Natural Number =");
    scanf("%d%d%d", &num1, &num2, &num3);
    max = num1;
    if (num1<num2)
    {
        max = num2;
    }
    if (num2<num3)
    {
        max=num3;
    }
    printf("Maximum number in three number = %d" ,max);
    return 0;
}
*/