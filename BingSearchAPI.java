public class BingSearchAPI extends SearchAPI{
	//Bing Specific Implementation
	private static BingSearchAPI instance;
	private BingSearchAPI(){}
	public static SearchAPI getBingInstance(){
		if (bingInstance == null) instance = new BingSearchAPI();
		return instance;
	}
}
