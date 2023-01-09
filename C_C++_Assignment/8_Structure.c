/*#include<stdio.h>
int main(){
    struct student
    {
        int Rnumber;
        char name[50];
        int marks1;
        int marks2;
        int marks3;
        float percentage;
    };
    struct student s1,s2,s3,s4;
    printf("Enter the Roll Number,Name,Marks of subjects and Percentage of Student 1 \n");
    scanf("%d %s %d %d %d %f",&s1.Rnumber,&s1.name,&s1.marks1,&s1.marks2,&s1.marks3,&s1.percentage);
    
    printf("Enter the Roll Number,Name,Marks of subjects and Percentage of Student 2 \n");
    scanf("%d %s %d %d %d %f",&s2.Rnumber,&s2.name,&s2.marks1,&s2.marks2,&s2.marks3,&s2.percentage);
    
    printf("Enter the Roll Number,Name,Marks of subjects and Percentage of Student 3 \n");
    scanf("%d %s %d %d %d %f",&s3.Rnumber,&s3.name,&s3.marks1,&s3.marks2,&s3.marks3,&s3.percentage);
    
    printf("Enter the Roll Number,Name,Marks of subjects and Percentage of Student 4 \n");
    scanf("%d %s %d %d %d %f",&s4.Rnumber,&s4.name,&s4.marks1,&s4.marks2,&s4.marks3,&s4.percentage);

    printf("Roll Number:%d\nName:%s \nMark of first subject:%d \nMark of second subject: %d \nMark of Third Subject:%d \nPercetange:%f",s1.Rnumber,s1.name,s1.marks1,s1.marks2,s1.marks3,s1.percentage);
    printf("Roll Number:%d\nName:%s \nMark of first subject:%d \nMark of second subject: %d \nMark of Third Subject:%d \nPercetange:%f",s2.Rnumber,s2.name,s2.marks1,s2.marks2,s2.marks3,s2.percentage);
    printf("Roll Number:%d\nName:%s \nMark of first subject:%d \nMark of second subject: %d \nMark of Third Subject:%d \nPercetange:%f",s3.Rnumber,s3.name,s3.marks1,s3.marks2,s3.marks3,s3.percentage);
    printf("Roll Number:%d\nName:%s \nMark of first subject:%d \nMark of second subject: %d \nMark of Third Subject:%d \nPercetange:%f",s4.Rnumber,s4.name,s4.marks1,s4.marks2,s4.marks3,s4.percentage);

    printf("Enter The Operation you want to perform:");
    printf("1 - Search \n");
    printf("2 - Modify \n");
    printf("3 - Display all student details \n");
    printf("4 - Display all student having percentage > 80 \n");
    printf("5 - Display student having maximum percentage \n");
    int o,c;
    scanf("%d",&o);
    switch (o)
    {
        case 1 :
                printf("Choose Option for search:");
                printf("Roll Number ")
        break;
    
        default:
        break;
    }
    return 0;
}*/

