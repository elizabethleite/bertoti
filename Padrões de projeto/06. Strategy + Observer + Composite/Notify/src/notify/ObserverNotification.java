package notify;

/**
 *
 * @author eliza
 */
public class ObserverNotification implements NotifyObserver{
    
    private String nome;
    
    public ObserverNotification(String nome){
        this.nome = nome;
    }
    
    @Override
    public void update(String message){
        System.out.println(nome + "recebeu a notificação" + message);
    }
    
}
