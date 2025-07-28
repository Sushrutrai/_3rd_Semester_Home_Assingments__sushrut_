#include<stdio.h>
int main(){
    int array[100],key,c,n;
    printf("Enter number of elements in a array:");
    scanf("%d",&n);
    printf("Enter the elements of the array:\n");
    for (c = 0; c < n; c++){
        scanf("%d",&array[c]);
    }
    printf("Enter the element to be searched:");
    scanf("%d",&key);
    for(c=0;c<n;c++){
        if(array[c]==key){
            printf("Element found at position %d\n",c+1);
            break;
        }
    }
    if(c==n){
        printf("Element not found\n");
    }
}