package api_externa;

/*
 * Implementação de Singleton Instance Holder
 */
public class VerificaDocumento {
	
	public static class InstanceHolder {
		private static VerificaDocumento verificaDocumento = new VerificaDocumento();
	}
	
	private VerificaDocumento() {}
	
	public static VerificaDocumento getInstante() {
		return InstanceHolder.verificaDocumento;
	}
	
	public boolean isCpf(String documento) {
		// TODO: Implementar algoritimo de validação de CPF
		if(documento.length() == 11) {
			return true;
		}
		return false;
	}
	
	public boolean isCnpj(String documento) {
		// TODO: Implementar algoritimo de validação de CNPJ
		if(documento.length() == 14) {
			return true;
		}
		return false;
	}
}
