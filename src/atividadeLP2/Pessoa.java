package atividadeLP2;

public abstract class Pessoa {

		private int identificacao, ferias;
		private String nome, profissao, cpf, genero;
		
		public Pessoa(int num, String nome, String profissao, String cpf, String genero, int ferias) {	
			this.identificacao = num;
			this.nome = nome;
			this.profissao = profissao;
			this.cpf = cpf;
			this.genero = genero;
			this.ferias = ferias;
		}
		
		public Pessoa() {	
			this.identificacao = -1 ;
			this.nome = "";
			this.profissao = "";
			this.cpf = "";
			this.genero = "";
			this.ferias = -1 ;
		}
		
		public int getIdentificacao() {
			return identificacao;
		}
		public void setIdentificacao(int identificacao) {
			this.identificacao = identificacao;
		}
		public int getFerias() {
			return ferias;
		}
		public void setFerias(int ferias) {
			this.ferias = ferias;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getProfissao() {
			return profissao;
		}
		public void setProfissao(String profissao) {
			this.profissao = profissao;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		
		public String mostrarPessoa() {
			return String.format("IDENTIFICACAO: %d\nNOME: %s\nCPF: %s\nCARGO: %s\nGENERO: %s\nMES FERIAS: %d",this.identificacao,this.nome,this.cpf,this.profissao,this.genero,this.ferias);
		}
		
		

}
