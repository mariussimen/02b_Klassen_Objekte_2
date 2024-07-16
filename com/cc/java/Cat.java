package com.cc.java;

public class Cat 
{
//  Eigenschaften / Properties
//  Felder / fields / attributes

// pass by reference
   private String name ;
   private String furcolor;
   private int age ;


//    Konstruktor (Keinen Rückgabetyp)
    public Cat(String name, String furcolor, int age) {
    this.name = name;
    this.furcolor = furcolor;
    this.age = age;
}


public void setFurcolor(String furcolor) {
    this.furcolor = furcolor;
}



    public String getName() {
       if (getPermission()) {
        return name;
       } else {
        
       }
        return "Sorry, you don't have any permission!";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFurcolor() {
        return furcolor;
    }

  
    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }
public boolean getPermission(){
    return false;
}


}
