public class Main {

    public static void main(String[] args) {

        Employee tim  = new Employee("Tim","11/11/1985","01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        Employee joe = new Employee("Joe","11/11/1990","03/03/2020");
        System.out.println(joe);

        SalariedEmployee mike = new SalariedEmployee("Mike", "05/12/1992", "01/06/2016", 120000);
        System.out.println(mike);
        System.out.println("Joe's Paycheck = $" + mike.collectPay());
        mike.retire();
        System.out.println("Joe's Pension = $" + mike.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "12/07/1988", "16/09/2019", 250);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}
