import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		//registrar data de nascimento
		Calendar data=Calendar.getInstance();
		data.set(Calendar.YEAR,1995);
		data.set(Calendar.MONTH, Calendar.JUNE);
		data.set(Calendar.DAY_OF_MONTH,5);
		
		
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
