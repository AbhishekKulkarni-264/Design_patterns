package Creational;

class Student{
    String name;
    int age;
    int roll_no;

   static class StudentData{
        String name;
        int age;
        int roll_no;

        public Student build(){
            return  new Student(this);
        }

        public String getName() {
            return name;
        }

        public StudentData setName(String name) {
            this.name = name;
            return  this;
        }

        public int getAge() {
            return age;
        }

        public StudentData setAge(int age) {
            this.age = age;
            return  this;
        }

        public int getRoll_no() {
            return roll_no;
        }

        public StudentData setRoll_no(int roll_no) {
            this.roll_no = roll_no;
            return  this;
        }
    }

    static StudentData builer(){
       return new StudentData();
    }

    private Student(StudentData studentData){
        this.name=studentData.name;
        this.roll_no=studentData.roll_no;
        this.age=studentData.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", roll_no=" + roll_no +
                '}';
    }
}



public class Builder {
    public static void main(String[] args) {

        Student s1=Student.builer().setName("Abhishek").setAge(21).setRoll_no(1).build();
        System.out.println(s1.toString());
    }
}
