package day13;



import static day13.MessageDatabase.showDialog;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        User user1 = new User("Вася");
        User user2 = new User("Коля");
        User user3 = new User("Миша");

        user1.sendMessage(user2,"Привет");
        user1.sendMessage(user2,"Ты на месте?");

        user2.sendMessage(user1, "Привет, как дела?");
        user2.sendMessage(user1, "Да, все хорошо");
        user2.sendMessage(user1, "А у тебя?");

        user3.sendMessage(user1, "Проверяем сообщения");
        user3.sendMessage(user1, "Ве работает?");
        user3.sendMessage(user1, "Прочитай");

        user1.sendMessage(user3,"Привет, что нового?");
        user1.sendMessage(user3,"Хоп хей?");
        user1.sendMessage(user3,"Лалалей?");

        user3.sendMessage(user1, "Где вопросы где ответы");

        showDialog(user1,user3);
    }
}
