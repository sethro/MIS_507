public abstract class SearchAPI{

	protected static SearchAPI bingInstance;
	protected static SearchAPI googleInstance;
	
	public static SearchAPI getBingInstance(){
		bingInstance = BingSearchAPI.getBingInstance();
		return bingInstance;
	}
	
	public static SearchAPI getGoogleInstance(){
		googleInstance = GoogleSearchAPI.getGoogleInstance();
		return googleInstance;	
	}
}

public class BingSearchAPI extends SearchAPI{
	//Bing Specific Implementation
	private static BingSearchAPI instance;
	private BingSearchAPI(){}
	public static SearchAPI getBingInstance(){
		if (bingInstance == null) instance = new BingSearchAPI();
		return instance;
	}
}

public class GoogleSearchAPI extends SearchAPI{
	//Google Specific Implementation
	private static GoogleSearchAPI instance;
	private GoogleSearchAPI(){}
	public static SearchAPI getGoogleInstance(){
		if (googleInstance == null) instance = new GoogleSearchAPI();
		return instance;
	}
}

