package Pessoas;

public class Teste {
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Olivia");
		System.out.println(aluno.getNome());
		
		Aluno aluno2 = new Aluno("Emilia");
		System.out.println(aluno2.getNome());
		
		Aluno aluno3 = new Aluno("Alice");
		System.out.println(aluno3.getNome());
	}
	
}
