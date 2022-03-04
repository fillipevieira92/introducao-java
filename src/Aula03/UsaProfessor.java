package Aula03;

public class UsaProfessor {
    
    public static void main(String[] args) {
        
        Professor fujioka = new Professor();
        fujioka.disciplina = "Linguagem de Programação";
        fujioka.nomeProfessor = "Fujioka";
        
        Professor marcelo = new Professor();
        marcelo.disciplina = "Coordenação";
        marcelo.nomeProfessor = "Marcelo";
        
        Professor messias = new Professor();
        messias.disciplina = "Banco de Dados";
        messias.nomeProfessor = "Messias";

        marcelo.ensinar();
        fujioka.ensinar();
        messias.ensinar();
    }
}
