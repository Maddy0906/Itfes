package Itfes;

/**
 * Created by kaorihirata on 2017-04-19.
 */
interface Validate {
    public boolean validate(String email, String password);
    public boolean validate(String eventName, String location, String date, String time, String description);
}
