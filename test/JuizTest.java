import org.junit.Before;
import org.junit.Test;

import br.gft.model.Juiz;

public class JuizTest {

	private Juiz juiz;

	@Before
	public void setUp() {
		juiz = new Juiz();
	}
	
	@Test
	public void papelGanhaDePedra() {
		String mensagem = juiz.resposta("Papel", "Pedra");
		System.out.println(mensagem);
	}
	
	@Test
	public void PedraGanhaDeTesoura() {
		String mensagem = juiz.resposta("Pedra", "Tesoura");
		System.out.println(mensagem);
	}
	

}
