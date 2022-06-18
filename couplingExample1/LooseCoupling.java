package couplingExample1;

import java.io.IOException;


public class LooseCoupling {

   public static void main(String args[]) throws IOException {
      Show y = new Y();
      Show z = new Z();
      
      X x = new X(y);          
      //a.display() will print X and Y
      x.display();

      X x1 = new X(z);
      //a.display() will print X and Z    
      x1.display();
   }
}

interface Show {
   public void display();
}

class X {
   Show s;
   public X(Show s) {
      //s is loosely coupled to A
      this.s = s;
   }

   public void display() {
      System.out.println("X");
      s.display();
   }
}

class Y implements Show {    
   public Y(){}
   public void display() {
      System.out.println("Y");
   }
}

class Z implements Show {    
   public Z(){}
   public void display() {
      System.out.println("Z");
   }
}