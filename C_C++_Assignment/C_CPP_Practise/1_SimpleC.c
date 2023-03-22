/*
Q1 - Accept the radius from user and compute the area and circumference of a circle.
#include<stdio.h>
int main()
{
int a,b,area,c;
printf("enter radius in cm =");
scanf("%d",&a);
area=3.14*a*a;
c=2*3.14*a;
printf("area of circle is =%d\n ",area);
printf("circumference of the circle is= %d ",c);
}*/


/*
Q2 - Accept a character from user and display ASCII value of it.
#include<stdio.h>
int main()
{
char a,b;
printf("enter any character you want=");
scanf("%c",&a);
printf("ASCII value of your entered char is %d ",a);
}
*/


/*
Q3 - Accept marks of 5 subjects (out of 100) of a student and display total marks and compute the percentage also.
#include<stdio.h>
int main()
{
int a,b,c,d,e,t;
float per;
printf("enter the marks of the math chem science history and english out of 100 marks");
scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
t=a+b+c+d+e;
per=t/5.0;
printf("total marks of student and percentage are %d %f",t,per);
}
*/


/*
Q4 - Accept the basic salary of an employee and compute the net salary after adding earnings and subtracting
deductions.
 PF is 2 % of basic
 Tax is 3 % of basic
 HRA is 5 % basic
 DA is 8 % of basic 
#include<stdio.h>
int main()
{
int a,b,q,e,s,c,m;
printf("enter the employee salary");
scanf("%d",&a);
m=a+0.05*a+0.08*a-0.02*a-0.03*a;
printf("final salary will be %d",m);
}
*/

/*
Q5 - Accept two numbers and swap two numbers using
i) Third variable
#include<stdio.h>
int main()
{
int a,b,temp;
printf("enter two numbers you want to swap=");
scanf("%d %d",&a,&b);
temp=a;
a=b;
b=temp;
printf("swap %d %d",a,b);
}

ii)  By performing arithmetic operations.
#include<stdio.h>
int main()
{
int a,b;
printf("enter the 2 numbers you want to swap=");
scanf("%d %d",&a,&b);
c=a+b;
a=c-a;
b=c-b;
printf("swap no are %d %d",a,b);
}
*/


/*
6) Accept dimensions of a cylinder and print the surface area and volume (Hint: surface area = 2πr 2 + 2πrh, volume = π r 2 h). Define a constant variable pi=3.14.
#include<stdio.h>
int main()
{
int a,volume,area,b;
printf("enter the radius and height  of the cylinder");
scanf("%d %d",&a,&b);
volume=3.14*a*a*b;
area=2*3.14*a*(a+b);
printf("volume of cylinder is %d and surface area is %d",volume,area);
}
*/


/*
Q7 - Accept temperatures in Fahrenheit (F) and print it in Celsius(C) and Kelvin (K) (Hint: C=5/9(F-32), K = C + 273.15)
#include<stdio.h>
int main()
{
int a,b,c;
printf("enter the temperature in Fahrenheit(F)");
scanf("%d",&a);
printf("your entered temperature is %dF\n",a);
b=((a-32)*5)/9;
c=b+273.15;
printf("your entered temperate in Celsius is %d\n",b);
printf("your entered temperate in kelvin is %d\n",c);
}
*/



