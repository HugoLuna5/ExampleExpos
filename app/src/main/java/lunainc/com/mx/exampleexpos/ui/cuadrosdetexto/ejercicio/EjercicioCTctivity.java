package lunainc.com.mx.exampleexpos.ui.cuadrosdetexto.ejercicio;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Patterns;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import lunainc.com.mx.exampleexpos.R;

public class EjercicioCTctivity extends AppCompatActivity {


    @BindView(R.id.id_pass)
    EditText edt_pass;

    @BindView(R.id.id_pass2)
    EditText edt_veriPass;

    @BindView(R.id.id_usr)
    EditText user;

    @BindView(R.id.id_mail)
    EditText edt_Email;

    @BindView(R.id.id_ok)
    Button btnOk;


    private String email;
    private String username;
    private String password;
    private String password_verified;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_c_tctivity);

        ButterKnife.bind(this);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        myToolbar.setTitle(R.string.btn);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        event();
    }

    private void event() {
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validateData()&&validateEmail() ){
                    showMessageAlert();
                };
            }
        });
    }


    public boolean validateData(){
        username=user.getText().toString();//dando valor a la variable Nombre_user

        password= edt_pass.getText().toString();
        password_verified= edt_veriPass.getText().toString();
        if(username.isEmpty()){
            user.setError("Campo Obligatorio");
            return false;
        }else if(password.isEmpty()){
            edt_pass.setError("Ingrese una contraseña");
            return false;
        }else if(password_verified.isEmpty()){
            edt_veriPass.setError("Verifica Contraseña");
            return false;
        }if(!password.equals(password_verified)){
            Toast.makeText(this,"Las Contraseñas\n NO Coinsiden",Toast.LENGTH_LONG).show();
            return  false;
        }else{
            return true;
        }
    }



    private boolean validateEmail(){
        email=edt_Email.getText().toString().trim();
        if(email.isEmpty()){
            edt_Email.setError("Campo Obligatorio");
            return false;
        }else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            edt_Email.setError("Correo no valido");
            return false;
        }else{
            edt_Email.setError(null);
            return true;
        }
    }



    public void showMessageAlert(){
        AlertDialog.Builder alert=new AlertDialog.Builder(EjercicioCTctivity.this);//crea un alert Dialog
        alert.setMessage("Usuario: "+username+"\nEmail: "+email+"\nContraseña: "+password).setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
            }).setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog titulo=alert.create();
        titulo.setTitle("Tus datos son los siguientes");
        titulo.show();
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
