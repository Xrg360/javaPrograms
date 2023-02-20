#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node*llink,*rlink;
}*newnode,*head,*temp;
int item , loc;
void insertatfront();
void insertatend();
void insertatspec();
void deleteatfront();
void deleteatend();
void deleteatspec();
void display();

void main()
{
    int choice;
    while(1)
    {
        printf("\nChoose one option from the following\n");   
        printf("\n1.Insert at front \n 2.Insert at end\n 3.Insert at a specific location\n4.Delete from front\n5. Delete from end \n6. Delete from specifc loc \n 7. display \n8.Exit\n");
        printf("\nEnter your choice?\n");  
        scanf("\n%d",&choice);  
        switch(choice)
        {
            case 1: insertatfront();
                    break;
            case 2: insertatend();
                    break;
            case 3: insertatspec();
                    break;
            case 4: deleteatfront();
                    break;
            case 5: deleteatend();
                    break;
            case 6: deleteatspec();
                    break;
            case 7: display();
                    break;
            case 8: exit(0);
            default: printf("Invalid choice");
            
        }
    }

}

void insertatfront()
{
    printf("Enter the item to be inserted");
    scanf("%d",&item);
    newnode = (struct node*)malloc(sizeof(struct node));
    newnode -> data = item;
    newnode ->llink = newnode -> rlink = NULL;
    if(head == NULL)
    {
        head = newnode;
    }
    else
    {
        newnode -> rlink = head;
        head -> llink = newnode;
        head = newnode;
    }
}

void insertatend()
{
    printf("Enter the item to be inserted");
    scanf("%d",&item);
    newnode = (struct node*)malloc(sizeof(struct node));
    newnode -> data = item;
    newnode ->llink = newnode -> rlink = NULL;
    if(head == NULL)
    {
        head = newnode;
    }
    else{
        temp = head;
        while(temp->rlink != NULL)
        {
            temp = temp ->rlink;
        }
        temp ->rlink = newnode;
        newnode -> llink = temp;
    }
    
}

void insertatspec()
{
    printf("Enter the item and the location at which it is to be inserted");
    scanf("%d %d",&item,&loc);
    if(head == NULL)
    {
        printf("Insertion not possible");
    }
    else
    {
        int c =1;
        while(temp->rlink != NULL && c <= loc)
        {
            temp = temp->rlink;
            c++;
        }
        if(temp->rlink == NULL)
        {
            printf("Insertion not possible");
        }
        else
        {
            newnode = (struct node*)malloc(sizeof(struct node));
            newnode -> data = item;
            newnode -> rlink =  temp -> rlink;
            temp->rlink->llink = newnode;
            newnode ->llink = temp;
            temp -> rlink = newnode;
            
        }
    }
}

void deleteatfront()
{
    if(head == NULL)
    {
        printf("deletion not possible");
    }
    else if(head->rlink = NULL)
    {
        temp = head;
        head = NULL;
        free(temp);
    }
    else{
        temp = head;
        head =  head ->rlink;
        head -> llink = NULL;
        free(temp);
    }
}

void deleteatend()
{
    if(head == NULL)
    {
        printf("deletion not possible");
    }
    else if(head->rlink = NULL)
    {
        temp = head;
        head = NULL;
        free(temp);
    }
    else{
        temp = head;
        while(temp->rlink != NULL)
        {
            temp = temp -> rlink;
        }
        temp -> llink -> rlink = NULL;
        free(temp);
    }
}

void deleteatspec()
{
    printf("enter the item to be deleted"); 
    scanf("%d",&item);
    if(head == NULL)
    {
        printf("deletion not possible");
    }
    else if(head->rlink = NULL)
    {
        if(head->data = item)
        {
            temp = head;
            head = head->rlink;
            free(temp);
        }
        else{
            printf("Data not dound:deletion not possible");
        }
    }
    else{
        temp = head;
        while(temp->rlink != NULL && temp -> data != item)
        {
            temp = temp -> rlink;
        }
        if(temp->data != item)
        {
            printf("Deletion not possible");
        }
        else
        {
            temp -> llink -> rlink = temp->rlink;
            if(temp -> rlink != NULL)
            {
                temp->rlink->llink = temp -> llink;
            }
            free(temp);
        }
    }

}

void display()
{
    temp = head;
    while(temp !=NULL)
    {
        printf("%d",temp->data);
        temp = temp->rlink;
    }
}