public class Main {
    public static void main(String[] args) {

        SalariedEmployee annas = new SalariedEmployee("Annas","Khalid","121212",25000);
        HourlyEmployee khalid = new HourlyEmployee("Khalid","Mehmood","121212",10,1500);
        CommissionEmployee muhammad = new CommissionEmployee("Muhammad","Annas","1213123",1000,15);
        BasePlusCommissionEmployee Khalid2  = new BasePlusCommissionEmployee("Khalid2 ","Saab","3223211",500,15,10000);
        Employee [] employee = new Employee[4];
        employee[0] = annas;
        employee[1] = khalid;
        employee[2] = muhammad;
        employee[3] = Khalid2 ;
        for (int i=0;i<employee.length;i++){
            //System.out.println( employee[i].earnings());
            System.out.println(employee[i]);
        }
//        System.out.println(ahmed.earnings());
//        System.out.println(zubair.earnings());
//        System.out.println(ali.earnings());
//        System.out.println(atif.earnings());
}
}