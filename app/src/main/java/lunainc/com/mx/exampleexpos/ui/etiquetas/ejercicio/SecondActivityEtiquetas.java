package lunainc.com.mx.exampleexpos.ui.etiquetas.ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import lunainc.com.mx.exampleexpos.R;

public class SecondActivityEtiquetas extends AppCompatActivity {

    @BindView(R.id.txtUsername)
    TextView txtUsername;

    @BindView(R.id.txtPass)
    TextView txtPass;


    String username = "";
    String password = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_etiquetas);

        username = getIntent().getStringExtra("user");
        password = getIntent().getStringExtra("pass");


        ButterKnife.bind(this);

        setData();
    }


    public void setData(){
        txtUsername.setText(username);
        txtPass.setText(password);


    }


}
