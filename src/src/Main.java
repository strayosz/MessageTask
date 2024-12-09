package org.example;
public class Main {
    public static void main(String args[]) {
        //Массив данных о пользователях
        User[] listUsers = UserService.create4Users();
        //Массив данных о сообщении
        String[] message = MessageService.create4Message(listUsers[0], listUsers[1], listUsers[2], listUsers[3]);

        //Вывод информации о пользователях
        for (int i = 0; i < listUsers.length; i++) {
            System.out.println(listUsers[i].getNickname());
            System.out.println(listUsers[i].getName());
            System.out.println(listUsers[i].getNumber());
            System.out.println(listUsers[i].getPassword() + "\n");
        }
        
        System.out.println();
        //ajsklfalskjf;alskfja;lsjfal;fjasf
        //Вывод сообщений
        for (int i = 0; i < message.length; i++) {
            System.out.println(message[i]);
        }
    }
}