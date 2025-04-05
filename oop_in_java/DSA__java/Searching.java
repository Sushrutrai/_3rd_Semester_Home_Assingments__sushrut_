package oop_in_java.DSA__java;
import java.util.Scanner;

public class Searching {
    void sequential_search(int arr[],int key,int num){
        int i;
        for (i = 0; i < num; i++) {
            if (arr[i]==key) {
                System.out.println(key+" is present at location "+(i+1));
                break;
            }
        }
        if(i==num){
           System.out.println(key+" is not found in the array.ss");
        }
    }
    int binarysearch(int arr[],int left,int right,int key){
        int middle;
        if (left<=right) {
            middle=(left+right)/2;
            if (key==arr[middle]){
                return middle;
            }
            else if (key>arr[middle]){
                return binarysearch(arr, middle+1, right, key);
            }
            else {
                return binarysearch(arr, left, middle-1, key);
            }
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[100]; 
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many elements in array:");
        int num=scanner.nextInt();
        System.out.println("Enter elements into the arary:");
        for(int i=0;i<num;i++){
            arr[i]=scanner.nextInt();
        }
        
        System.out.println("Enter the element you want to search:");
        int key=scanner.nextInt();
        Searching search=new Searching();
        Searching newsearch=new Searching();

            search.sequential_search(arr,key,num);

            for (int i = 0; i < num-1; i++) {
                for (int j = 0; j < num-i-1; j++) {
                    if (arr[j]>arr[j+1]) {
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            int result=newsearch.binarysearch(arr, 0, num-1, key);
            if (result==-1) {
                System.out.println(key+" is not found in the array.bs");
            }
            else{
                System.out.println(key+" is present in "+(result+1)+" location.");
            }
            scanner.close();
    }
}