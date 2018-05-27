
package javaapplication24;

class Parent{
    
    int a,b,c;
    
    Parent(){
        a=10;
        b=20;
    }
    
    void add(){
       c=a+b;
    }
    
    void display(){
        System.out.println(+c);
    }
}

class Base extends Parent{
    
    Base(){
        super();
        
    }

    @Override
    void add() {
        super.add(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    }


public class JavaApplication24 {

    
    public static void main(String[] args) {
        
        
        Base base=new Base();
        base.add();
        base.display();
        
    }
    
}
