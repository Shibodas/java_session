package assignment;

public class BankAccount {
	int accountNumber;
	String customerName;
	private double balance;
	String rateOfInterest;
	
	public  BankAccount(String name) {
		balance = 0;
        customerName = name;
        rateOfInterest = "8.5%";
        }
    public void depositAmount(double amount){
        balance = balance + amount;
        System.out.println(customerName + " You deposited = " + amount);
        System.out.println("Your balance = " + balance);
    }
    public void withdrawAmount(double amount){
        if(balance>5000){
            balance = balance - amount;
            System.out.println(customerName + " You are withdrawing = " + amount);
            System.out.println("Your balance = " + balance);
        }
        else{
            System.out.println("Unsufficient Balance");
        }
    }

    void showAccountDetails(){
        System.out.println("Customer Name = " + customerName);
        System.out.println("Account Balance = " + balance);
    }

    public String getRateOfInterest(){
        return rateOfInterest;
        
    }
    
 public static void main(String[] args) {
     BankAccount customer1 = new BankAccount("Shibodas");
     customer1.depositAmount(10000);
     BankAccount customer2 = new BankAccount("tubu");
     customer2.depositAmount(30000);

     
     customer1.showAccountDetails();
     customer1.withdrawAmount(3000);
     customer1.depositAmount(20000);
     customer1.getRateOfInterest();

     customer2.showAccountDetails();
     customer2.withdrawAmount(5100);
     customer2.depositAmount(2300);
 }




	}



