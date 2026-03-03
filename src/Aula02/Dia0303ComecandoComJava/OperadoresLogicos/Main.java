package Aula02.Dia0303ComecandoComJava.OperadoresLogicos;

public class Main {
    public static void main(String[] args) {
        // Operadores lógicos em Java
        // && (AND) - retorna true se ambos os operandos forem verdadeiros
        // || (OR) - retorna true se pelo menos um dos operandos for verdadeiro
        // ! (NOT) - inverte o valor lógico do operando

        boolean alunoMatriculado = true;
        boolean cadastradoNaDisciplinaDePOO = true;

        if (alunoMatriculado && cadastradoNaDisciplinaDePOO) {
            System.out.println("O aluno pode assistir as aulas de POO!");
        } else {
            System.out.println("O aluno não pode assistir as aulas de POO!");
        }
    }
}
