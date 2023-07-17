public class Person {
   public String name;
  public String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }public Person(){

    }
    public void learn(){
      System.out.println(" учиться на психолога");
  }public void walk(){
        System.out.println("ходил в университет");
    }public void eat(){
        System.out.println("любить вкусно поесть");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}



