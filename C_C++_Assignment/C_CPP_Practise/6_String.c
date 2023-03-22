/*
Q1 - Write a program which accepts a sentence from the user and alters it as follows: 
Every space is replaced by *, case of all alphabets is reversed, digits are replaced by?
#include<stdio.h>
#include<ctype.h>
#include<string.h>
int main()
{
 char str[100];
 printf("\n Enter any sentence:-");
 scanf("%c",&str);
     int i;
        for(i=0;i<=strlen(str)-1;i++)
        {
            if(str[i]==' ')
            str[i]='*';
            if(islower(str[i]))
            str[i]=toupper(str[i]);
            else
            str[i]=tolower(str[i]);
            if(isdigit(str[i]))
            str[i]='?';
        }
 printf("\n %s \n",str);
}
*/

/*
Q2 - Write a program that accepts n strings and displays the longest string. Use array of strings.
#include <stdio.h>
#include <string.h>
int main()
{
	char string[10][30];
	int i, n;
	printf("Enter number of strings to input\n");
	scanf("%d", &n);
	printf("Enter Strings one by one: \n");
	for(i=0; i< n ; i++) 
    {
		scanf("%s",string[i]);
	}
	printf("The length of each string: \n");
	for(i=0; i< n ; i++) 
    {
		printf("%s  ", string[i]);
		printf("%d\n", strlen(string[i]));
	}
	return 0;
}
*/

/*
Q3 - Write a menu driven program to perform the following operations on strings using standard library functions: 
Length, Reverse ,Concatenation,Copy,  Compare, Exit.
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main()
{
    char str1[20],str2[20];
    int ch,i,j;
    do
    {
        printf("\tMENU");
        printf("\n------------------------------\n");
        printf("1:Find Length of String");
        printf("\n2:Find Reverse of String");
        printf("\n3:Concatenate Strings");
        printf("\n4:Copy String ");
        printf("\n5:Compare Strings");
        printf("\n6:Exit");
        printf("\n------------------------------\n");
        printf("\nEnter your choice: ");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:
                printf("Enter String: ");
                scanf("%s",str1);
                i=strlen(str1);
                printf("Length of String : %d\n\n",i);
            break;
            case 2:
                printf("Enter String: ");
                scanf("%s",str1);
                strrev(str1);
                printf("Reverse string : %s\n\n",str1);
            break;
            case 3:
                printf("\nEnter First String: ");
                scanf("%s",str1);
                printf("Enter Second string: ");
                scanf("%s",str2);
                strcat(str1,str2);
                printf("String After Concatenation : %s\n\n",str1);
            break;
            case 4:
                printf("Enter a String1: ");
                scanf("%s",str1);
                printf("Enter a String2: ");
                scanf("%s",str2);
                printf("\nString Before Copied:\nString1=\"%s\",String2=\"%s\"\n",str1,str2);
                strcpy(str2,str1);
                printf("-----------------------------------------------\n");
                printf("\"We are copying string String1 to String2\" \n");
                printf("-----------------------------------------------\n");
                printf("String After Copied:\nString1=\"%s\", String2=\"%s\"\n\n",str1,str2);
            break;
            case 5:
                printf("Enter First String: ");
                scanf("%s",str1);
                printf("Enter Second String: ");
                scanf("%s",str2);
                j=strcmp(str1,str2);
                if(j==0)
                {
                    printf("Strings are Same\n\n");
                }
                else
                {
                    printf("Strings are Not Same\n\n");
                }
            break;
            case 6:
                exit(0);
            break;
            default:
                printf("Invalid Input. Please Enter valid Input.\n\n ");
        }
    }while(ch!=6);
    return 0;
}
*/