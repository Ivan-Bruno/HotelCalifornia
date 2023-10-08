package HotelCalifornia;

public class Administrador implements Usuario{
	String id;
	String nome;
	String tipoUsuario;
	long documento;
	Usuario user;
	
	public Administrador(String idAutenticacao, String nome, String tipoUsuario, long documento){
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
			this.user = new Administrador(idAutenticacao, nome, tipoUsuario, documento);
		} else if(tipoUsuario.equals("FUN")) {
			this.user = new Funcionario(idAutenticacao, nome, tipoUsuario, documento);
		} else if(tipoUsuario.equals("GER")) {
			this.user = new Gerente(idAutenticacao, nome, tipoUsuario, documento);
		}else {
			return "ALGO DEU ERRADO";
		}
		return "Cadastro concluído";
	}
	

}
