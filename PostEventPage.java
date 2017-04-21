package Itfes;

import java.util.Scanner;

/**
 * Created by kaorihirata on 2017-04-19.
 */
public class PostEventPage implements Validate {
    @Override
    public void validate() {

    }

    public void dispPage(){
        System.out.println("this is PostEventPage");
        System.out.println("choose Save(0),Cancel(1)");

        Scanner scan = new Scanner(System.in);
        int chPage = scan.nextInt();
        scan.nextLine();
        switch (chPage) {
            case 0:
                System.out.println("Enter EventName");
                String EventName = scan.nextLine();
                System.out.println("Enter Location");
                String Location = scan.nextLine();
                System.out.println("Enter Date EX)May 5 Mon");
                String Date = scan.nextLine();
                System.out.println("Enter Time");
                String Time = scan.nextLine();
                System.out.println("Enter Description");
                String Description = scan.nextLine();

                EventControlClass ecc = new EventControlClass();
                boolean posEveResult = ecc.postEvent(EventName,Location,Date,Time,Description);
                if (posEveResult) {
                    System.out.println("Event saved");
                } else {
                    break;
                }
                break;
            case 1:
                break; //My Pageに遷移。
            default:
                System.out.println("error");
        }
    }
}
