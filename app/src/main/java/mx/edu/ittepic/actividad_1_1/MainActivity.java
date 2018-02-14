package mx.edu.ittepic.actividad_1_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mostrarTablas;
    private SeekBar seekBar;
    int numElegido,numMultiplicando,res;
    String num1;
    String [] arreglo = new String[21];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mostrarTablas = (TextView)findViewById(R.id.textView);
        // SeekBar
        seekBar = (SeekBar)findViewById(R.id.seekBar);
        // Valor Inicial
        seekBar.setProgress(0);
        // Valot Final
        seekBar.setMax(100);

        seekBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    //hace un llamado a la perilla cuando se arrastra
                    @Override
                    public void onProgressChanged(SeekBar seekBar,
                                                  int progress, boolean fromUser) {
                        for (int i=0;i<=20;i++) {

                            int num1Int= Integer.valueOf(String.valueOf(progress));
                            res = num1Int* i;
                            arreglo[i]=num1Int+" x "+i+" = "+res;}

                            mostrarTablas.setText(arreglo[0]+"\n"+arreglo[1]+"\n"+arreglo[2]+"\n"+arreglo[3]+"\n"+arreglo[4]+"\n"+arreglo[5]+
                                    "\n"+arreglo[6]+"\n"+arreglo[7]+"\n"+arreglo[8]+"\n"+arreglo[9]+"\n"+arreglo[10]+"\n"+arreglo[11]+"\n"+
                                                arreglo[12]+"\n"+arreglo[13]+"\n"+arreglo[14]+"\n"+arreglo[15]+"\n"+arreglo[16]+"\n"+arreglo[17]+"\n"+arreglo[18]+"\n"+
                                               arreglo[19]+"\n"+arreglo[20]);

                    }

                    //hace un llamado  cuando se toca la perilla
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    //hace un llamado  cuando se detiene la perilla
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                });
    }
}
