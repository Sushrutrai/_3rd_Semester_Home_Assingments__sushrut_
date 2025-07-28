#include<stdio.h>
int hcf();
int main(){
    int x,y;
    printf("Enter x and y:\n");
    scanf("%d%d",&x,&y);
    printf("The hcf is %d",hcf(x,y));
}
int hcf(int x,int y){
    if(y==0){
        return x;
    }else{
        return hcf(y,x%y);
    }
}