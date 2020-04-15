package com.company;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList List = new ArrayList();
        List.add("2");
        List.add("3");
        List.add("4");

        for (Object o : List) {
            System.out.println(o);
        }

        for (int i = 0; i < List.size(); i++) {
            
        }

        for (int i = List.size() - 1; i >= 0; i--) {
            
        }
    }

    public void Method(){


    }

    
}
