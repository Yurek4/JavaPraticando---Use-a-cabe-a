package NewProjeto;

public class Player {
	 
	int number = 0;
	
	void guess() {
		System.out.println("Estou chutando o numero...");
		number = (int) (Math.random()*10);
	}
		
}
