package com.as.sampleapp;

public class SampleApplication {
	public static void main(String[] args) {
                System.out.println("It is sample application");
                addExtraMethod(32,43);
        }
        public static void addExtraMethod (int a, int b){
               System.out.println("Total : " + (a+b));
        }

}