// Q1 - Create a structure student (roll number, name, marks of 3 subjects, percentage). 
//Accept details of n students and write a menu driven program to perform the following operations.
// Write separate functions for the different options.
// i) Search
// ii) Modify
// iii) Display all student details
// iv) Display all student having percentage > 80
// v) Display student having maximum percentage
/*
#include<stdio.h>
#include<string.h>
struct student 
{
	int roll_no,mark,fileo,proc;
	char name[20];
	float percent;
};
void Search(struct student S[],int size);
void Modify(struct student S[],int size,int roll_no);
void DisplayAll(struct student S[],int size);
void PercentGT(struct student S[],float checkPercent,int size);
void MaxPercent(struct student S[],int size);
void main()
{
	struct student S[200];
	int i,roll_no,size,ope;
	float checkPercent;
	printf("\n How many students are there:- ");
	scanf(" %d",&size);
	printf("\n Enter the information of students as follow:- \n \n");
	printf("\n Roll No\t Name \t Maths \t File Organisation \t Programming In C \n \n");
 
	for(i=0;i<size;i++)
	{
	scanf(" %d %s %d %d %d",&S[i].roll_no,S[i].name,&S[i].mark,&S[i].fileo,&S[i].proc);
	S[i].percent=(S[i].mark+S[i].fileo+S[i].proc)/3;
	}
	do{
	printf("\n \t ***** Menu *****");
	printf("\n 1.Search");
	printf("\n 2.Modify");
	printf("\n 3.Display all student details");
	printf("\n 4.Display all students having percentage greater than ___");
	printf("\n 5.Display student having maximum percentage");
	printf("\n 6.Exit \n \n");
	printf("\n Enter Your Choice:- ");
	scanf(" %d",&ope);
	switch(ope)
	{
	case 1:
	Search(S,size);
	break;
	case 2:
	printf("\n Enter roll no to modify the details:- ");
	scanf(" %d",&roll_no);
	Modify(S,size,roll_no);
	break; 
	case 3:
	DisplayAll(S,size);
	break;
	case 4:
	printf("\n Enter percentage:- ");
	scanf("%f",&checkPercent);
	PercentGT(S,checkPercent,size);
	break;
	case 5:
	MaxPercent(S,size);
	break;
	}}while(ope!=6);
}
void Search(struct student S[],int size)
{
	char name[20];
	int i,flg=0,roll_no,searchBy;
	do{
	printf("\n How do you want to search:- 1.By Roll No \n \t\t\t     2.By Name \n");
	scanf(" %d",&searchBy);
   
	if(searchBy==1)
	{
	printf("\n Enter roll no of the student:- ");
	scanf(" %d",&roll_no);
	} 
	else
	{
	printf("\n Enter the name of the student:- ");
	scanf(" %s",name);
	}}while(searchBy<1 || searchBy>2);
	for(i=0;i<size;i++)
	{
		if(S[i].roll_no==roll_no || strcmp(S[i].name,name)==0)
		{
		flg=1;
		break;
		}
	} 
 
	if(flg==1)
	{
	printf("\n We have found this result:- \n ");
	printf("\n Roll No\t Name \t Mathematics \t File Organisation \t Programming In C  \t Percentage \n \n"); 
	printf("\n %d \t\t %s \t %6d \t\t %1d \t\t %8d \t\t %f \n",S[i].roll_no,S[i].name,S[i].mark,S[i].fileo,S[i].proc,S[i].percent);
	}
	else
	printf("\n We haven't found any record \n \n");
}
// Modify Function
void Modify(struct student S[],int size,int roll_no)
{
	char name[20]; 
	int i,update,newData;
	do{
	printf("\n What do you want to update:- 1.Roll NO \n \t\t\t      2.Name \n \t\t\t      3.Marks of 'Mathematics' \n \t\t\t      4.Marks of 'File Organisation' \n \t\t\t      5.Marks of 'Programming in C' \n");
	scanf(" %d",&update);
	if(update==3 || update==4 || update==5)
	{
	printf("\n Enter new marks:- ");
	scanf("%d",&newData);
	}
	else if(update==1)
	{
	printf("\n Enter new roll no:- ");
	scanf(" %d",&newData);
	}
	else if(update==2)
	{
	printf("\n Enter new name:- ");
	scanf(" %s",name);
	}
	else 
	{
	printf("\n Please make a valid choice \n \n"); 
	}
 
	}while(update<1 || update>5);
	for(i=0;i<size;i++)
	{
		if(S[i].roll_no==roll_no)
		{
			if(update==1)
			{
			S[i].roll_no=newData;
			break;
			}   
			else if(update==3)
			{
			S[i].mark=newData;
			break;
			} 
			else if(update==4)
			{
			S[i].fileo=newData;
			break;
			} 
			else if(update==5)
			{
			S[i].proc=newData;
			break;
			}
			else
			{
			strcpy(S[i].name,name);
			break; 
			} 
		}
	}
 
	printf("\n Modified details of students are as follows:- \n");
	printf("\n Roll No\t Name \t Mathematics \t File Organisation \t Programming In C  \t Percentage \n \n");
	for(i=0;i<size;i++)
	{ 
	printf("\n %d \t\t %s \t %6d \t\t %1d \t\t %8d \t\t %f \n",S[i].roll_no,S[i].name,S[i].mark,S[i].fileo,S[i].proc,S[i].percent); 
	}
}
// DisplayAll Function
void DisplayAll(struct student S[200],int size)
{
	int i;
	printf("\n The Information of students is as follow:- \n \n");
	printf("\n Roll No\t Name \t Mathematics \t File Organisation \t Programming In C  \t Percentage \n \n"); 
 
	for(i=0;i<size;i++)
	printf("\n %d \t\t %s \t %6d \t\t %1d \t\t %8d \t\t %f \n",S[i].roll_no,S[i].name,S[i].mark,S[i].fileo,S[i].proc,S[i].percent);
}
// PercentGT Function
void PercentGT(struct student S[],float checkPercent,int size)
{
	int i;
	printf("\n The Information of students who scored percentage>%f :- \n \n",checkPercent);
	printf("\n Roll No\t Name \t Mathematics \t File Organisation \t Programming In C  \t Percentage \n \n"); 
 
	for(i=0;i<size;i++)
	{
		if(S[i].percent>checkPercent)
		{
		printf("\n %d \t\t %s \t %6d \t\t %1d \t\t %8d \t\t %f \n",S[i].roll_no,S[i].name,S[i].mark,S[i].fileo,S[i].proc,S[i].percent);
		}
	}
}
// MaxPercent Function
void MaxPercent(struct student S[200],int size)
{
	int i;
	float maxPercent=S[0].percent;
	for(i=0;i<size;i++)
		if(S[i].percent>maxPercent)
		{  
		maxPercent=S[i].percent;
		break;
		}
	printf("\n \"%s\" scored maximum percentage. Below are his details:- - \n ",S[i].name);
	printf("\n Roll No\t Name \t Mathematics \t File Organisation \t Programming In C  \t Percentage \n \n"); 
	printf("\n %d \t\t %s \t %6d \t\t %1d \t\t %8d \t\t %f \n",S[i].roll_no,S[i].name,S[i].mark,S[i].fileo,S[i].proc,S[i].percent);
}*/

