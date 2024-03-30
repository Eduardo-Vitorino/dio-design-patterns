import dio_design_patterns.model.Pessoa;
import dio_design_patterns.model.PessoaController;

public class Main {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Eduardo");
		p1.setDataNascimento("19981106");
		p1.setDocumento("01234567899");
		
		Pessoa p2 = new Pessoa();
		p2.setNome("DIO");
		p2.setDataNascimento("2019");
		p2.setDocumento("01234567898765");
		
		PessoaController controller = new PessoaController();
		controller.cadastrar(p1);
		controller.cadastrar(p2);
	}
}
