package devandroid.kaio.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.kaio.applistacurso.R;
import devandroid.kaio.applistacurso.model.Pessoa;
import devandroid.kaio.applistacurso.model.Escola;
public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Escola escola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        escola = new Escola();


    }
}