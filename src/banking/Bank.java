package banking;

public class Bank {
    String name = "Arun";
    long accountNumber = 9876543210L;
    float availableBalance =500049.49f;
//


    public void transferAmount(float amount){
    availableBalance =  availableBalance - amount;
    System.out.println(availableBalance);
    }


public static void main(String[] args){

    Bank bank = new Bank();

    bank.transferAmount(250);
   System.out.println(bank.name);
    System.out.println(bank.accountNumber);
    System.out.println(bank.availableBalance);




}



}



