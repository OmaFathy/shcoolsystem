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
public class Teacher extends Administrators {
   Teacher(){
   }
   Teacher(int i,String n,float s,String f,String na)
    {
        super(i,n,s,f,na);
    }
    public  void print1(int m)
{
    
   System.out.println("The ID Of Teachers"+" "+(m+1)+" "+"is"+" "+": "+getid());
   System.out.println("The Name Of Teachers"+" "+(m+1)+" "+"is"+" "+": "+getname());
   System.out.println("The Name Of Teachers"+" "+(m+1)+" "+"is"+" "+": "+getNationality());
   System.out.println("The Name Of Teachers"+" "+(m+1)+" "+"is"+" "+": "+getField());
    System.out.println("The Salary Of Teachers"+" "+(m+1)+" "+"is"+" "+": "+getsalary());

}
}
