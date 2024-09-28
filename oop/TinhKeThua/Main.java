package TinhKeThua;
//Inheritance
class symbiote {
    public void level(){
        System.out.println("Danger");
    }

}

class Venom extends symbiote{

    @Override
    public void level() {
        System.out.println("Very Danger");
    }

    public void weapon(){
        System.out.println("Bare hands");
    }



}

class Riot extends symbiote{

    @Override
    public void level() {
        System.out.println("Very Danger");
    }

}

class Carnage extends Venom{

    @Override
    public void level() {
        System.out.println("Extremely Danger");
    }

    @Override
    public void weapon() {
        // TODO Auto-generated method stub
        super.weapon();
    }
    
    public void host(){
        System.out.println("Cletus Kasady");
    }
    
}

public class Main {
    public static void main(String[] args) {
        AppleTree a = new AppleTree();
        a.grow();
        a.make();
        Carnage c = new Carnage();
        c.level();
        c.host();
        c.weapon();
    }
}
