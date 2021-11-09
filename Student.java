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
public class Student extends Administrators {
    int study_level;
    float GPA;
    Student(){}
    Student(int i,String n,float s,String f,String na,int l,float gp )
    {
        super(i,n,s,f,na);
        study_level=l;
        GPA=gp;
    }
    
 public void setStudy_level(int study_level) {
        this.study_level = study_level;
    }
    public int getStudy_level() {
        return study_level;
    }

     public void setGPA(float GPA) {
        this.GPA = GPA;
    }
    

    public float getGPA() {
        return GPA;
    }
public  void print2(int k)
{
    
   System.out.println("The ID Of Students"+" "+(k+1)+" "+"is"+" "+": "+getid());
   System.out.println("The Name Of Students"+" "+(k+1)+" "+"is"+" "+": "+getname());
   System.out.println("The Name Of Students"+" "+(k+1)+" "+"is"+" "+": "+getNationality());
   System.out.println("The Name Of Students"+" "+(k+1)+" "+"is"+" "+": "+getStudy_level());
   if(study_level>1)
       System.out.println("The Name Of Students"+" "+(k+1)+" "+"is"+" "+": "+getField());
    System.out.println("The Salary Of Students"+" "+(k+1)+" "+"is"+" "+": "+getGPA());

}
    
    
}
