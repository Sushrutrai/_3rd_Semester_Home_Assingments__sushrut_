#include<stdio.h>
#define MAX 100     
void selection(int arr[],int n){        
      for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex])
                minIndex = j;
        }
        if (minIndex != i) {
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
int main(){
    int num;
    int arr[MAX];
    printf("How many elements do you want to enter :\n");
    scanf("%d",&num);
    printf("Enter the elements into the array:\n");
    for (int i = 0; i < num; i++){
        scanf("%d",&arr[i]);
    }
    printf("Array before sorting:\n");  
    for (int i = 0; i < num; i++){
        printf("%d\t",arr[i]);
    }
    selection(arr, num);
    printf("\nArray after sorting:\n"); 
    for (int i = 0; i < num; i++){
        printf("%d\t",arr[i]);
    }
}