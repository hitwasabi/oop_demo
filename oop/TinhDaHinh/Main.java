package TinhDaHinh;
//Polymorphism 
// Overriding
class Animal {
    int protein = 40;
    void eat() {
        System.out.println("Eating");
    }
}
class Dog extends Animal {
    int protein = 26;

    @Override
    void eat() {
        System.out.println("Dog is eating");
        // super.eat();
    }
    
}
class Puppy extends Dog {
    int protein = 12;

    @Override
    void eat() {
        System.out.println("Puppy is eating");
        // super.eat();
    }
   
}


//Overloading

class Calculator {
    int add(int a, int b) {
      return a + b;
    }
    
    double add(double a, double b) {
      return a + b; 
    }
  }


public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(); 
        System.out.println(c1.add(3 , 3)); //Compile
        // Calculator c2 = new Calculator();
        // System.out.println(c2.add(3.5 , 3.5));
        Animal d = new Dog(); //Runtime
        Animal p = new Puppy();
        d.eat();
        System.out.println(d.protein);//40
        p.eat();
        System.out.println(p.protein);//40
    }
}

// Phuong thuc duoc ghi de, nhung du lieu thi khong