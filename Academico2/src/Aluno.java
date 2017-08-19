import java.util.Calendar;

public class Aluno {
	private String nome;
	private String RA;
	private String sexo;
	private Calendar data;
	

	 @Override
	public String toString() {
		return "Aluno [nome=" + nome + ", RA=" + RA + ", sexo=" + sexo + ", data=" + getDtataComoString() + "]";
	}
	  public Aluno(String nome, String rA, String sexo, Calendar data) {
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
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getDtataComoString() {
		return this.data.get(Calendar.DAY_OF_MONTH) +" | " +
	this.data.get(Calendar.MONTH) + " | " +
	this.data.get(Calendar.YEAR);
	
	
	}
}
