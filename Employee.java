class Employee
{
        String name;
        int id;
	double salary;
        Employee(String n, int i,double s)
        {
        	name=n;
        	id=i;
		salary=s;
        }
	void display()
	{
        	System.out.println("\n Employee ID:" +id);
		System.out.println("\n Employee Name:" +name);
		System.out.println("\n Employee Salary:" +salary);

	}
        public static void main(String args[])
	{
		Employee s1=new Employee("Shubham", 101 ,55000);
		Employee s2=new Employee("Pravin", 102 ,45000);
		Employee s3=new Employee("Abhishek", 103 ,35000);
		s1.display();
		s2.display();
		s3.display();
	}
}
