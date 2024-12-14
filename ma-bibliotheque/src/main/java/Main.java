import com.google.gson.Gson;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne personne = new Personne("Alice",30);
		Gson gson = new Gson();
		String json = gson.toJson(personne);
		System.out.println(json);	
	}
}
