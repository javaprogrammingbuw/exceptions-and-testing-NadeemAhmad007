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
	if(limit==0) {
		this.balance = balance;
}else {
	this.balance=balance+limit;
}
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
public int getSecurityNumber() {
	return this.securityNumber;
}
public void deposit(double amount,int securityNumber){
	
	if (this.securityNumber==securityNumber){
		
	this.balance = getBalance()+getLimit() + amount;
		
	}
	
}

public void withdraw(double amount,int securityNumber){


	if(securityNumber==this.securityNumber) {
		if(amount>(getBalance())){
			double c= getBalance()-getLimit();
			this.balance=amount-getLimit()-c;
			
			
			
		}else {
			this.balance=getBalance()+getLimit();
			this.balance=getBalance()-amount ;
		}
	}
}
   public void transfer (BankAccount remote,double amount,int securityNumber){
//	   
	if(securityNumber==this.securityNumber){
		if(amount <=(getBalance()+limit)){
			remote.setBalance(remote.getBalance()+amount);
			this.balance=getBalance() - amount;
			 
		}
			
         }
    }
}


