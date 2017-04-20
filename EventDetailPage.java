package Itfes;

import java.util.Scanner;

public class EventDetailPage extends EventControlClass{

    public void dispPage(){
        System.out.println("this is EventDetailPage");
    }
    // EventControlerClassからデータ取得
    public void getEventControler(){
        System.out.println(EventControlerClass.EventName);
        System.out.println(EventControlerClass.EventDateStart);
        System.out.println(EventControlerClass.EventDateEnd);
        System.out.println(EventControlerClass.Picture);
        System.out.println(EventControlerClass.Location);
        System.out.println(EventControlerClass.Organizer);
        System.out.println(EventControlerClass.Description);
        System.out.println(EventControlerClass.review);

    }
    public static chJoin(){
        System.out.println("Enter if you want to join(0) not (1)");
        Scanner Scan = new Scanner(System.in);
        int chJoin = Scan.nextInt();
        if (chJoin ==0){
            return setUserControlr();//UserControlClass　に登録
        }
        else{break}

    }
    // UserControlClassにデータ登録
    public void setUserControlr(){
        UserControlClass.presentEvent = EventDetailPage.何か値；

    }



}
