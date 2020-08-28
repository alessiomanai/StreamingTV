package ml.alessiomanai.streamingtv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ml.alessiomanai.streamingtv.canali.Canale5;
import ml.alessiomanai.streamingtv.canali.FoodNetwork;
import ml.alessiomanai.streamingtv.canali.RsiLa1;
import ml.alessiomanai.streamingtv.canali.RsiLa2;
import ml.alessiomanai.streamingtv.canali.TgrSardegna;
import ml.alessiomanai.streamingtv.canali.Tv8;
import ml.alessiomanai.streamingtv.canali.Videolina;

public class MainActivity extends AppCompatActivity {

    Button foodNetwork;
    Button tgrSardegna;
    Button videolina;
    Button canale5;
    Button rsiLa1;
    Button rsiLa2;
    Button tv8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foodNetwork = findViewById(R.id.foodnetworkButton);
        tgrSardegna = findViewById(R.id.tgrButton);
        videolina = findViewById(R.id.videolinaButton);
        canale5 = findViewById(R.id.canale5button);
        rsiLa1 = findViewById(R.id.rsila1button);
        rsiLa2 = findViewById(R.id.rsila2button);
        tv8 = findViewById(R.id.tv8button);

        foodNetwork.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent food = new Intent(getBaseContext(), FoodNetwork.class);
                startActivity(food);

            }
        });

        tgrSardegna.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent tgr = new Intent(getBaseContext(), TgrSardegna.class);
                startActivity(tgr);

            }
        });

        videolina.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent videolinaWeb = new Intent(getBaseContext(), Videolina.class);
                startActivity(videolinaWeb);

            }
        });

        canale5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent canale5Web = new Intent(getBaseContext(), Canale5.class);
                startActivity(canale5Web);

            }
        });

        rsiLa1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent rsiLa1web = new Intent(getBaseContext(), RsiLa1.class);
                startActivity(rsiLa1web);

            }
        });

        rsiLa2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent rsiLa2web = new Intent(getBaseContext(), RsiLa2.class);
                startActivity(rsiLa2web);

            }
        });

        tv8.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent tv8web = new Intent(getBaseContext(), Tv8.class);
                startActivity(tv8web);

            }
        });

    }
}
