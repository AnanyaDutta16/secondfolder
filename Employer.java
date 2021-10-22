package Lab4;
import java.util.*;
public class Employer
{
	String name;//employee properties
	int empid;
	int salary;
	Employer()//default contructor
	{
	}
Employer(String n,int e,int s)//paramtrized constructor
{
	name=n;
	empid=e;
	salary=s;
}

String names()//method return name
{
	return name;
}
int salaries()//method return salary
{
	return salary;
	}
double increaseSalary(double per_rate)//increase salary
{
	double in = (salary*(per_rate/100));
	double s = salary+in;
	return s;
	}
}

class manager extends Employer
{
public String department="d";
 
public static void main(String args[])
{
		Scanner sc= new Scanner(System.in);
		//object and method calling
		System.out.println("Enter the name");
		String n=sc.next();
		System.out.println("Enter the employee Id");
		int e=sc.nextInt();
		System.out.println("Enter the salary");
		int s=sc.nextInt();
		System.out.println("Enter the percentage_rate increaced in salary");
		double p=sc.nextDouble();
		Employer e1 = new Employer(n,e,s);
		System.out.println(e1.names());
		System.out.println(e1.salaries());
		System.out.println(e1.increaseSalary(p));
	}
}
