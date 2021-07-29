package ru.rsf.MessageSender;

public class SendSMS extends BaseMessageCommand{

    SendSMS(String title, String message){
        super(title, message);
    }

    @Override
    public void execute() {
        String sb = "SEND SMS: {\n\t*" +
                title +
                "*\n\t" +
                message +
                "\n}";
        System.out.println(sb);
    }
}
