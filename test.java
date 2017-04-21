package Itfes;

/**
 * Created by kaorihirata on 2017-04-20.
 */
public class test {
    public String[][] makeTestData(){

        String[][] testDataArray = new String[5][5];
        /**
         * 曜日、日付、時間、場所、イベント名
         */
        testDataArray[0][0] = "Oct";
        testDataArray[0][1] = "18";
        testDataArray[0][2] = "7:00 - 8:00";
        testDataArray[0][3] = "Vancouver BC";
        testDataArray[0][3] = "Morning Code";

        testDataArray[1][0] = "Nov";
        testDataArray[1][1] = "14";
        testDataArray[1][2] = "6:00 - 7:00";
        testDataArray[1][3] = "Prince Rupert BC";
        testDataArray[1][4] = "Early bird Code";

        testDataArray[2][0] = "Dec";
        testDataArray[2][1] = "12";
        testDataArray[2][2] = "7:30 - 8:30";
        testDataArray[2][3] = "Nelson BC";
        testDataArray[2][4] = "Sunrise Code";


        return testDataArray;
    }


}
