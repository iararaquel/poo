package P_O_O.Lista em sala.Questao4;

public abstract class TarefaBase {
    protected boolean concluida = false;

    public void marcarConcluida() {
        concluida = true;
        System.out.println("Tarefa concluída!");
    }

    public boolean isConcluida() {
        return concluida;
    }
}