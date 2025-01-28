
public class TestPersonne {
	public static void main(String[] args) {
		Personne P1 = new Personne("Agostinelli","Laurence");
		System.out.println(P1);
		//Une deuxième personne
		Personne P2 = new Personne("Barberis","Alexis");
		System.out.println(P2);
		System.out.println(P1.getNom());
		System.out.println(P1.getPrenom());
	}
}
