package Generic;

public class Demo {
    public static void main(String[] args){
        String[] hobbies = {"game","read"};
        Sale saleInfo = new Sale(hobbies,1000.0);
        Employee<Sale> saleEmployee = new Employee<Sale>(
                "sale name",
                "sale last name",
                saleInfo);

        Account accountInfo = new Account(8,"account manager");
        Employee<Account> accountEmployee = new Employee<Account>(
                "account name",
                "account last name",
                accountInfo
        );

        System.out.println("Sale Name: " + saleEmployee.getName());
        System.out.println("first Sale hobbies: " + saleEmployee.getInfo().getHobbies()[0]);
        System.out.println("\n\n");
        System.out.println("Account name: " + accountEmployee.getName());
        System.out.println("work: " + accountEmployee.getInfo().getWork());

    }
}
