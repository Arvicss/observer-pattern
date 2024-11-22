package subscriber;

public class NewsSubscriber implements Subscriber {
  private final String name;

  public NewsSubscriber(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void update(String news) {
    System.out.println("\n" + name + " received news: " + news);
  }
}
