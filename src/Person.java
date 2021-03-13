public class Person {

    private String name;

    public Person(String jamo) {
    }

    public Person() {

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String sayHello(){
        return String.format("Hey there, " + getName() + "!");
    }


    public static void main(String[] args) {

        Person one = new Person();
        one.name = "Bob";

        System.out.println(one.sayHello());
        one.setName("John");

        one.getName();
        System.out.println(one.name);

    }

}
