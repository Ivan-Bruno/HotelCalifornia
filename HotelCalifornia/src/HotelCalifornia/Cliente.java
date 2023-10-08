package HotelCalifornia;

public class Cliente implements Usuario{
	String id;
	String nome;
	String tipoUsuario;
	long documento;
	
	public Cliente(String idAutenticacao, String nome, String tipoUsuario, long documento){
		this.id = idAutenticacao;
		this.nome = nome;
		this.tipoUsuario = tipoUsuario;
		this.documento = documento;
	}

	@Override
	public String cadastraUsuario(String idAutenticacao, String nome, String tipoUsuario, long documento) {
		return "CLIENTES NÃO PODEM CADASTRAR USUÁRIOS";
	}

}
