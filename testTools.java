package Itfes;

/**
 * Created by Nobuaki on 2017-04-20.
 */
public class testTools {

    /**
     * We don't have database so we can't save userData, eventData.
     * This class can save above data tentatively.
     *
     * We'll replace these method with Database.
     *
     */

    public static String userName, userEmail, userPassword, userCategory;
    public static int[] userEventlist = new int[5];
    public static int count=0, postCount=0;
    public static String[][] postedUserEvent = new String[5][5];

    public boolean setPostedUserEvent(String eventName, String location,String date, String time, String description){
        if(postCount == 5){
            System.out.println("Overflow !");
            return false;
        }else{
            postedUserEvent[postCount][0] = eventName;
            postedUserEvent[postCount][1] = location;
            postedUserEvent[postCount][2] = date;
            postedUserEvent[postCount][3] = time;
            postedUserEvent[postCount][4] = description;
            postCount++;
            return true;
        }
    }

    public void saveUserAccount(String name, String eMail, String password, String category){
        userName = name;
        userEmail = eMail;
        userPassword = password;
        userCategory = category;
    }

    public String[] getUserAccount(){
        String[] userInformation = new String[4];
        userInformation[0] = userName;
        userInformation[1] = userEmail;
        userInformation[2] = userPassword;
        userInformation[3] = userCategory;

        return userInformation;
    }

    public boolean setUserEvent(int EventID){
        if(count == 5){
            System.out.println("Error setEvent overflow !");
            return false;
        }else{
            userEventlist[count] = EventID;
            count++;
            return true;
        }
    }

