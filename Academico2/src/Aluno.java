import java.time.LocalDate;

public class Aluno {
	private String nome;
	private String RA;
	private String sexo;
	private LocalDate data;
	

	 @Override
	public String toString() {
		return "Aluno [nome=" + nome + ", RA=" + RA + ", sexo=" + sexo + ", data=" + getDtataComoString() + "]";
	}
	  public Aluno(String nome, String rA, String sexo, LocalDate data) {
		super();
		this.nome = nome;
		RA = rA;
		this.sexo = sexo;
		this.data = data;
		
		
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRA() {
		return RA;
	}
	public void setRA(String rA) {
		RA = rA;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getDtataComoString() {
		return data.getDayOfMonth() + "/" +
                data.getMonthValue()+ "/" + 
				data.getYear();
	
	
	}
}
