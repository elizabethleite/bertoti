public class Main {
    public static void main(String[] args) {
        NotifyStrategy emailStrategy = new EmailNotification();
        NotifyStrategy messageStrategy = new MessageNotification();

        NotifyObserver user1 = new ObserverNotification("Usuário 1");
        NotifyObserver user2 = new ObserverNotification("Usuário 2");

        User basicUser1 = new BasicUser("BasicUser1");
        User basicUser2 = new BasicUser("BasicUser2");

        GroupUser group1 = new GroupUser();
        group1.addUser(user1);
        group1.addUser(basicUser1);

        GroupUser group2 = new GroupUser();
        group2.addUser(user2);
        group2.addUser(basicUser2);

        emailStrategy.sendNotification("Notificação por e-mail!");
        messageStrategy.sendNotification("Notificação por mensagem!");

        group1.notifyUsers("Notificação para o primeiro grupo!");
        group2.notifyUsers("Notificação para o segundo grupo!");
    }
}
