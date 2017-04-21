package Itfes;

/**
 * Created by Nobuaki on 2017-04-20.
 */
public class testTools {
    public String[][] makeTestData(int testDataType){
        String[][] testDataArray = new String[5][6];
        /**
         * 曜日、日付、時間、場所、イベント名、詳細
         */
        switch (testDataType) {
            case 0: // upcomming events
                testDataArray[0][0] = "May";
                testDataArray[0][1] = "5";
                testDataArray[0][2] = "9:00 - 10:00";
                testDataArray[0][3] = "Vancouver BC";
                testDataArray[0][4] = "Women Code";

                testDataArray[1][0] = "Jun";
                testDataArray[1][1] = "2";
                testDataArray[1][2] = "12:00 - 13:00";
                testDataArray[1][3] = "Montreal QC";
                testDataArray[1][4] = "Men Code";

                testDataArray[2][0] = "Sep";
                testDataArray[2][1] = "10";
                testDataArray[2][2] = "18:00 - 19:00";
                testDataArray[2][3] = "Nelson BC";
                testDataArray[2][4] = "pika-chu Code";

                testDataArray[3][0] = "Mar";
                testDataArray[3][1] = "31";
                testDataArray[3][2] = "19:00 - 20:00";
                testDataArray[3][3] = "Kelowna BC";
                testDataArray[3][4] = "ciccc Code";

                testDataArray[4][0] = "Apr";
                testDataArray[4][1] = "25";
                testDataArray[4][2] = "19:30 - 20:30";
                testDataArray[4][3] = "Vancouver BC";
                testDataArray[4][4] = "Awesome Code";
                break;
            case 1: // RecommendEventsData
                testDataArray[0][0] = "Fev";
                testDataArray[0][1] = "24";
                testDataArray[0][2] = "10:00 - 12:00";
                testDataArray[0][3] = "Vancouver BC";
                testDataArray[0][3] = "java Code";

                testDataArray[1][0] = "Jan";
                testDataArray[1][1] = "15";
                testDataArray[1][2] = "15:00 - 16:00";
                testDataArray[1][3] = "Prince Rupert BC";
                testDataArray[1][4] = "web Code";

                testDataArray[2][0] = "Sep";
                testDataArray[2][1] = "10";
                testDataArray[2][2] = "21:00 - 22:00";
                testDataArray[2][3] = "Nelson BC";
                testDataArray[2][4] = "Coffee Code";
                break;
            case 2: // userEvents
                testDataArray[0][0] = "Fev";
                testDataArray[0][1] = "24";
                testDataArray[0][2] = "10:00 - 12:00";
                testDataArray[0][3] = "Vancouver BC";
                testDataArray[0][3] = "java Code";

                testDataArray[1][0] = "Jan";
                testDataArray[1][1] = "15";
                testDataArray[1][2] = "15:00 - 16:00";
                testDataArray[1][3] = "Prince Rupert BC";
                testDataArray[1][4] = "web Code";

                testDataArray[2][0] = "Sep";
                testDataArray[2][1] = "10";
                testDataArray[2][2] = "21:00 - 22:00";
                testDataArray[2][3] = "Nelson BC";
                testDataArray[2][4] = "Coffee Code";
                break;
            case 3:// eventDetail
                testDataArray[0][0] = "May";
                testDataArray[0][1] = "5";
                testDataArray[0][2] = "9:00 - 10:00";
                testDataArray[0][3] = "Vancouver BC";
                testDataArray[0][4] = "Women Code";
                testDataArray[0][5] = "Welcome Coders for Free technical study !!";

                testDataArray[1][0] = "Jun";
                testDataArray[1][1] = "2";
                testDataArray[1][2] = "12:00 - 13:00";
                testDataArray[1][3] = "Montreal QC";
                testDataArray[1][4] = "Men Code";
                testDataArray[1][5] = "Welcome Coders for Hack events !!";

                testDataArray[2][0] = "Sep";
                testDataArray[2][1] = "10";
                testDataArray[2][2] = "18:00 - 19:00";
                testDataArray[2][3] = "Nelson BC";
                testDataArray[2][4] = "pika-chu Code";
                testDataArray[2][5] = "Let's gotcha a Pika-chu";

                testDataArray[3][0] = "Mar";
                testDataArray[3][1] = "31";
                testDataArray[3][2] = "19:00 - 20:00";
                testDataArray[3][3] = "Kelowna BC";
                testDataArray[3][4] = "ciccc Code";
                testDataArray[3][5] = "Studying with International Students";

                testDataArray[4][0] = "Apr";
                testDataArray[4][1] = "25";
                testDataArray[4][2] = "19:30 - 20:30";
                testDataArray[4][3] = "Vancouver BC";
                testDataArray[4][4] = "Awesome Code";
                testDataArray[4][5] = "Every Code Awesome";
                break;
            default:
        }



        return testDataArray;
    }
}
