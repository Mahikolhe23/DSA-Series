/*
Q3 - The following structure is for a library book with the following details:
id, title, publisher, code (1 – Text book, 2 – Magazine, 3 – Reference book). If the code is 1,
store no-of-copies. If code = 2, store the issue month name. If code = 3, store edition number. Also store the cost.struct library_book
#include <stdio.h>
#include<stdlib.h>
struct library_book
{
    int id;
    char title[80];
    char publisher[20];
    union u
    {
        int no_of_copies;
        char month[10];
        int edition;
    } info;
    int cost;
};
int main()
{
    struct library_book b[200];
    int code, n, i;
    do
    {
        printf(".....MENU.....\n");
        printf("Please Enter the code of book \n");
        printf("1 - Text Book \n");
        printf("2 - Magazine \n");
        printf("3 - Reference Book \n");
        printf("4 - Exit\n");
        printf("..............\n");
        scanf("%d", &code);
        switch (code)
        {
        case 1:
            printf("How Many Books are there:\n");
            scanf("%d", &n);
            printf("Enter the details of book :\n");
            printf("ID\t TITLE in Character \t PUBLISHER in Character \t NUMBER OF COPIES\t COST\t \n");
            for (i = 0; i < n; i++)
            {
                scanf("%d %s %s %d %d", &b[i].id, b[i].title, b[i].publisher, &b[i].info.no_of_copies, &b[i].cost);
            }
            printf("Details found of books:\n");
            printf("ID\t TITLE in Character \t PUBLISHER in Character \t NUMBER OF COPIES\t COST\t \n");
            for (i = 0; i < n; i++)
            {
                printf("%d %21s %21s %30d %15d\n", b[i].id, b[i].title, b[i].publisher, b[i].info.no_of_copies, b[i].cost);
            }
            break;

        case 2:
            printf("How many book are there:\n");
            scanf("%d", &n);
            printf("Enter the details of book :\n");
            printf("ID\t TITLE in Character\t PUBLISHER in Character\t MONTH NAME in Character \t COST\t \n");
            for (i = 0; i < n; i++)
            {
                scanf("%d %s %s %s %d", &b[i].id, b[i].title, b[i].publisher, b[i].info.month, &b[i].cost);
            }
            printf("Details of books :\n");
            printf("ID\t TITLE in Character \t PUBLISHER in Character \t MONTH NAME in Character \t COST\t \n");
            for (i = 0; i < n; i++)
            {
                printf("%d %8s %23s %31s %31d\n", b[i].id, b[i].title, b[i].publisher, b[i].info.month, b[i].cost);
            }
            break;

        case 3:
            printf("How many books are there: \n");
            scanf("%d", &n);
            printf("Enter the details of book :\n");
            printf("ID\t TITLE in Character\t PUBLISHER in Character\t EDITION NUMBER \t COST\t \n");
            for (i = 0; i < n; i++)
            {
                scanf("%d %s %s %d %d", &b[i].id, b[i].title, b[i].publisher, &b[i].info.edition, &b[i].cost);
            }
            printf("Enter the details of book :\n");
            printf("ID\t TITLE in Character \t PUBLISHER in Character \t EDITION NUMBER \t COST\t \n");
            for (i = 0; i < n; i++)
            {
                printf("%d %7s %28s %35d %35d\n", b[i].id, b[i].title, b[i].publisher, b[i].info.edition, b[i].cost);
            }
            break;
        case 4:
            exit(1);
            break;

        default:
            printf("Enter the correct details ");
        }
    } while (code != 4);
    return 0;
}*/