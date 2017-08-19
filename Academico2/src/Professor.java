
public class Professor {
	private String nome;
	private String matricula;
	private String titulacao;
	private String CPF;

	
	
	
	
	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", matricula=" + matricula + ", titulação=" + titulacao + ", CPF=" + CPF
				+ "]";
	}
	public Professor(String nome, String matricula, String titulação, String cPF) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.titulacao = titulação;
		CPF = cPF;
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTitulação() {
		return titulacao;
	}
	public void setTitulação(String titulação) {
		this.titulacao = titulação;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	

}
