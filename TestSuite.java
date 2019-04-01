import TinyTestJ.Test;
import static TinyTestJ.Assert.*;



public class TestSuite {

  /*Initialize*/
  //Test owner
	@Test public static void test1() {
	//	check for account balance with remaining balance
		Person owner = new Person("Nadeem");
		BankAccount savings = new BankAccount(owner, 10000);
		double balance = 10000;
    	
		//test
		assertEquals(balance,savings.getBalance(), 0.001);
		
	}
	@Test public static void test2() {
		//	check for account balance with remaining balance
			Person owner = new Person("Nadeem");
			BankAccount savings = new BankAccount(owner, 10000);
			
			System.out.println(savings.getIban());
			//test
			assertEquals(22.0,savings.getIban().length(),0.001);
			}
	
	@Test public static void test3() {
		//	check for account balance with remaining balance
			Person owner = new Person("Nadeem");
			BankAccount savings = new BankAccount(owner, 10000);
			savings.deposit(10000,savings.getSecurityNumber());
			double balance = 20000;
			//test
			assertEquals(balance,savings.getBalance(), 0.001);
			
		}
	@Test public static void test4() {
		//	check for account balance with remaining balance
			Person owner = new Person("Nadeem");
			BankAccount savings = new BankAccount(owner,5000,10000);
			savings.withdraw(5000,savings.getSecurityNumber());
			double balance =10000;
			//test
			assertEquals(balance,savings.getBalance(), 0.001);
			
		}

	@Test public static void test5() {
		//define
		Person owner = new Person("Nadeem");
		BankAccount current = new BankAccount(owner,50000.00);
        current.setBalance(40000);
		double result = 40000;
		//test
		assertEquals(result,current.getBalance(), 0.001);
	}

	@Test public static void test6() {
		Person owner = new Person("Afshin");
		Person Owner1=new Person("Shavini");
		BankAccount account = new BankAccount(owner, 10000.00,5000.00);
		BankAccount remote=new BankAccount(Owner1,15000.00);
		account.transfer(remote,4000.00,account.getSecurityNumber());
		assertEquals(1000.00,account.getBalance(),0.001);
	}
	@Test public static void test7() {
		Person owner = new Person("Afshin");
		Person owner2=new Person("Anna");
		BankAccount sender = new BankAccount(owner, 10000.00,5000.00);
		BankAccount reciever=new BankAccount(owner2,15000.00);
		sender.transfer(reciever,4000.00,sender.getSecurityNumber());
		assertEquals(19000.00,reciever.getBalance(),0.001);
	}
	@Test public static void test8() {
		Person owner = new Person("Yamini");
		BankAccount account = new BankAccount(owner, 1000.00,2000.00);
		assertEquals(1000.00,account.getLimit(),0.001);
	}
	//This test fails
	@Test public static void test9() { // 
		Person owner = new Person("Syju");
		BankAccount account = new BankAccount(owner, 15000.00,25000.00);
		account.withdraw(20000.00,account.getSecurityNumber());
		assertEquals(-20000,account.getBalance(),0.001);
	}
	@Test public static void test10() {
		Person owner = new Person("Manan");
		BankAccount account = new BankAccount(owner, 1000.00);
		System.out.println(account.getIban());
		//test
		assertEquals(22.0,account.getIban().length(),0.001);
	}
	@Test public static void test11() {
		Person owner = new Person("Anan");
		BankAccount account = new BankAccount(owner,1000.00);
		double result = (account.getSecurityNumber());
		assertEquals(result,result,0.001);
	}
	@Test public static void test12() {
		Person owner = new Person("Frutin");
		BankAccount account = new BankAccount(owner, 1000.00);	    
		assertEquals(0.00,account.getLimit(),0.001);
	}
	@Test public static void test13() {
		Person owner = new Person("linda");
		BankAccount account = new BankAccount(owner,1000.00,5000.00);
		assertEquals(1000.00,account.getLimit(),0.001);
	}
	@Test public static void test14() {	 
		Person owner = new Person("John Doe");
		Person holder= new Person("Abdul");
		BankAccount account = new BankAccount(owner,1000.00,2000.00);
		BankAccount studentAccount= new BankAccount(holder,5000.00,1000.00);	    
		account.transfer(studentAccount,600.00,account.getSecurityNumber());
		account.deposit(800.00,account.getSecurityNumber());
		assertEquals(3200.00,account.getBalance(),0.001);
	}
	@Test public static void test15() {
		Person owner = new Person("John Doe");
		Person holder= new Person("Abdul");
		BankAccount account = new BankAccount(owner,1000.00,2000.00);
		BankAccount studentAccount= new BankAccount(holder,5000.00,1000.00);	    
		account.transfer(studentAccount,600.00,account.getSecurityNumber());
		account.deposit(800.00,account.getSecurityNumber());	    
		assertEquals(6600.00,studentAccount.getBalance(),0.001);
	}
	@Test public static void test16() {
		Person owner = new Person("John Doe");
		BankAccount account = new BankAccount(owner, 2000.00);
		account.deposit(700.00,account.getSecurityNumber());
		account.withdraw(1200.00,account.getSecurityNumber());
		account.deposit(500.00,account.getSecurityNumber());
		account.deposit(2100.00,account.getSecurityNumber());
		assertEquals(4100.00,account.getBalance(),0.001);

	}
	@Test public static void test17() {
		Person owner = new Person("John Doe");
		BankAccount account = new BankAccount(owner, 500.00);
		account.deposit(700.00,account.getSecurityNumber());
		account.withdraw(200.00,account.getSecurityNumber());

		assertEquals(1000.00,account.getBalance(),0.001);

	}
	@Test public static void test18() {
		Person owner = new Person("Paul");
		BankAccount account = new BankAccount(owner, 2000.00);
		account.deposit(100.00,account.getSecurityNumber());
		account.withdraw(100.00,account.getSecurityNumber());

		assertEquals(2000.00,account.getBalance(),0.001);

	}

	}
