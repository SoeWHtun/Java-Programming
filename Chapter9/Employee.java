public class Employee {
    String name;
    int age;
    double salary;
    Employee(){
        
    }
    
    Employee(String newName,int newAge,double newsalary){
        name=newName;
        age=newAge;
        salary=newsalary;

    }
    String getName(){
         return name;
    }
    double getSalary(){
        return salary;
    }
    double getIncreasement(){
        return (salary*0.5)+salary;
    }
}
