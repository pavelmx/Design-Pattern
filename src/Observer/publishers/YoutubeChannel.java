package Observer.publishers;

import java.util.LinkedList;
import java.util.List;

import Observer.subscribers.Subscriber;

public class YoutubeChannel implements Publisher {

	private LinkedList<Subscriber> subscribers = new LinkedList<>();
	
	@Override
	public void createNews(String news) {
		System.out.println("NEW NEWS!!! \n" + "<" + news + ">");
		notificationToSubscribers(news);
	}

	@Override
	public LinkedList<Subscriber> getSubscribers() {		
		return subscribers;
	}

	@Override
	public void addSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
		System.out.println(subscriber.getClass().getSimpleName() + " added succesfully");
	}

	@Override
	public void deleteSubscriber(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}

	@Override
	public void deleteSubscribers(List<Subscriber> subscribers) {
		subscribers.clear();
	}

	@Override
	public void notificationToSubscribers(String news) {
		for (Subscriber subscriber : subscribers) {
			subscriber.getNews(news);
		}
	}

}
