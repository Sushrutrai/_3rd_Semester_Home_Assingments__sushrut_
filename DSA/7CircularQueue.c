#include<stdio.h>
#include<stdlib.h>
#define MAX 5
//queue has enqueue ,dequeue and display features
int cq[MAX];
int front=-1;
int rear=-1;
void enqueue(){
    if (rear==MAX-1){
        printf("Queue overflow\n");
    }
    else{
        int num;
        rear+=1;
        printf("Enter a integer:\n");
        scanf("%d",&num);
        cq[rear]=num;
    }
}
void dequeue(){
    if (front>rear){
        printf("Queue underflow\n");
    }
    else{
        int num;
        num=cq[front];
        printf("Deleted item is %d\n",num);
        front+=1;
    }
}
void display(){
    if (front>rear){
        printf("The queue is empty\n");
    }
    else{
        printf("front-->\t");
        for (int i = front; i <= rear; i++){
            printf("%d\t",cq[i]);
        }
        printf("<--rear\n");
    }
}
int main(){
    int choice;
    while(1){
    printf("1.Enqueue\n2.Dequeue\n3.DIsplay\n4.Exit\n");
    scanf("%d",&choice);
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
            exit(0);
        default:
            printf("please enter a valid choice\n");
            break;
        }
    }
    return 0;
}
