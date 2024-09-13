package TinhDongGoi;
// Encapsulation
public class Main {
    public static void main(String[] args) {
        human h = new human();
        h.setName("Tu");
        h.setAge(22);
        h.setCity("Ha Noi");
        System.out.println("Name:" + h.getName() + " Age: " + h.getAge() + " From: " + h.getCity());
    }
}