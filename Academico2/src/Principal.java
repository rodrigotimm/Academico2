import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		//registrar data de nascimento
        LocalDate data = LocalDate.of(1995, 5, 5);
		
		
		Aluno a1 = new Aluno ("Rodrigo Timm", "21709007","Masculino",data);
		      System.out.println(a1);
		
		Disciplina d1 = new Disciplina("TGA","Computação",40);
		      System.out.println(d1);
		
		
	    Professor p1 = new Professor ("Fayette","04449328","Mestrado","0419898932");
		       System.out.println(p1);
		       
		       
		Turma t1 = new Turma ("UN","Fayette", p1.getNome());
		       System.out.println(t1);
		    

	}

}
