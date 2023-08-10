package fil;

public class BMS {
	public static void main(String[] args) {
		The t1 = new The();
		The t2 = new The();
		
		t1.sno=1;
		t1.seats=200;
		t1.movies="baby";
		t1.movies();
		System.out.println("available classe for baby are ");
		t1.classes();
		
		System.out.println("available classe for HHB are ");
		t1.classes();
		
		System.out.println(t1.sno+" "+t1.seats+" "+t1.movies);
		
	}

}
