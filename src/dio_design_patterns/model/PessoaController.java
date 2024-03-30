package dio_design_patterns.model;

import api_externa.CadastrarPessoa;
import api_externa.CadastrarPessoaFisica;
import api_externa.CadastrarPessoaJuridica;
import api_externa.VerificaDocumento;

// Controller implementa o Facade, escondendo a complexidade da API externa
public class PessoaController {
	
	private CadastrarPessoa cadastrarPessoa;
	
	public void cadastrar(Pessoa pessoa) {
		VerificaDocumento verifica = VerificaDocumento.getInstante();
		if(verifica.isCpf(pessoa.getDocumento())) {
			CadastrarPessoa cadastro = new CadastrarPessoaFisica();
			this.setTipoCadastro(cadastro);
		} else if(verifica.isCnpj(pessoa.getDocumento())) {
			CadastrarPessoa cadastro = new CadastrarPessoaJuridica();
			this.setTipoCadastro(cadastro);
		}
		this.cadastrarPessoa.cadastrar(pessoa.getNome(), pessoa.getDataNascimento(), pessoa.getDocumento());
	}
	
	private void setTipoCadastro(CadastrarPessoa pessoa) {
		this.cadastrarPessoa = pessoa;
	}
}
