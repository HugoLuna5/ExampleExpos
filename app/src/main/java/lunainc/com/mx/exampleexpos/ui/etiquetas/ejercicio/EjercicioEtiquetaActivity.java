package lunainc.com.mx.exampleexpos.ui.etiquetas.ejercicio;

import androidx.annotation.BinderThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import lunainc.com.mx.exampleexpos.R;

public class EjercicioEtiquetaActivity extends AppCompatActivity {


    @BindView(R.id.actionBtn)
    Button actionBtn;

    @BindView(R.id.username)
    EditText username;


    @BindView(R.id.password)
    EditText password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_etiqueta);

        ButterKnife.bind(this);


        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        myToolbar.setTitle(R.string.etiquetas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        events();
    }

    private void events() {

        actionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String use = username.getText().toString();
                String pass = password.getText().toString();


                if (use.trim().length() > 0 && pass.trim().length() > 0 ){

                    Intent intent = new Intent(EjercicioEtiquetaActivity.this, SecondActivityEtiquetas.class);
                    intent.putExtra("user", use);
                    intent.putExtra("pass", pass);
                    startActivity(intent);

                }
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        /**
         * handle home button pressed
         */
        if (id == android.R.id.home) {

            //Start your main activity here
            goToBack();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        goToBack();


    }


    public void goToBack(){
        finish();
    }



}
