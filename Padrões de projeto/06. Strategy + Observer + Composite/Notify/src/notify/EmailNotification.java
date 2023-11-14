package notify;

/**
 *
 * @author eliza
 */
public class EmailNotification implements NotifyStrategy{
    
    @Override
    public void sendNotification(String message){
        System.out.println("Enviando e-email: " + message);
    }
    
}
