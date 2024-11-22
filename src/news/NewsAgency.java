package news;

import subscriber.Subscriber;

import java.util.List;

public class NewsAgency {
  private final List<Subscriber> subscribers;

  public NewsAgency(List<Subscriber> subscribers) {
    this.subscribers = subscribers;
  }

  public void addSubscriber(Subscriber subscriber) {
    subscribers.add(subscriber);
    System.out.println("\n" + subscriber.getName() + " subscribed to the news service.");
  }

  public void removeSubscriber(Subscriber subscriber) {
    subscribers.remove(subscriber);
    System.out.println("\n" + subscriber.getName() + " unsubscribed from the news service.");
  }

  public void publishNews(String news) {
    System.out.println("\nBreaking News: " + news);
    this.subscribers.forEach(subscriber -> {
      subscriber.update(news);
    });
  }
}
