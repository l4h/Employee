public class Employee {
    private String fullName;
    private int age;
    private String function;
    private String phoneNumber;
    Long salary;

    public Employee(String fullName,int age, String function,String phoneNumber,long salary){
        this.fullName = fullName;
        this.age = age;
        this.function = function;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void printInfo(){
        System.out.println("Full name: "+fullName+"\nAge:"+age+"\nFunction:"+function+"\nPhone:"+phoneNumber+"\nSalary:"+salary +"\n\n");
    }

}
