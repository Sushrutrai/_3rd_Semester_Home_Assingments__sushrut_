#include<stdio.h>
#define MAX 100
int Binarysearch(int a[MAX],int left,int right,int key){
    int middle;
    if(left<=right){
        middle=(left+right)/2;
        if (key==a[middle]){
           return middle;
        }
        else if(key<a[middle]){
            return Binarysearch(a,left,middle-1,key);
        }
        else
            return Binarysearch(a,middle+1,right,key);     
    }
    else
    return -1;
}
int main(){
    int num;
    int arr[MAX];
    int flag=0,key;
    printf("How many elements do you want to enter :\n");
    scanf("%d",&num);
    printf("Enter the elements into the array:\n");
    for (int i = 0; i < num; i++)
    {
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
    for (int i = 0; i < num; i++)
    {
        printf("%d\t",arr[i]);
    }
    printf("Enter the item you want to search for:\n");
    scanf("%d",&key);
    flag=Binarysearch(arr,0,num-1,key);
    if (flag==-1){
        printf("Element not found .\nSearch Unsuccessful!!\n");
    }
    else{
        printf("Element found at %d location.",flag+1);
    }
}