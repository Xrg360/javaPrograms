#include <stdio.h>
int n,top = -1,item; 
int a[50];
int push();
int pop();
int display();

int main()
{
    
    int choice;
    printf("Enter the size of array");
    scanf("%d",&n);
    while(1)
    {
        printf("\nChoices are: 1)Push()  2pop()  3)display()  4Exit()");
        printf("Enter your choice");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:push();
                    break;
            case 2: pop();
                    break;
            case 3: display();
                    break;
            case 4: break;
            default:printf("Invalid choice");
        }
    }
    


}

int push()
{
    
    printf("Enter the item to be inseted");
    scanf("%d",&item);
    if (top == n-1)
    {
        printf("Stack is full!!");
    }
    else
    {
        top = top+1;
        a[top] = item;
    }
}

int pop()
{
    if(top == -1)
    {
        printf("stack is empty");
    }
    else
    {
        item = a[top];
        top = top-1;
    }
}

int display()
{
    if(top == -1)
    {
        printf("stack is empty");
    }
    else{
        for(int i=0;i<=top;i++)
        {
            printf("%d ",a[i]);
        }
        printf("\n");
    }
}