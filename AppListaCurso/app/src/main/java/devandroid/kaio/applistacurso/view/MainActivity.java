package devandroid.kaio.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.kaio.applistacurso.R;
import devandroid.kaio.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
       //Atribuir conteúdo,dados, valores para o Objeto
       //Conforme o seu MODELO, TEMPLATE

        pessoa.setPrimeiroNome("Kaio");
        pessoa.setSobreNome("Eduardo");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("21-99002-8922");
    }

}