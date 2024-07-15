package com.cc.java;

public class Cat 
{
//  Eigenschaften / Properties
//  Felder / fields / attributes

// pass by reference
   String name = "Grizabella";
   String furcolor = "white";
//    pass by value
   int age = 29;

    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }

}
