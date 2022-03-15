import java.util.*;
public class AccountTest {

    public static void main(String[] args) {

        Account account1 = new Account(50.00);
        Account account2 = new Account(-7.53);

        System.out.printf("account1 balance: $%.4f \n",account1.getBalance());
        System.out.printf("account2 balance: $%.4f \n\n", account2.getBalance());

       Scanner input= new Scanner(System.in);

        double depositAmount;
        double debitamount;
        
        
        System.out.print("Enter deposit amount for account1: ");
        depositAmount = input.nextDouble();

        System.out.printf("\nadding %.2f to account1 balance\n\n", depositAmount);
        account1.credit(depositAmount);

        System.out.printf("account1 balance: $%.2f \n", account1.getBalance());
        System.out.printf("account2 balance: $%.2f  \n\n",account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to account2 balance\n\n",depositAmount);
        account2.credit(depositAmount);

        System.out.printf("account1 balance: $%.2f \n",account1.getBalance());
        System.out.printf("account2 balance: $%.2f \n",account2.getBalance());
        
        System.out.println("enter debit amount from account1");
        debitamount = input.nextDouble();
        System.out.printf("subtructing %.2f from acount1\n",debitamount);
        account1.debit(debitamount);
        
        System.out.printf("account1 balance: $%.2f \n",account1.getBalance());
        System.out.printf("account2 balance: $%.2f \n",account2.getBalance());
        
        System.out.println("enter debit amount from account2");
        debitamount=input.nextDouble();
        System.out.printf("subtructing %.2f from account2 \n",debitamount);
        account2.debit(debitamount);
        
        System.out.printf("account1 balance: $%.2f \n",account1.getBalance());
        System.out.printf("account2 balance: $%.2f \n",account2.getBalance());

    }

}//end class 
