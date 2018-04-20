public class GoogleSearchAPI extends SearchAPI{
	//Google Specific Implementation
	private static GoogleSearchAPI instance;
	private GoogleSearchAPI(){}
	public static SearchAPI getGoogleInstance(){
		if (googleInstance == null) instance = new GoogleSearchAPI();
		return instance;
	}
}