class Employee{
    String name;
    String emp_id;
    long salary;
    public Employee(String name,String emp_id,long salary){
        this.name=name;
        this.emp_id=emp_id;
        this.salary=salary;
    }
    public void display(){
        System.out.println(name+"\n"+emp_id+"\n"+salary);
    }
    public static void main(String[] args) {
        Employee e=new Employee("Keerthi","977hk",45000);
        e.display();
    }

}