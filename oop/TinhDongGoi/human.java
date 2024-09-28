package TinhDongGoi;

public class human {
    //Public
    public String city;
    //Protected
    protected String name;
    // Default
    String address;
    //Private
    private int age;
    
    public String getCity() {
        return city;
    }
    public void setCity(final String city) {
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(final String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(final int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "human [city=" + city + ", name=" + name + ", address=" + address + ", age=" + age + "]";
    }

    
    

    
    
}
