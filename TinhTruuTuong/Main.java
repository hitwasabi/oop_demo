package TinhTruuTuong;
// Abstraction


interface Bank {
    float rateOfInterest();
}

class MBBank implements Bank{
    public float rateOfInterest(){
        return 8.5f;
    };
}

class VIB implements Bank{
    public float rateOfInterest(){
        return 7.2f;
    };
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Cow();
        a.eat();
        Bank b = new MBBank();
        System.out.println("Rate of Interest of MBBANK is:"+ b.rateOfInterest());
    }
}



