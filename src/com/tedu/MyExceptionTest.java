package com.tedu;

import java.util.Scanner;

public class MyExceptionTest {
    public static void main(String[] args) {
        System.out.println("请输入字符：");
        String s = (new Scanner(System.in)).nextLine();


            try {
                if (s.equals("abc")) {
                    throw new MyException("你输入有误");
                }

            } catch (MyException e) {
                System.out.println(e);



        }




    }
}
class MyException extends Exception{
    private String error;
    public MyException(){

    }


    public MyException(String  error){
       this.error=error;


    }


}