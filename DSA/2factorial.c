#include<stdio.h>
int fact(int n){
    if(n>=1){
        return fact(n-1)*n;
    }
    return 1;   
}
int main(){
    printf("Factorial is %d ",fact(1));

}