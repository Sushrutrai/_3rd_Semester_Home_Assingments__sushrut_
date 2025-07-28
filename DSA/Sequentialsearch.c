 #include<stdio.h>
int main(){
    int a[100],n,key,i;
    printf("Enter number of elements:\n");
    scanf("%d",&n);
    printf("Enter %d elements into the array:\n",n);
    for ( i = 0; i < n; i++){
        scanf("%d",&a[i]);
    }
    printf("Enter the element you want to search for:\n");
    scanf("%d",&key);
    for (i = 0; i < n; i++){
        if (a[i]==key)
        {
           printf("found the element %d at %d location\n",key,i+1);
           break;
        }
    }
    if(i==n){
        printf("%d is not present in the array.\n",key);
        return 0;
    }
}