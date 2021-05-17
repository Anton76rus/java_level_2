package geekbrains.lesson4.server.core;


public class ChatServer {


    public void start(int port) {
        System.out.println("Server started at port: " + port);
    }

    public void stop() {
        System.out.println("Server stopped");
        System.exit(0);
    }

    public void writeChatMessageHistory(String text) {
        //Думаю вся история должна храниться на серваке
        //Наверно вызываться будет из потока ServerGUI
        // и каким то образом получать сбщ или историю с потока ClientGUI
        //А потом отправлять всем обратно обновлённый log
        //Но так как я не могу знать как работать с потоками
        // та и сервера то нет пока никакого
        // ограничюсь комментариями
    }
}
