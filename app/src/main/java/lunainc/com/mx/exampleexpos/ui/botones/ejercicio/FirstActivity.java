package lunainc.com.mx.exampleexpos.ui.botones.ejercicio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import lunainc.com.mx.exampleexpos.R;

public class FirstActivity extends AppCompatActivity {


    @BindView(R.id.btnNext)
    Button btnNext;

    @BindView(R.id.rbNextWindow)
    RadioButton rbNext;

    @BindView(R.id.rbMsg1)
    RadioButton rmMsg1;

    @BindView(R.id.rbMsg2)
    RadioButton rmMsg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        ButterKnife.bind(this);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        myToolbar.setTitle(R.string.btn);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        events();
    }


    public void events(){
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comprobarRadioButton();
            }
        });
    }



    public void comprobarRadioButton(){
        if (rbNext.isChecked()){
            final String text = "Siguiente ventana";
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
            Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
            startActivity(intent);
            //finish();
        }

        if (rmMsg1.isChecked()){
            final String text = " Bienvenido al ejercicio de botones";
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        }

        if (rmMsg2.isChecked()){
            final String text = " Selecciona la primera opcion para pasar a la siguiente ventana";
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        }
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
