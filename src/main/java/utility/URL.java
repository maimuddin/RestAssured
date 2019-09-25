package utility;

public enum URL{
	COUNTRY("/country");
	
	private String url;
	URL(String url) {
		this.url = url;
	}
	
	public String getURL() {
		return this.url;
	}
	
	public String getURL(String appendURL) {
		return this.url+appendURL;
	}
	
	public static void main(String ae[]) {
		System.out.println(URL.COUNTRY.getURL());
	}
}
