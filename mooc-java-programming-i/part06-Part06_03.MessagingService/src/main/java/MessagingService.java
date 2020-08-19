import java.util.ArrayList;

public class MessagingService    {

    ArrayList<Message> messages ;

    public MessagingService(){

        messages = new ArrayList<Message>();
    }

    public void add(Message message){
        if (message.getContent().length() <= 280) {
            messages.add(message);
        }

    }

    public ArrayList<Message> getMessages(){
        return messages;
    }
}
