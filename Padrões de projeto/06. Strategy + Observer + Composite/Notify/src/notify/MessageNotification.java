package notify;

/**
 *
 * @author eliza
 */
public class MessageNotification implements NotifyStrategy {
    
    @Override
    
    public void sendNotification(String message){
        System.out.println("Enviando mensagem: " + message);
    }
    
}
