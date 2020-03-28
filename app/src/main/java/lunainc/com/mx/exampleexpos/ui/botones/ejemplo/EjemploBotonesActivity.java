package lunainc.com.mx.exampleexpos.ui.botones.ejemplo;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import lunainc.com.mx.exampleexpos.R;

public class EjemploBotonesActivity extends AppCompatActivity {


    private Button boton;
    private ImageButton imgButton;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private ToggleButton toggleButton1;
    private ToggleButton toggleButton2;
    private SwitchCompat switchCompat;
    private FloatingActionButton floatingActionButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_botones);
        initViews();
    }



    public void initViews(){

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        myToolbar.setTitle(R.string.btn);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        boton = (Button) findViewById(R.id.buttonSimple1);
        imgButton = (ImageButton) findViewById(R.id.imgButton);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);
        toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);
        switchCompat = (SwitchCompat) findViewById(R.id.switch1);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.floatBtn);


    }


    @Override
    protected void onStart() {
        super.onStart();
        eventos();
    }




    public void eventos(){


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EjemploBotonesActivity.this, "Boton simple 1", Toast.LENGTH_SHORT).show();
            }
        });

        boton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                Toast.makeText(EjemploBotonesActivity.this, "Boton simple 1 - click largo", Toast.LENGTH_SHORT).show();

                return false;
            }
        });



        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EjemploBotonesActivity.this, "Boton imagenButton", Toast.LENGTH_SHORT).show();
            }
        });

        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkBox1.isChecked()){
                    Toast.makeText(EjemploBotonesActivity.this, "Seleccionaste CheckBox 1", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(EjemploBotonesActivity.this, "Deseleccionaste CheckBox 1", Toast.LENGTH_SHORT).show();

                }

            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkBox1.isChecked()){
                    Toast.makeText(EjemploBotonesActivity.this, "Seleccionaste CheckBox 2", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(EjemploBotonesActivity.this, "Deseleccionaste CheckBox 2", Toast.LENGTH_SHORT).show();

                }
            }
        });

        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EjemploBotonesActivity.this, "Radio Button 1", Toast.LENGTH_SHORT).show();
            }
        });

        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EjemploBotonesActivity.this, "Radio Button 2", Toast.LENGTH_SHORT).show();
            }
        });

        radioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EjemploBotonesActivity.this, "Radio Button 3", Toast.LENGTH_SHORT).show();
            }
        });

        toggleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (toggleButton1.isChecked()){
                    Toast.makeText(EjemploBotonesActivity.this, "Toggle button Activado", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(EjemploBotonesActivity.this, "Toggle button desactivado", Toast.LENGTH_SHORT).show();

                }



            }
        });

        toggleButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButton1.isChecked()){
                    Toast.makeText(EjemploBotonesActivity.this, "Toggle button 2 Activado", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(EjemploBotonesActivity.this, "Toggle button 2 desactivado", Toast.LENGTH_SHORT).show();

                }
            }
        });

        switchCompat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (switchCompat.isChecked()){
                    Toast.makeText(EjemploBotonesActivity.this, "Seleccionado", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(EjemploBotonesActivity.this, "No Seleccionado", Toast.LENGTH_SHORT).show();
                }

            }
        });

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EjemploBotonesActivity.this, "Floating Action Button", Toast.LENGTH_SHORT).show();
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
