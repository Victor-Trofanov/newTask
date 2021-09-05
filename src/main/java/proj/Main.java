package proj;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main{
    public static void main(String[] args) {
        BMW bmw = new BMW();
        Tesla tesla = new Tesla();
        LocalDate date = LocalDate.of(1995,9,5);
        bmw.setAge(date);
        bmw.setColor("black");
        bmw.setModel("M3");
        System.out.println(bmw.fillTank());


        date = LocalDate.of(2018,12,5);
        tesla.setAge(date);
        tesla.setColor("red");
        tesla.setModel("model S");
        System.out.println(tesla.chargeBattery());

        System.out.println("BMW Properties: "+bmw.getAge()+" "+bmw.getColor()+" "+bmw.getModel());
        System.out.println("Tesla Properties: "+tesla.getAge()+" "+tesla.getColor()+" "+tesla.getModel());

    }
}
