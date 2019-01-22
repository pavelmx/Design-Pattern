package Observer.publishers;

import java.util.LinkedList;
import java.util.List;

import Observer.subscribers.Subscriber;

public interface Publisher {
	
	void createNews(String news);

	LinkedList<Subscriber> getSubscribers();
	
	void addSubscriber(Subscriber subscriber);
	
	void deleteSubscriber(Subscriber subscriber);
	
	void deleteSubscribers(List<Subscriber> subscribers);
	
	void notificationToSubscribers(String news);
	
}
