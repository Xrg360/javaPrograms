#include <stdio.h>
#include <stdlib.h>
int n, front = -1, rear = -1, item;
int a[50];
void enqueue();
void dequeue();
void display();
int isFull()
{
    if (rear == n - 1)
    {
        printf("queue full");
        return 1;
    }
    else
        return 0;
}
int isEmpty()
{
    if (rear == -1)
    {
        printf("queue empty");
        return 1;
    }
    else
        return 0;
}
void enqueue()
{
    printf("enter the number to be enqueued");
    scanf("%d", &item);
    if (!isFull())
    {
        if (front == -1)
        {
            front++;
            rear++;
            a[rear] = item;
        }
        else
        {
            rear++;
            a[rear] = item;
        }
    }
}
void dequeue()
{
    if (!isEmpty())
    {
        printf("%d is going to be deleted", a[rear]);
        if (front == rear)
            front = rear = -1;
        else
            rear--;
    }
}
void display()
{
    if (!isEmpty())
    {
        for (int i = 0; i <= rear; i++)
        {
            printf("%d ", a[i]);
        }
    }
}
int main()
{
    int choice;
    printf("Enter the size of array");
    scanf("%d", &n);
    while (1)
    {
        printf("\nChoices are: 1)enQueue()  2)deQueue()  3)display()  4Exit()");
        printf("Enter your choice");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            enqueue();
            break;
        case 2:
            dequeue();
            break;
        case 3:
            display();
            break;
        case 4:
            return 0;
        default:
            printf("Invalid choice");
        }
    }
    return 0;
}