// Q2 -Create a structure employee (id, name, salary). Accept details of n employees and write a menu driven program to perform the following operations. Write separate functions for the different options.
// i) Search by name
// ii) Search by id
// iii) Display all
// iv) Display all employees having salary > 25000
// v) Display employee having maximum

/*
#include<stdio.h>
#include<string.h>
struct employee
{
	int id, salary;
	char name[20];
};
void main()
{
	struct employee S[200];
	int i,id,size,ope,checksalary;
	printf("\n How many employee are there:- ");
	scanf(" %d",&size);
	printf("\n Enter the information of employee as follow:- \n \n");
	printf("\n ID\t Name \t Salary \n \n");
 
	for(i=0;i<size;i++)
	{
	scanf(" %d %s %d ",&S[i].id,S[i].name,&S[i].salary);
	}
	do{
	printf("\n \t ***** Menu *****");
	printf("\n 1.Search by Name");
	printf("\n 2.Search by ID");
    printf("\n 3.Display all");
	printf("\n 4.Display all employee having salary more than 25000");
	printf("\n 5.Display employee having maximum salary");
	printf("\n 6.Exit \n \n");
	printf("\n Enter Your Choice:- ");
	scanf(" %d",&ope);
	switch(ope)
	{
	case 1:
	Searchbyname(S,size);
	break;
	case 2:
	SearchbyID(S,size);
	break; 
	case 3:
	DisplayAll(S,size);
	break;
    case 4:
    printf("\n salary:- ");
	scanf("%f",&checksalary);
	salaryGT(S,checksalary,size);
    break;
	case 5:
	MaxSalary(S,size);
	break;
	}}while(ope!=6);
}
void Searchbyname(struct employee S[],int size)
{
	char name[20];
	int i,flg=0;
	printf("\n Enter the name of the employee:- ");
	scanf(" %s",name);
	for(i=0;i<size;i++)
	{
		if(strcmp(S[i].name,name)==0)
		{
		flg=1;
		break;
		}
	} 
	if(flg==1)
	{
	printf("\n We have found this result:- \n ");
	printf("\n ID \t Name \t Salary \n \n"); 
	printf("\n %d \t\t %s \t %6d \t\t",S[i].id,S[i].name,S[i].salary);
	}
	else
	printf("\n We haven't found any record \n \n");
}
void SearchbyID(struct employee S[],int size)
{
	char name[20],flag=0;
	int i,id,searchBy;
	printf("\n Enter ID no of the employee:- ");
	scanf(" %d",&id);
	for(i=0;i<size;i++)
	{
		if(S[i].id==id)
		{
		flag=1;
		break;
		}
	}
	if(flag==1)
	{
	printf("\n We have found this result:- \n ");
	printf("\n ID\t Name \t Salary \t "); 
	printf("\n %d \t\t %s \t %6d ",S[i].id,S[i].name,S[i].salary);
	}
	else
	printf("\n We haven't found any record \n \n");
}
// void salaryGT(struct employee S[],int checksalary,int size)
// {
// 	int i;
// 	printf("\n The Information of students who scored percentage>%f :- \n \n",checksalary);
// 	printf("\n Roll No\t Name \t Mathematics \t File Organisation \t Programming In C  \t Percentage \n \n"); 
 
// 	for(i=0;i<size;i++)
// 	{
// 		if(S[i].salary>checksalary)
// 		{
// 		printf("\n %d \t\t %s \t %6d \t\t ",S[i].id,S[i].name,S[i].salary);
// 		}
// 	}
// }
// DisplayAll Function
void DisplayAll(struct employee S[200],int size)
{
	int i;
	printf("\n The Information of employee is as follow:- \n \n");
	printf("\n ID \t Name \t Salary \t \n \n"); 
	for(i=0;i<size;i++)
	printf("\n %d \t\t %s \t %6d \t\t ",S[i].id,S[i].name,S[i].salary);
}
// salary GT Function
void salaryGT(struct employee S[],int checksalary,int size)
{
	int i;
	printf("\n The Information of employee who scored percentage>%f :- \n \n",checksalary);
	printf("\n ID\t Name \t salary \n \n"); 
	for(i=0;i<size;i++)
	{
		if(S[i].salary>checksalary)
		{
		printf("\n %d \t\t %s \t %6d \t\t ",S[i].id,S[i].name,S[i].salary);
		}
	}
}
// MaxSalary Function
void MaxSalary(struct employee S[200],int size)
{
	int i;
	int maxSalary=S[0].salary;
	for(i=0;i<size;i++)
		if(S[i].salary>maxSalary)
		{  
		maxSalary=S[i].salary;
		break;
		}
	printf("\n \"%s\" scored maximum salary. Below are his details:- - \n ",S[i].name);
	printf("\n ID\t Name \t Salary \t "); 
	printf("\n %d \t\t %s \t %6d \t\t ",S[i].id,S[i].name,S[i].salary);
}
*/


