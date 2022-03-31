/**
 * Created by s7331 on 3/31/2022.
 */
public class RushHour {
    public String TrainTicketFare(float time){
        String ticketPrice="null";
        if(time<=0 || time>24)
            throw  new IllegalArgumentException(" Invalid Time!!!");
        if ((time>=1 && time<=9.50) || (time>=16 && time<=19.50) )
            ticketPrice="Full Fare";
        if ((time>9.50 && time<16) || (time>19.50 && time<=24) )
            ticketPrice="Saver Fare ";

        return ticketPrice;

    }
}
