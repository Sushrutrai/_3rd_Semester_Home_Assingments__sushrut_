#include<stdio.h>
void towerOfHanoi(int n,char s[],char t[],char a[]){
    if(n==1){
        printf("Move disk %d from %s to %s.\n",n,s,t);
        
    }else{
        towerOfHanoi(n-1,s,a,t);
         printf("Move disk %d from %s to %s.\n",n,s,t);
         towerOfHanoi(n-1,a,t,s);
    }
}
int main(){
    int n;
    printf("How many towers:\n");
    scanf("%d",&n);
    towerOfHanoi(n,"Start","Target","Auxiliary");
    return 0;
}
