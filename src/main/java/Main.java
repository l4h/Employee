public class Main {
    static Employee[] employees= {  new Employee("Хоттабыч Digital Edition",20,"Mag", "01",9923942492424239L),
                                    new Employee("Кощей бессметрный", 5000,"terrorist","callMeLater",9999L),
                                    new Employee("Antoshka",12,"pupil","notEarnedYet", -100500L),
                                    new Employee("Татьяна Васильевна Абдыщева",45,"Президент несозданной страны", "Такой же как в Кащенко", -100L)
    };

    public static void main(String[] args) {
        for (Employee emp : employees){
            if(emp.getAge()>40){
                emp.printInfo();
            }
        }
    }
}

