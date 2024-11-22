import news.NewsAgency;
import subscriber.NewsSubscriber;
import subscriber.Subscriber;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    NewsAgency newsAgency = new NewsAgency(new ArrayList<>());

    Subscriber subscriber1 = new NewsSubscriber("Luis");
    Subscriber subscriber2 = new NewsSubscriber("Josh");

    newsAgency.addSubscriber(subscriber1);
    newsAgency.addSubscriber(subscriber2);

    newsAgency.publishNews("\nToday's Weather: Mild Temperatures and Light Showers Expected");

    newsAgency.removeSubscriber(subscriber1);

    newsAgency.publishNews("\nTraffic Update: Major Delays on Highway Due to Construction");
  }
}
