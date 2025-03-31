<<<<<<< HEAD
#include<stdio.h>
#include<stdlib.h>
#define MAX 5
    int stack[MAX];
    int top=-1;
    void PUSH(){
        int num;
        if (top==MAX-1){
            printf("Stack overflow");
        }
        else{
            printf("Enter element to the stack:\n");
            scanf("%d",&num);
    
            top+=1;
            stack[top]=num;
        }
    }
    void POP(){
        int num;
           if (top==-1){
                printf("Stack underflow");
           }
           else{
            num=stack[top];
            printf("The popped element is %d\n",num);
            top-=1;
        }
    }
    void display(){
        printf("The elements in the stack are:\n");
        for (int i = top; i >= 0; i--){
            printf("|%d|\n",stack[i]);
        }  
    }
    int main(){
        int choice;
    
        printf("what do you want to do:\n1.PUSH\n2.POP\n3.Display\n4.Exit\n");
        while (1){
            printf("Enter chocie");
            scanf("%d",&choice);
        switch (choice)
            {
            case 1:
                PUSH();
                break;
            
            case 2:
                POP();
                break;
            
            case 3:
                display();
                break;
            
            case 4:
                exit(0);
            }
    }
    return 0;  
=======
#include<stdio.h>
#include<stdlib.h>
#define MAX 5
    int stack[MAX];
    int top=-1;
    void PUSH(){
        int num;
        if (top==MAX-1){
            printf("Stack overflow");
        }
        else{
            printf("Enter element to the stack:\n");
            scanf("%d",&num);
    
            top+=1;
            stack[top]=num;
        }
    }
    void POP(){
        int num;
           if (top==-1){
                printf("Stack underflow");
           }
           else{
            num=stack[top];
            printf("The popped element is %d\n",num);
            top-=1;
        }
    }
    void display(){
        printf("The elements in the stack are:\n");
        for (int i = top; i >= 0; i--){
            printf("|%d|\n",stack[i]);
        }  
    }
    int main(){
        int choice;
    
        printf("what do you want to do:\n1.PUSH\n2.POP\n3.Display\n4.Exit\n");
        while (1){
            printf("Enter chocie");
            scanf("%d",&choice);
        switch (choice)
            {
            case 1:
                PUSH();
                break;
            
            case 2:
                POP();
                break;
            
            case 3:
                display();
                break;
            
            case 4:
                exit(0);
            }
    }
    return 0;  
>>>>>>> 79eedcdaf8035c8fb55deef46abdc7cdbd8a02de
}