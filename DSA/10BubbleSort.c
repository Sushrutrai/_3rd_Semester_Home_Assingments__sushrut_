#include <stdio.h>
#define MAX 100
int main(){
    int num;
    int arr[MAX];
    int flag=0,key;
    printf("How many elements do you want to enter :\n");
    scanf("%d",&num);
    printf("Enter the elements into the array:\n");
    for (int i = 0; i < num; i++){
        scanf("%d",&arr[i]);
    }
    int temp=0;
    for (int i = 0; i < num-1; i++){
        for (int j = 0; j < num-i-1; j++){
            if (arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    printf("Sorted array:\n");
    for (int i = 0; i < num; i++){
        printf("%d\t",arr[i]);
    }
    return 0;
}