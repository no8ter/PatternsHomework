package ru.rsf.MessageSender;

public class SendEmail extends BaseMessageCommand {

    SendEmail(String title, String message) {
        super(title, message);
    }

    @Override
    public void execute() {
        String sb = "SEND EMAIL: {\n\t*" +
                title +
                "*\n\t" +
                message +
                "\n}";
        System.out.println(sb);

        Command sms = new SendSMS("Анкетирование от банка", "Здравствуйте! Вам на электронную почту было отправлено приглашение пройти опрос от банка.");
        sms.execute();
    }
}
