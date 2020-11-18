
public class TestBuilderPatterns {
	private DTPMWebsiteBuilder dtpmBuilder = new DTPMWebsiteBuilder();
	public static void main(String[] args) {
		WebsiteBuilder dtpmWebsiteBuilder  = new DTPMWebsiteBuilder();
		WebsiteBuilder tuTuongWebsiteBuilder  = new TuTuongWebsiteBuilder();
		
		WebsiteDirector director = new WebsiteDirector(dtpmWebsiteBuilder);
		director.build();
		WebsiteSubject subject = dtpmWebsiteBuilder.getWebsiteSubject();
		System.out.println(subject);
		
		director = new WebsiteDirector(tuTuongWebsiteBuilder);
		director.build();
		subject = tuTuongWebsiteBuilder.getWebsiteSubject();
		System.out.println(subject);
	}
}
