package ru.rsf.MessageSender;

public class Main {
    public static void main(String[] args) {
        System.out.println("======================================Message Sender======================================\n");

        Command c1 = new SendSMS("Анкетирование от банка",
                "Здравствуйте! Приглашаем вас пройти краткий опрос о качестве услуг нашего банка.\n\tДля этого перейдите по ссылке: https://www.sberbank.ru/");
        c1.execute();

        Command c2 = new SendEmail("Анкетирование от банка",
                "Здравствуйте! Приглашаем вас пройти краткий опрос о качестве услуг нашего банка.\n\tДля этого перейдите по ссылке: https://www.sberbank.ru/");
        c2.execute();

        Command c3 = new SendDoubleMessage();
    }
}