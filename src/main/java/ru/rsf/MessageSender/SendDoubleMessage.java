package ru.rsf.MessageSender;

public class SendDoubleMessage implements Command{

    String smsTitle;
    String smsMessage;
    String emailTitle;
    String emailMessage;
    SendDoubleMessage(String smsTitle, String smsMessage, String emailTitle, String emailMessage) {
        this.smsTitle = smsTitle;
        this.smsMessage = smsMessage;
        this.emailMessage = emailMessage;
        this.emailTitle = emailTitle;
    }

    @Override
    public void execute(){
        Command sms = new SendSMS(smsTitle, smsMessage);
        Command email = new SendEmail(emailTitle, emailMessage);
        sms.execute();
        email.execute();
    }
}