    public String[][] makeTestData(int testDataType){
        String[][] testDataArray = new String[5][6];
        /**
         * 曜日、日付、時間、場所、イベント名、詳細
         */
        switch (testDataType) {
            case 0: // upcoming events
                testDataArray[0][0] = "1";
                testDataArray[0][1] = "May";
                testDataArray[0][2] = "5";
                testDataArray[0][3] = "9:00 - 10:00";
                testDataArray[0][4] = "Vancouver BC";
                testDataArray[0][5] = "Women Code";
                testDataArray[0][6] = "Welcome Coders for Free technical study !!";

                testDataArray[1][0] = "2";
                testDataArray[1][1] = "Jun";
                testDataArray[1][2] = "2";
                testDataArray[1][3] = "12:00 - 13:00";
                testDataArray[1][4] = "Montreal QC";
                testDataArray[1][5] = "Men Code";
                testDataArray[1][6] = "Welcome Coders for Hack events !!";

                testDataArray[2][0] = "3";
                testDataArray[2][1] = "Sep";
                testDataArray[2][2] = "10";
                testDataArray[2][3] = "18:00 - 19:00";
                testDataArray[2][4] = "Nelson BC";
                testDataArray[2][5] = "pika-chu Code";
                testDataArray[2][6] = "Let's gotcha a Pika-chu";

                testDataArray[3][0] = "4";
                testDataArray[3][1] = "Mar";
                testDataArray[3][2] = "31";
                testDataArray[3][3] = "19:00 - 20:00";
                testDataArray[3][4] = "Kelowna BC";
                testDataArray[3][5] = "ciccc Code";
                testDataArray[3][6] = "Studying with International Students";

                testDataArray[4][0] = "5";
                testDataArray[4][1] = "Apr";
                testDataArray[4][2] = "25";
                testDataArray[4][3] = "19:30 - 20:30";
                testDataArray[4][4] = "Vancouver BC";
                testDataArray[4][5] = "Awesome Code";
                testDataArray[4][6] = "Every Code Awesome";

                break;
            case 1: // RecommendEventsData
                testDataArray[0][0] = "99";
                testDataArray[0][1] = "Fev";
                testDataArray[0][2] = "24";
                testDataArray[0][3] = "10:00 - 12:00";
                testDataArray[0][4] = "Vancouver BC";
                testDataArray[0][5] = "java Code";

                testDataArray[0][0] = "100";
                testDataArray[1][1] = "Jan";
                testDataArray[1][2] = "15";
                testDataArray[1][3] = "15:00 - 16:00";
                testDataArray[1][4] = "Prince Rupert BC";
                testDataArray[1][5] = "web Code";

                testDataArray[0][0] = "200";
                testDataArray[2][1] = "Sep";
                testDataArray[2][2] = "10";
                testDataArray[2][3] = "21:00 - 22:00";
                testDataArray[2][4] = "Nelson BC";
                testDataArray[2][5] = "Coffee Code";
                break;
            case 2: // userEvents
                testDataArray[0][0] = "1000";
                testDataArray[0][1] = "Fev";
                testDataArray[0][2] = "24";
                testDataArray[0][3] = "10:00 - 12:00";
                testDataArray[0][4] = "Vancouver BC";
                testDataArray[0][5] = "java Code";

                testDataArray[1][0] = "2000";
                testDataArray[1][1] = "Jan";
                testDataArray[1][2] = "15";
                testDataArray[1][3] = "15:00 - 16:00";
                testDataArray[1][4] = "Prince Rupert BC";
                testDataArray[1][5] = "web Code";

                testDataArray[2][0] = "3000";
                testDataArray[2][1] = "Sep";
                testDataArray[2][2] = "10";
                testDataArray[2][3] = "21:00 - 22:00";
                testDataArray[2][4] = "Nelson BC";
                testDataArray[2][5] = "Coffee Code";
                break;
            case 3:// eventDetail
                testDataArray[0][0] = "9999";
                testDataArray[0][1] = "May";
                testDataArray[0][2] = "5";
                testDataArray[0][3] = "9:00 - 10:00";
                testDataArray[0][4] = "Vancouver BC";
                testDataArray[0][5] = "Women Code";
                testDataArray[0][6] = "Welcome Coders for Free technical study !!";

                testDataArray[1][0] = "10000";
                testDataArray[1][1] = "Jun";
                testDataArray[1][2] = "2";
                testDataArray[1][3] = "12:00 - 13:00";
                testDataArray[1][4] = "Montreal QC";
                testDataArray[1][5] = "Men Code";
                testDataArray[1][6] = "Welcome Coders for Hack events !!";

                testDataArray[2][0] = "20000";
                testDataArray[2][1] = "Sep";
                testDataArray[2][2] = "10";
                testDataArray[2][3] = "18:00 - 19:00";
                testDataArray[2][4] = "Nelson BC";
                testDataArray[2][5] = "pika-chu Code";
                testDataArray[2][6] = "Let's gotcha a Pika-chu";

                testDataArray[3][0] = "30000";
                testDataArray[3][1] = "Mar";
                testDataArray[3][2] = "31";
                testDataArray[3][3] = "19:00 - 20:00";
                testDataArray[3][4] = "Kelowna BC";
                testDataArray[3][5] = "ciccc Code";
                testDataArray[3][6] = "Studying with International Students";

                testDataArray[4][0] = "40000";
                testDataArray[4][1] = "Apr";
                testDataArray[4][2] = "25";
                testDataArray[4][3] = "19:30 - 20:30";
                testDataArray[4][4] = "Vancouver BC";
                testDataArray[4][5] = "Awesome Code";
                testDataArray[4][6] = "Every Code Awesome";
                break;
            default:
        }

        return testDataArray;
    }

    public String[][] getUserSampleData(){
        String [][] testUserData = new String[3][4];
        /**
         * name, eMail, password, category
         */
        testUserData[0][0] = "Maddy";
        testUserData[0][1] = "abc@gmail.com";
        testUserData[0][2] = "test";
        testUserData[0][3] = "Web developer";

        testUserData[1][0] = "Kaori";
        testUserData[1][1] = "efg@nifty.com";
        testUserData[1][2] = "hogehoge";
        testUserData[1][3] = "Front End Engineer";

        testUserData[2][0] = "Nobubu";
        testUserData[2][1] = "hijk@mac.com";
        testUserData[2][2] = "brabrara";
        testUserData[2][3] = "Server Side Engineer";

        return testUserData;

    }
}
