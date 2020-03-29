package lunainc.com.mx.exampleexpos.ui.cuadrosdetexto.ejemplo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Patterns;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import lunainc.com.mx.exampleexpos.R;

public class EjemploCuadrosTextoActivity extends AppCompatActivity {



    @BindView(R.id.txtNombre)
    EditText et1;

    @BindView(R.id.txtContraseña)
    EditText et2;

    @BindView(R.id.txtCorreo)
    EditText et3;

    @BindView(R.id.txtTelefono)
    EditText et4;

    @BindView(R.id.txtFecha)
    EditText et5;


    @BindView(R.id.txtImprimir)
    TextView tv1;

    @BindView(R.id.btnAceptar)
    Button boton;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_cuadros_texto);
        ButterKnife.bind(this);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        myToolbar.setTitle(R.string.ct);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        events();

    }

    private void events() {

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {   // metodo enlazado al boton de la vista
                if(validarcorreo(et3)==true){
                    ImprimirDatos(tv1);       //Invoca el metodo ImprimirDatos

                }

            }
        });


    }


    // metodo el cual nos permite imprimir los datos en un textview
    @SuppressLint("SetTextI18n")
    public void ImprimirDatos(View view) {
        // Variables en donde se guardara el valor que el usuario pondra
        String nombre = et1.getText().toString();
        String Contraseña = et2.getText().toString();
        String correo = et3.getText().toString();
        String telefono = et4.getText().toString();
        String fecha = et5.getText().toString();
        // Validacion de campos verifica si las  cadenas estan vacias
        if (nombre.length()==0) {
            Toast.makeText(this, "DEBES INGRESAR UN NOMBRE", Toast.LENGTH_LONG).show();
        }
        if (Contraseña.length()==0) {
            Toast.makeText(this, "DEBES INGRESAR UNA CONTRASEÑA", Toast.LENGTH_LONG).show();
        }
        if (telefono.length()==0) {
            Toast.makeText(this, "DEBES INGRESAR UN TELEFONO", Toast.LENGTH_LONG).show();
        }
        if (fecha.length()==0) {
            Toast.makeText(this, "DEBES INGRESAR UNA FECHA", Toast.LENGTH_LONG).show();
        }
        //Validacion donde verifica si todos los campos estan llenos
        if (nombre.length() != 0 && Contraseña.length() != 0 && correo.length() != 0 && telefono.length() != 0 && fecha.length() != 0) {
            Toast.makeText(this, "REGISTRO EXITOSO", Toast.LENGTH_LONG).show();
            LimpiarDatosDeEntrada();   // metodo el cual limpia los datos

            // Impresion de datos
            tv1.setText(" NOMBRE: " + nombre + " \n " +
                    " CONTRASEÑA: " + Contraseña + " \n " +
                    " CORREO: " + correo + " \n " +
                    " TELEFONO: " + telefono + " \n " +
                    " FECHA: " + fecha);

        }

    }

    // metodo booleano en donde hacemos la validacion del correo
    private boolean validarcorreo(EditText email){
        String emailInput= email.getText().toString();
        if(!emailInput.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()){
            return true;
        }else{
            // Toast.makeText(this,"EMAIL INVALIDO",Toast.LENGTH_SHORT).show();
            email.setError("EMAIL INVALIDO");
            return false;

        }

    }
    // metodo el cual nos permite limpiar los datos de entrada
    public void LimpiarDatosDeEntrada(){
        et1.setText("");
        et2.setText("");
        et3.setText("");
        et4.setText("");
        et5.setText("");
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
