package Observer.subscribers;

public class YoutubeAccountKolya implements Subscriber{

	@Override
	public void getNews(String news) {
		System.out.println(getClass().getSimpleName() + " got news " + "<" + news + ">");
	}

}
