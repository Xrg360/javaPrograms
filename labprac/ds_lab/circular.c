#include <stdio.h>
#include <stdlib.h>
int n,rear = -1,front= -1,item; 
int a[50];
int Enqueue();
int Dequeue();
int display();

int main()
{
    
    int choice;
    printf("Enter the size of array: ");
    scanf("%d",&n);
    while(1)
    {
        printf("Choices are: 1)Enqueue()  2)Dequeue()  3)display()  4Exit()\n");
        printf("Enter your choice: ");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:Enqueue();
                    break;
            case 2: Dequeue();
                    break;
            case 3: display();
                    break;
            case 4: exit(0) ;
            default:printf("Invalid choice");
        }
    }
}

int Enqueue()
{
    
    
    if (front == (rear+1)%n)
    {
        printf("queue is full!!");
    }
    else
    {
        printf("Enter the item to be inseted: ");
        scanf("%d",&item);
        rear = (rear+1)%n;
        a[rear] = item;
        //added
        if (front == -1)
        {
            front++;
        }
        
    }
}

int Dequeue()
{
    if(front== -1 && rear == -1)
    {
        printf("queue is empty");
    }
    else
    {
        printf("element deleted is %d\n",a[front]);
        //added
        if (front ==  rear)
        {
            front= rear= -1;
        }
        else
            front = (front+1)%n;
    }
}

int display()
{
    if(front == -1 && rear == -1)
    {
        printf("queue is empty");
    }
    else{
        int i;
        for( i=front;i<rear;i=(i+1)%n)
        {
            printf("%d " ,a[i]);
        }
        printf("%d " ,a[i]);
        
        printf("\n");
    }
}