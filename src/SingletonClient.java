
public class SingletonClient {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
//		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton.getDescription());
		
	}

}
