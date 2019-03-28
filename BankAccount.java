import java.util.Random;


public class BankAccount {
	final String bic ="ABCDDEFFXXX";
	String iban="DE00123456780000000000";
	int securityNumber;
	Person owner;
	double limit;
	double balance;
	
	
	public BankAccount(Person owner,double limit,double balance ){
		  iban=iban.substring(0,12);
			for (int j=0;j<10;j++){
			this.iban += new Random().nextInt(10);
				}
			String temp="";
		for (int j=0;j<6;j++){
			
		temp+=new Random().nextInt(10);
		}
		this.securityNumber=Integer.parseInt(temp);
		this.owner=owner;
		this.limit=limit;
		this.balance=balance;		
	}
	
public BankAccount(Person owner,double balance ){
		this.balance=balance;
		this.owner=owner;
		this.limit=0.0;
	}

public double getBalance(){
	return this.balance ;
    }

	public void setBalance(double balance){
		this.balance = balance;
	}

public String getIban(){
	return this.iban;
	
    }

public Person getOwner(){
	return this.owner;
}
	
public double getLimit(){
	return this.limit;
}
public void deposit(double amount,int securityNumber){
	if (securityNumber==this.securityNumber){
		
		this.balance= balance + amount;
 }
}


public void withdraw(double amount,int securityNumber){
	if(securityNumber==this.securityNumber){
		if(amount <=(balance+limit)){
			
		this.balance=balance - amount ;
	}
  }
}
public void transfer (BankAccount remote,double amount,int securityNumber){
	if(securityNumber==this.securityNumber){
		if(amount <=(balance+limit)){
			this.balance=balance - amount;
			remote.setBalance(amount); 
		}
			
  }
 }
}