// Q3 - The following structure is for a library book with the following details: id, title, publisher, code (1 – Text book, 2 – Magazine, 3 – Reference book). If the code is 1, store no-of-copies. If code = 2, store the issue month name. If code = 3, store edition number. Also store the cost.
// struct library_book
// {
//      int id;
//      char title[80];
//      char publisher[20] ;
//      int code;
//      union u {
//      int no_of_copies;
//      char month[10];
//      int edition;
//  }info;
//  int cost;
// };
// Write a program to accept details of n books. Use switch - case to accept the code and details according to the code.
// #include<stdio.h>
// #include<string.h>
// struct library_book
// {
//    int id;
//    char title[80];
//    char publisher[20] ;
//    int code;
//    union u {
//        int no_of_copies;
//        char month[10];
//        int edition;
//    }info;
//    int cost;
// };
// int main(){
//    library_book book{};
//    std::cin>>book.id;
//    std::cin>>book.title;
//    std::cin>>book.cost;
//    std::cout << "1 – Text book, 2 – Magazine, 3 – Reference book.";
//    int condition;
//    std::cin>>condition;
//    switch (condition){
//        case 1: std::cin>>book.info.no_of_copies;
//        case 2: std::cin>>book.info.month;
//        case 3: std::cin>>book.info.edition;
//        default: std::cout<<"Enter Correct choice";
//    }
// }









