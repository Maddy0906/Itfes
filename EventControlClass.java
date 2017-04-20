package Itfes;

/**
 * Created by Nobuaki on 2017-04-19.
 */
public class EventControlClass {
    testTools tt = new testTools();


    public String[][] getUpcomingEvents(){
        /** It'll change to DB **/
        String[][] upComingEventsArray;
        // TEST event data
        upComingEventsArray = tt.makeTestData(0);
        return upComingEventsArray;
    }

    public String[][] getRecommendEvents(){
        /** It'll change to DB **/
        String[][] reccomendEventsArray;
        reccomendEventsArray = tt.makeTestData(1);

    public String[] getUpcommingEvents(){
        // It'll change to DB
        String[] upCommingEventsArray = new String[1];
        return upCommingEventsArray;
    }

    public String[] getRecommendEvents(){
        // It'll change to DB
        String[] reccomendEventsArray = new String[1];
        return reccomendEventsArray;
    }

    public String[] getEventDetail(int EventID){
        // It'll change to DB
        String[] eventDetail = new String[1];
        return eventDetail;
    }

    public boolean postEvent(String[] eventInfomation){

        return true;
    }
}
