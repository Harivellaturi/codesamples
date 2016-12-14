package com.github.harivellaturi;

public class HelloWorld{
   public static void main(String args[]){
	  HelloWorldservice helloWorldservice = message -> System.out.println("Hello " + message);
      helloWorldservice.sayHi("World!");
   }
	
   interface HelloWorldservice{
      void sayHi(String message);
   }
}
