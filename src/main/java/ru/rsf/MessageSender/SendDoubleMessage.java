package ru.rsf.MessageSender;

public class SendDoubleMessage implements Command{

    SendDoubleMessage(String smsTitle, String smsMessage, String emailTitle, String emailMessage) {
        
    }

    @Override
    public void execute(){
        Command sms = new SendSMS("", "");
        Command email = new SendEmail("", "");
        sms.execute();
        email.execute();
    }
}
