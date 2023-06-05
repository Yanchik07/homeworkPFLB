package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Mail<T>> {
    Map<String, List<T>> mailBox = new MailBox<>();

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(Mail<T> mail) {
        // Этот метод должен разложить почту по почтовым ящикам получателей
        List<T> list = mailBox.get(mail.getTo());
        if (list.size() == 0) {
            list = new ArrayList<T>();
        }
        list.add(mail.getContent());
        mailBox.put(mail.getTo(), list);
    }
}
