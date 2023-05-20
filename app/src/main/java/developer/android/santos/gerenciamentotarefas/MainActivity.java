package developer.android.santos.gerenciamentotarefas;

import androidx.appcompat.app.AppCompatActivity;
import developer.android.santos.gerenciamentotarefas.model.Gerenciamento;
import static developer.android.santos.gerenciamentotarefas.R.layout.activity_main;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Gerenciamento tarefas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tarefas = new Gerenciamento();

        tarefas.setNomeTarefa("Organizar arquivos Curso Senac");
        tarefas.setDescTarefa("Subir arquivos do Curso Senac para o GitHub realizando o commit");
    }
}