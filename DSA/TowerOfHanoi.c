#include<stdio.h>
int tower();
int display();
int main(){
    int n;
    printf("How many towers");
    scanf("%d",&n);






    
}
tower(int n,int start,int end){
    if (n==1)
    {
      display();
    }
    else{
        int other=6-(start+end);
        return tower(n-1,start,other);
        display();
        return tower(n-1,other,end);
    }
}
display( start,end){
    printf("%d-->%d",start,end);
}
    

