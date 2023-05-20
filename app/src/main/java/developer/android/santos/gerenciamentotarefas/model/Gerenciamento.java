package developer.android.santos.gerenciamentotarefas.model;

public class Gerenciamento {
    private String nomeTarefa;
    private String descTarefa;

    public Gerenciamento(){}

    public Gerenciamento(String nomeTarefa, String descTarefa) {
        this.nomeTarefa = nomeTarefa;
        this.descTarefa = descTarefa;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getDescTarefa() {
        return descTarefa;
    }

    public void setDescTarefa(String descTarefa) {
        this.descTarefa = descTarefa;
    }
}
