package Itfes;

import java.util.Scanner;

/**
 * Created by kaorihirata on 2017-04-19.
 */
public class PostEventPage implements Validate {

    public void dispPage(){
        System.out.println("this is PostEventPage");
        System.out.println("choose Save(0),Cancel(1)");

        Scanner scan = new Scanner(System.in);
        int chPage = scan.nextInt();
        scan.nextLine();
        switch (chPage) {
            case 0:
                System.out.println("Enter EventName");
                String eventName = scan.nextLine();
                System.out.println("Enter Location");
                String location = scan.nextLine();
                System.out.println("Enter Date EX)May 5 Mon");
                String date = scan.nextLine();
                System.out.println("Enter Time");
                String time = scan.nextLine();
                System.out.println("Enter Description");
                String description = scan.nextLine();

                if(!this.validate(eventName, location, date, time, description)) break;

                EventControlClass ecc = new EventControlClass();
                boolean posEveResult = ecc.postEvent(eventName,location,date,time,description);
                if (posEveResult) {
                    System.out.println("Event saved");
                } else {
                    System.out.println("Event couldn't save");
                }
                this.dispPage();
                break;
            case 1:
                MyPage mp = new MyPage();
                mp.dispPage();
                break; //My Pageに遷移。
            default:
                System.out.println("error");
        }

    }

    @Override
    public boolean validate(String email, String password) {
        return false;
    }

    @Override
    public boolean validate(String eventName, String location, String date, String time, String description) {

        // check value is not ""
        if(eventName.equals("")){
            System.out.println("Event name is empty");
            return false;
        }

        if(location.equals("")){
            System.out.println("location is empty");
            return false;
        }

        if(date.equals("")){
            System.out.println("date is empty");
            return false;
        }

        if(time.equals("")){
            System.out.println("time is empty");
            return false;
        }

        if(time.equals("")){
            System.out.println("description is empty");
            return false;
        }

        return true;
    }
}
