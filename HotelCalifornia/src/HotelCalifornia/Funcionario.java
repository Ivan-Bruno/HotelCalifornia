package HotelCalifornia;

public class Funcionario implements Usuario{
	String id;
	String nome;
	String tipoUsuario;
	long documento;
	Usuario user;
	
	public Funcionario(String idAutenticacao, String nome, String tipoUsuario, long documento){
		this.id = idAutenticacao;
		this.nome = nome;
		this.tipoUsuario = tipoUsuario;
		this.documento = documento;
	}

	@Override
	public String cadastraUsuario(String idAutenticacao, String nome, String tipoUsuario, long documento) {
		if(tipoUsuario.equals("CLI")) {
			this.user = new Cliente(idAutenticacao, nome, tipoUsuario, documento);
		} else if(tipoUsuario.equals("ADM")) {
			return "VOCÊ NÃO PODE CADASTRAR ESSE TIPO DE USUÁRIO";
		} else if(tipoUsuario.equals("FUN")) {
			return "VOCÊ NÃO PODE CADASTRAR ESSE TIPO DE USUÁRIO";
		} else if(tipoUsuario.equals("GER")) {
			return "VOCÊ NÃO PODE CADASTRAR ESSE TIPO DE USUÁRIO";
		} else {
			return "ALGO DEU ERRADO";
		}
		return "Cadastro concluído";
	}

}
