package ml.alessiomanai.streamingtv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ml.alessiomanai.streamingtv.canali.FoodNetwork;
import ml.alessiomanai.streamingtv.canali.TgrSardegna;
import ml.alessiomanai.streamingtv.canali.Videolina;

public class MainActivity extends AppCompatActivity {

    Button foodNetwork;
    Button tgrSardegna;
    Button videolina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foodNetwork = findViewById(R.id.foodnetworkButton);
        tgrSardegna = findViewById(R.id.tgrButton);
        videolina = findViewById(R.id.videolinaButton);

        foodNetwork.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent food = new Intent(getBaseContext(), FoodNetwork.class);

                //avvia la finestra corrispondente
                startActivity(food);

            }
        });

        tgrSardegna.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent tgr = new Intent(getBaseContext(), TgrSardegna.class);

                //avvia la finestra corrispondente
                startActivity(tgr);

            }
        });

        videolina.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent videolinaWeb = new Intent(getBaseContext(), Videolina.class);

                //avvia la finestra corrispondente
                startActivity(videolinaWeb);

            }
        });


    }
}
