package Itfes;

import java.util.Scanner;

/**
 * Created by kaorihirata on 2017-04-19.
 */
public class PostEventPage implements Validate {
    public void vlidate(){};

    public void dispPage(){
        System.out.println("this is PostEventPage");
    }

    public void enterEventInfo(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter EventName");
        int EventName = scan.nextInt();

        System.out.println("Enter Location");
        int Location = scan.nextInt();

        System.out.println("Enter Date");
        int Date = scan.nextInt();

        System.out.println("Enter Time");
        int Time = scan.nextInt();

        System.out.println("Enter Description");
        int Description = scan.nextInt();

        System.out.println("EventName is"+EventName+"/n"+"Location is"+Location+"/n"+"Date is"+Date+"/n"+"Time is"+Time+"/n");


    }

    public void eventSC(){
        System.out.println("choose Save(0),Canel(1)");
        Scanner Scan = new Scanner(System.in);
        int chPage = Scan.nextInt();

        switch (chPage) {
            case 0:
                break; //EventControlClassに情報登録
            case 1:
                break; //My Pageに遷移。
            default:
                System.out.println("error");
        }

    }
}
