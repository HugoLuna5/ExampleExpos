package lunainc.com.mx.exampleexpos.ui.botones;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import lunainc.com.mx.exampleexpos.R;
import lunainc.com.mx.exampleexpos.ui.botones.ejemplo.EjemploBotonesActivity;
import lunainc.com.mx.exampleexpos.ui.botones.ejercicio.FirstActivity;

public class BotonesFragment extends Fragment {

    private View root;

    @BindView(R.id.btnExample)
    Button btnEjemplo;

    @BindView(R.id.btnEje)
    Button btnEjercicio;




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, root);

        events();

        return root;
    }


    public void events(){

        btnEjemplo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), EjemploBotonesActivity.class);
                startActivity(intent);

            }
        });


        btnEjercicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), FirstActivity.class);
                startActivity(intent);

            }
        });

    }




}
