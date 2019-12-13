public class Manager {
    String firstName;
    String LastName;
    int age;

    public void t1(){
        System.out.print("The main responsibility of a manager includes recruiting, training and supervising staff ");
    }

    public void t2(int income){
        int salary=150000;
        int billPayments=300000;
        int taTaxes=(income*15)/100;
        int netProfit=income-salary-billPayments-taTaxes;
        System.out.println("He can always tell you The profit of the mount : "+netProfit)  ;
    }

    public void t3(){
        System.out.println("Handling customer complaints and queries");
    }



}
