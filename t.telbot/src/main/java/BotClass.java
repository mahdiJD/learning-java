import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BotClass  extends TelegramLongPollingBot {
    public String getBotUsername() {
        return "@T811bot";
    }
    public String getBotToken() {
        return "1412846515:AAH1NEECsBeTQa6FBSLZoKY-jUw9oz96Z7M";
    }
    public void onUpdateReceived(Update update) {
        String chatID=update.getMessage().getChatId().toString();
        System.out.println(update.getMessage().getText());
        String command=update.getMessage().getText();
        SendMessage MSG=new SendMessage();
        if (command.equals("salam")) {
            MSG.setChatId(chatID);
            MSG.setText("سلام ");
        }else {
            MSG.setChatId(chatID);
            MSG.setText("لطفاً پیام مناسبی را وارد کنید");
        }
        try{
            execute(MSG);
        }catch (TelegramApiException ex){
            Logger.getLogger(BotClass.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

}
