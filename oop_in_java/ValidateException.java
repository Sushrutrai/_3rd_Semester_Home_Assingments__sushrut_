package oop_in_java;
//WAP that throw a custom exception if the user provides an age less than 18
public class ValidateException extends Exception{
    public ValidateException(String str){
        super(str);
    }
}