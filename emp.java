package methods;

public class emp {

   void detail(int id,String name)
   {
	   System.out.println("Employeeid=:"+id);
	   System.out.println("Employee Name=:"+name);
   }
   void detail(float empsalary,float pf)
   {
	   System.out.println("Salary=:"+empsalary);
	   System.out.println("PF=:"+pf);
   }
  void detail(double empsalary)
  {
	double empannualsalary=empsalary*12;
	System.out.println("The Annualsalary=+"+empannualsalary);
  }
}
