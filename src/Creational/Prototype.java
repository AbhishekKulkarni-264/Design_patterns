package Creational;

import java.util.HashMap;

class User{
    String name;
    String password;
    User(String name,String password){
        this.name=name;
        this.password=password;
    }

    User(User u){
        this.name=name;
        this.password= u.password;
    }
    public User clone(){
        return new User(this);
    }
}

class Employee extends User{
    int Id;
    Employee(String name,String password,int Id){
        super(name,password);
        this.Id=Id;
    }
    Employee(Employee e){
        super(e);
        this.Id=e.Id;

    }

    public Employee clone(){
        return new Employee(this);
     }

}



class Registry{
private HashMap<String,User>mp;
public Registry(){
    this.mp=new HashMap<>();
    User user=new User("Abhishek","1234");
    User emp=new Employee("abc","2345",1);

    this.mp.put("User",user);
    this.mp.put("Employee",emp);
}

public  void register(String key,User user){
    mp.put(key,user);
}

public  User get(String key){
    return mp.get(key);
}

}
public class Prototype {

    public static void main(String[] args) {
        Registry reg=new Registry();
        User user=reg.get("User");
        User emp=reg.get("Employee");

        User cp1=user.clone();
        User cp2=emp.clone();
    }
}
