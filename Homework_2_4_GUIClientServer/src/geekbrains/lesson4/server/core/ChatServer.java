package geekbrains.lesson4.server.core;

public class ChatServer {

    public void start(int port) {
        System.out.println("Server started at port: " + port);
    }

    public void stop() {
        System.out.println("Server stopped");
        System.exit(0);
    }

    public void writeChatMessageHistory(){
        //Думаю вся история должна храниться на серваке ибо в таком случае можно
        //будет зайти с другого устройства на свой акк и запросить свою историю сбщ.
        //Ну и сервер же не знает на каком компьютере хранится самая свежая история сбщ,
        //если хранить её где нибудь в клиентской части.
        //Ну или вдруг фсб наедет ,мол "гони ка сбщ всех и вся быстро!"
    }

}
