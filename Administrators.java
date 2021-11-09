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
public class Administrators {
   private int id;
   private String name;
   private float salary;
    private String field;
   private String nationality;
     public Administrators()
    {
    id=0;
    name="omar";
    salary=0;
    field="head";
     nationality="egypt";
    }
   public Administrators(int i,String n,float s,String f,String na)
    {
    id=i;
    name=n;
    salary=s;
    field=f;
    nationality=na;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getField() {
        return field;
    }

    public String getNationality() {
        return nationality;
    }

   public void setid(int i)
   {
      this.id=i;
   }
   
   public void setname(String n)
   {
       name=n;
   }
   
   public void setsalary(float s)
   {
       
       this.salary=s;
   }
   
   public int getid()
   {
       return id;
   }
   
   public  String getname()
   {
       return name;
   }
   
   public float getsalary()
   {
       return salary;
   }
   
public  void print(int n)
{
    
   System.out.println("The ID Of Administrators"+" "+(n+1)+" "+"is"+" "+": "+getid());
   System.out.println("The Name Of Administrators"+" "+(n+1)+" "+"is"+" "+": "+name);
   System.out.println("The Name Of Administrators"+" "+(n+1)+" "+"is"+" "+": "+nationality);
   System.out.println("The Name Of Administrators"+" "+(n+1)+" "+"is"+" "+": "+field);
    System.out.println("The Salary Of Administrators"+" "+(n+1)+" "+"is"+" "+": "+getsalary());

}
}


