/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolsystem1;

/**
 *
 * @author mohab
 */
public class Employee extends Administrators{
    Employee(){}
    Employee(int i,String n,float s,String f,String na)
    {
        super(i,n,s,f,na);
    }
     public  void print3(int l)
{
    
   System.out.println("The ID Of Employees"+" "+(l+1)+" "+"is"+" "+": "+getid());
   System.out.println("The Name Of Employees"+" "+(l+1)+" "+"is"+" "+": "+getname());
   System.out.println("The Name Of Employees"+" "+(l+1)+" "+"is"+" "+": "+getNationality());
   System.out.println("The Name Of Employees"+" "+(l+1)+" "+"is"+" "+": "+getField());
    System.out.println("The Salary Of Employees"+" "+(l+1)+" "+"is"+" "+": "+getsalary());

}
}
