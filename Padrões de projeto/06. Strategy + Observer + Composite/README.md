## O MVC utilizando os 3 padrões 

Resumo: é um sistema de notificações onde diferentes tipos de notificações podem ser enviadas para diferentes grupos de usuários.

O padrão Strategy é usado para permitir que o sistema tenha diferentes estratégias de notificação. Você pode facilmente trocar entre estratégias de notificação chamando setNotifyStrategy no contexto (Notify). Isso permite que o sistema envie notificações por e-mail ou mensagem, conforme necessário, sem modificar o código do cliente.

O padrão Observer é utilizado para permitir que usuários (observadores) recebam notificações quando ocorre um evento. Usuários podem se inscrever para receber notificações chamando addUser no Notify. Quando uma notificação é enviada, todos os observadores (usuários) são notificados automaticamente.

O padrão Composite é utilizado para tratar tanto usuários individuais quanto grupos de usuários de maneira uniforme. Usuários básicos e grupos podem ser tratados de maneira uniforme, já que ambos implementam a interface User. GroupUser pode conter tanto BasicUser quanto outros GroupUser, formando uma estrutura hierárquica.

## Diagrama UML

![MVC](https://github.com/elizabethleite/bertoti/assets/101938881/e6909c2d-3606-4ca6-9863-a79b7991574d)
