package api_externa;

public class CadastrarPessoaJuridica implements CadastrarPessoa {

	@Override
	public void cadastrar(String nome, String dtNascimento, String documento) {
		System.out.println("\n************************************************");
		System.out.println("Pessoa juridica cadastrada com sucesso!");
		System.out.println("\nNome:" + nome);
		System.out.println("\nData nascimento:" + dtNascimento);
		System.out.println("\nDocumento:" + documento);
		System.out.println("\n************************************************\n");
	}
}
