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
        switch (chPage) {
            case 0:
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

                // EventControlClassのpostEvent()を使う
                EventControlClass postEvent = new EventControlClass();
                boolean posEveResult = postEvent.postEvent(EventName,Location,Date,Time,Description);
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
