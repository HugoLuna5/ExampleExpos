package lunainc.com.mx.exampleexpos.ui.cuadrosdetexto;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import butterknife.BindView;
import butterknife.ButterKnife;
import lunainc.com.mx.exampleexpos.R;
import lunainc.com.mx.exampleexpos.ui.cuadrosdetexto.ejemplo.EjemploCuadrosTextoActivity;
import lunainc.com.mx.exampleexpos.ui.cuadrosdetexto.ejercicio.EjercicioCTctivity;
import lunainc.com.mx.exampleexpos.ui.etiquetas.ejemplos.EjemploEtiquetaActivity;
import lunainc.com.mx.exampleexpos.ui.etiquetas.ejercicio.EjercicioEtiquetaActivity;

public class CuadroTextoFragment extends Fragment {

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

                Intent intent = new Intent(getActivity(), EjemploCuadrosTextoActivity.class);
                startActivity(intent);

            }
        });


        btnEjercicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), EjercicioCTctivity.class);
                startActivity(intent);

            }
        });

    }


}
