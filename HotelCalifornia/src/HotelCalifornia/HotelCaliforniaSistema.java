package HotelCalifornia;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class HotelCaliforniaSistema {
   	Administrador admPadrao = new Administrador("ADM1", "João Costa", "ADM", 123456);

   	public HotelCaliforniaSistema() {
        // Construtor
    }

    public String cadastrarUsuario(String idAutenticacao, String nome, String tipoUsuario, long documento) {
        if(tipoUsuario.equals("CLI")) {
        	return "CLIENTES NÃO PODEM CADASTRAR USUÁRIOS!";
        } else if(tipoUsuario.equals("FUN")) {
        	
        }
        return "";
    }

    public String atualizarUsuario(String idAutenticacao, String idUsuario, String novoTipoUsuario) {
        // Implementação
        return "";
    }

    public String exibirUsuario(String idUsuario) {
        // Implementação
        return "";
    }

    public String[] listarUsuarios() {
        // Implementação
        return new String[0];
    }

    public String disponibilizarQuartoSingle(String idAutenticacao, int idQuartoNum, double precoPorPessoa, double precoBase) {
        // Implementação
        return "";
    }

    public String disponibilizarQuartoDouble(String idAutenticacao, int idQuartoNum, double precoPorPessoa, double precoBase, String[] pedidos) {
        // Implementação
        return "";
    }

    public String disponibilizarQuartoFamily(String idAutenticacao, int idQuartoNum, double precoPorPessoa, double precoBase, String[] pedidos, int qtdMaxPessoas) {
        // Implementação
        return "";
    }

    public String exibirQuarto(int idQuartoNum) {
        // Implementação
        return "";
    }

    public String[] listarQuartos() {
        // Implementação
        return new String[0];
    }

    public String reservarQuartoSingle(String idAutenticacao, String idCliente, int numQuarto, LocalDateTime dataInicio, LocalDateTime dataFim, String[] idRefeicoes) {
        // Implementação
        return "";
    }

    public String reservarQuartoDouble(String idAutenticacao, String idCliente, int numQuarto, LocalDateTime dataInicio, LocalDateTime dataFim, String[] idRefeicoes, String[] pedidos) {
        // Implementação
        return "";
    }

    public String reservarQuartoFamily(String idAutenticacao, String idCliente, int numQuarto, LocalDateTime dataInicio, LocalDateTime dataFim, String[] idRefeicoes, String[] pedidos, int numPessoas) {
        // Implementação
        return "";
    }

    public String exibirReserva(String idAutenticacao, long idReserva) {
        // Implementação
        return "";
    }

    public String[] listarReservasAtivasDoCliente(String idAutenticacao, String idCliente) {
        // Implementação
        return new String[0];
    }

    public String[] listarReservasAtivasDoClientePorTipo(String idAutenticacao, String idCliente, String tipo) {
        // Implementação
        return new String[0];
    }

    public String[] listarReservasAtivasPorTipo(String idAutenticacao, String tipo) {
        // Implementação
        return new String[0];
    }

    public String[] listarReservasAtivas(String idAutenticacao) {
        // Implementação
        return new String[0];
    }

    public String[] listarReservasTodas(String idAutenticacao) {
        // Implementação
        return new String[0];
    }

    public String disponibilizarRefeicao(String idAutenticacao, String tipoRefeicao, String titulo, LocalTime horarioInicio, LocalTime horarioFinal, double valor, boolean disponivel) {
        // Implementação
        return "";
    }

    public String alterarRefeicao(long idRefeicao, LocalTime horarioInicio, LocalTime horarioFinal, boolean disponivel) {
        // Implementação
        return "";
    }

    public String exibirRefeicao(long idRefeicao) {
        // Implementação
        return "";
    }

    public String[] listarRefeicoes() {
        // Implementação
        return new String[0];
    }

    public String reservarRestaurante(String idAutenticacao, String idCliente, LocalDateTime dataInicio, LocalDateTime dataFim, int qtdePessoas, String refeicao, long idPagamento) {
        // Implementação
        return "";
    }

    public String disponibilizarFormaDePagamento(String idAutenticacao, String formaPagamento, double percentualDesconto) {
        // Implementação
        return "";
    }

    public String alterarFormaDePagamento(String idAutenticacao, int idFormaPagamento, String formaPagamento, double percentualDesconto) {
        // Implementação
        return "";
    }

    public String exibirFormaPagamento(int idFormaPagamento) {
        // Implementação
        return "";
    }

    public String[] listarFormasPagamentos() {
        // Implementação
        return new String[0];
    }

    public String pagarReservaComDinheiro(String idCliente, long idReserva, String nomeTitular) {
        // Implementação
        return "";
    }

    public String pagarReservaComCartao(String idCliente, long idReserva, String nomeTitular, String numCartao, LocalDate validade, int digitoVerificador, int qtdeParcelas) {
        // Implementação
        return "";
    }

    public String pagarReservaComPix(String idCliente, long idReserva, String nomeTitular, String cpf, String banco) {
        // Implementação
        return "";
    }

    public String cancelarReserva(String idCliente, String idReserva) {
        // Implementação
        return "";
    }

    public String disponibilizarAreaComum(String idAutenticacao, String tipoAreaComum, String titulo, LocalTime horarioInicio, LocalTime horarioFinal, double valorPessoa, boolean disponivel, int qtdMaxPessoas) {
        // Implementação
        return "";
    }

    public String alterarAreaComum(String idAutenticacao, long idAreaComum, LocalTime novoHorarioInicio, LocalTime novoHorarioFinal, double novoPreco) {
        // Implementação
        return "";
    }

    public String exibirAreaComum(long idAreaComum) {
        // Implementação
        return "";
    }

    public String[] listarAreasComuns() {
        // Implementação
        return new String[0];
    }

    public String reservarAuditorio(String idAutenticacao, String idCliente, LocalDateTime dataInicio, LocalDateTime dataFim, int qtdMaxPessoas, long idPagamento) {
        // Implementação
        return "";
    }

    public String reservarCinema(String idAutenticacao, String idCliente, LocalDateTime dataInicio, LocalDateTime dataFim, int qtdMaxPessoas, String[] filmes, long idPagamento) {
        // Implementação
        return "";
    }

    public String reservarPiscina(String idAutenticacao, String idCliente, LocalDateTime dataInicio, LocalDateTime dataFim, int qtdMaxPessoas, String categoria, long idPagamento) {
        // Implementação
        return "";
    }

    public String reservarSalaoDeFestas(String idAutenticacao, String idCliente, LocalDateTime dataInicio, LocalDateTime dataFim, int qtdMaxPessoas, boolean churrasqueira, boolean cozinha, long idPagamento) {
        // Implementação
        return "";
    }

    public String organizarEvento(String idAutenticacao, String idCliente, String titulo, String contato, String tipo, String[] conjuntoReservas) {
        // Implementação
        return "";
    }

    public String excluirEvento(String idAutenticacao, String idEvento) {
        // Implementação
        return "";
    }

    public String exibirEvento(String idEvento) {
        // Implementação
        return "";
    }

    public String[] listarEventos() {
        // Implementação
        return new String[0];
    }
}
