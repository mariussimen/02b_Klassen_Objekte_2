package com.cc.java;

public class Cat 
{
//  Eigenschaften / Properties
//  Felder / fields / attributes

// pass by reference
   String name ;
   String furcolor;
   int age ;//    pass by value


   
    public Cat(String name, String furcolor, int age) {
    this.name = name;
    this.furcolor = furcolor;
    this.age = age;
}



    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }

}
