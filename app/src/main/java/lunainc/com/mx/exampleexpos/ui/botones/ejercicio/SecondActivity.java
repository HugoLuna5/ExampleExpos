package lunainc.com.mx.exampleexpos.ui.botones.ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import lunainc.com.mx.exampleexpos.R;

public class SecondActivity extends AppCompatActivity {


    @BindView(R.id.btnReturn)
    Button btnReturn;


    @BindView(R.id.txtInfo)
    TextView txtInfo;

    @BindView(R.id.switchinfo)
    Switch swInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        events();
    }

    private void events() {
        swInfo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    txtInfo.setText("ITSTA \n\nInfo de estudiante:\nHugo Dario Luna Cruz \nIng. en Sistemas Computacionales");
                } else {
                    // The toggle is disabled
                    txtInfo.setText("");
                }
            }
        });

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }


}
