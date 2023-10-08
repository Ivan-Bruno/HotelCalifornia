package HotelCalifornia;

public class Gerente implements Usuario {
	String id;
	String nome;
	String tipoUsuario;
	long documento;
	Usuario user;
	
	public Gerente(String idAutenticacao, String nome, String tipoUsuario, long documento){
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
			this.user = new Funcionario(idAutenticacao, nome, tipoUsuario, documento);
		} else {
			return "ALGO DEU ERRADO";
		}
		return "Cadastro concluído";
	}
	
	

}
