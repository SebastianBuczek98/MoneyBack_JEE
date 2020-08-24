package pck1;

public class Person {
    public String name;
    public float moneySpent;
    public float diff;

    public Person(String name, float moneySpent){
        this.name=name;
        this.moneySpent=moneySpent;
        System.out.println("Utworzono obiekt Person");
        test();
    }

    public void test(){
        System.out.println(this.name);
        System.out.println(this.moneySpent);
    }
}
