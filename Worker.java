/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asame
 */
public class Worker {
    
    private int id;
    private String Name;
    private int Age;
    private int Salary;
    private String Departmant;

    
    
    public Worker(int id,String Name,int Age,int Salary,String Departmant){
    
        this.id = id;
        this.Name = Name;
        this.Age = Age;
        this.Salary = Salary;
        this.Departmant = Departmant;
  
    }
    
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Age
     */
    public int getAge() {
        return Age;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    /**
     * @return the Salary
     */
    public int getSalary() {
        return Salary;
    }

    /**
     * @param Salary the Salary to set
     */
    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    /**
     * @return the Departmant
     */
    public String getDepartmant() {
        return Departmant;
    }

    /**
     * @param Departmant the Departmant to set
     */
    public void setDepartmant(String Departmant) {
        this.Departmant = Departmant;
    }
    
    
}
