public class DevOps extends Employee{
    double bonus;
    public DevOps(String name,String emp_id,long salary,double bonus){
        super(name,emp_id,salary);
        this.bonus=bonus;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("bonus"+bonus);
        System.out.println("total"+salary+bonus);
    }
    public static void main(String[] args) {
       
    //      Employee e=new Employee("Keerthi","977hk",45000);
    //  e.display();
        DevOps d=new DevOps("keerthi","78kk",909999,9009.00);
        d.display();
    }

}
      

