package Itfes;

/**
 * Created by kaorihirata on 2017-04-19.
 */
interface Validate {
    public boolean validate(String email, String password); // LoginAndRegisterPage 
    public boolean validate(String eventName, String location, String date, String time, String description); // PostEventPage
}
