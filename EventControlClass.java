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
        String[][] recommendEventsArray;
        recommendEventsArray = tt.makeTestData(1);
        return recommendEventsArray;
    }

    public String[] getEventDetail(int EventID){
        // It'll change to DB
        String[] eventDetail = new String[6];

        //Search event detail
        String[][] eventList = tt.makeTestData(0);
        for(int i=0;i<eventList.length;i++){
            if(EventID == Integer.parseInt(eventList[i][0])){
                for(int j=0; j<eventDetail.length;j++){
                    eventDetail[j] = eventList[i][j];
                }
                return eventDetail;
            }
        }

        System.out.println("EventID is not found !!");
        eventDetail[0] = "Error !!";
        return eventDetail;
    }

    public boolean postEvent(String eventName, String location,String data, String time, String description){
        return tt.setPostedUserEvent(eventName, location, data, time, description);
    }
}
