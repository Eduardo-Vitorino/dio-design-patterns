package api_externa;

// Implementação do padão estrategia. Altera o tipo de cadastro, caso seja pesoa fisica ou juridica
public interface CadastrarPessoa {
	void cadastrar(String nome, String dtNascimento, String documento);
}
