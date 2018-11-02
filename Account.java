import java.util.Date;

public class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account()
	{
		id=0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();

	}
	public Account(int id,double balance)
	{
		this.id = id;
		this.balance = balance;

	}
	public int getId()
	{
		return id;
	}
	public double getBalance()
	{
		return balance;
	}
	public double getRate()
	{
		return annualInterestRate;		
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public void setRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDate()
	{

		return dateCreated;
	}
	public double getMonthlyInterestRate()
	{
		return annualInterestRate/12;
	}
	public double withDraw(double money)
	{
		this.balance -=money;
		return balance;
	}
	public double deposit(double money)
	{
		balance +=money;
		return balance;		
	}
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setId(1122);
		acc.setBalance(20000);
		acc.setRate(0.045);
		acc.withDraw(2500);
		acc.deposit(3000);
		System.out.println("余额为："+acc.getBalance());
		System.out.println("月利息为："+acc.getMonthlyInterestRate()*acc.getBalance());
		System.out.println("开户日期为："+acc.getDate().toString());


	}


}