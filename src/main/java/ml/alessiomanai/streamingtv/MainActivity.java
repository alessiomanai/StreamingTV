package ml.alessiomanai.streamingtv;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import ml.alessiomanai.streamingtv.canali.UnsecureChannelPlayer;
import ml.alessiomanai.streamingtv.connessione.ChannelUpdaterCallable;
import ml.alessiomanai.streamingtv.connessione.CheckUpdatesCallable;
import ml.alessiomanai.streamingtv.utils.StreamingTVConstants;

public class MainActivity extends AppCompatActivity {

    final String JSON_URL = "url";
    Button foodNetwork;
    Button radioItaliaTv;
    Button videolina;
    Button canale5;
    Button tv8, senatoTV, cine34;
    Button italia1, r101, vh1, la7, la7d, rai2, rai3, raiNews24, raiSport, skyTg24;
    Button topcrime, rai1, radioMonteCarlo, virginRadio, sanMarinoRtv, sanMarinoSport;
    Button giallo, superTv, kisskiss, m2o, deejay, canale10, gold7, sardegnaUno, retesoleLazio;
    Button rete4, mediasetExtra, mediaset20, italia2, la5, motorTrend, realTime, sportitalia, dMax, nove;
    Button iris, cielo, boing, cartoonito, twentySeven, spyke, tgcom24, italia7, uno4, canaleItalia;
    private ArrayList<JSONObject> finalListaCanali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        foodNetwork = findViewById(R.id.foodnetworkButton);
        radioItaliaTv = findViewById(R.id.radioItaliaButton);
        videolina = findViewById(R.id.videolinaButton);
        canale5 = findViewById(R.id.canale5button);
        kisskiss = findViewById(R.id.kisskissButton);
        m2o = findViewById(R.id.m2oButton);
        tv8 = findViewById(R.id.tv8button);
        italia1 = findViewById(R.id.italia1button);
        topcrime = findViewById(R.id.topcrimebutton);
        giallo = findViewById(R.id.giallobutton);
        rete4 = findViewById(R.id.rete4button);
        mediasetExtra = findViewById(R.id.mediasetExtrabutton);
        mediaset20 = findViewById(R.id.mediaset20button);
        italia2 = findViewById(R.id.italia2button);
        la5 = findViewById(R.id.la5button);
        motorTrend = findViewById(R.id.motorTrendbutton);
        realTime = findViewById(R.id.realTimebutton);
        dMax = findViewById(R.id.dmaxButton);
        nove = findViewById(R.id.noveButton);
        iris = findViewById(R.id.irisbutton);
        cielo = findViewById(R.id.cielobutton);
        boing = findViewById(R.id.boingbutton);
        cartoonito = findViewById(R.id.cartoonitobutton);
        twentySeven = findViewById(R.id.twentySevenbutton);
        spyke = findViewById(R.id.spikebutton);
        superTv = findViewById(R.id.superButton);
        deejay = findViewById(R.id.deejayButton);
        italia7 = findViewById(R.id.italia7Button);
        canale10 = findViewById(R.id.canale10Button);
        gold7 = findViewById(R.id.gold7Button);
        rai1 = findViewById(R.id.rai1button);
        tgcom24 = findViewById(R.id.tgcom24button);
        virginRadio = findViewById(R.id.virginRadioButton);
        radioMonteCarlo = findViewById(R.id.radioMonteCarloButton);
        sanMarinoRtv = findViewById(R.id.sanMarinoRTVButton);
        sanMarinoSport = findViewById(R.id.sanMarinoSportButton);
        sardegnaUno = findViewById(R.id.sardegnaUnoButton);
        retesoleLazio = findViewById(R.id.reteSoleLazioButton);
        r101 = findViewById(R.id.r101Button);
        vh1 = findViewById(R.id.vh1Button);
        la7 = findViewById(R.id.la7button);
        la7d = findViewById(R.id.la7Dbutton);
        rai2 = findViewById(R.id.rai2button);
        rai3 = findViewById(R.id.rai3button);
        raiNews24 = findViewById(R.id.raiNews24button);
        raiSport = findViewById(R.id.raiSportbutton);
        sportitalia = findViewById(R.id.sportItaliaButton);
        skyTg24 = findViewById(R.id.skytg24Button);
        senatoTV = findViewById(R.id.senatoTVButton);
        cine34 = findViewById(R.id.cine34Button);
        uno4 = findViewById(R.id.uno4Button);
        canaleItalia = findViewById(R.id.canaleItaliaButton);

        finalListaCanali = caricaCanali();

        if (finalListaCanali == null || finalListaCanali.isEmpty()) {
            noInternet(this);
        }

        rai1.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(0).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        rai2.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(1).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        rai3.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(2).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        tgcom24.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(3).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        foodNetwork.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(4).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        videolina.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(5).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        canale5.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(6).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        tv8.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(7).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });


        italia1.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(8).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        topcrime.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(9).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        giallo.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(10).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        rete4.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(11).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        mediasetExtra.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(12).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }
        });

        mediaset20.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(13).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        italia2.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(14).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        la5.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(15).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }
        });

        motorTrend.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(16).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        realTime.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(17).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });


        dMax.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(18).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        nove.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(19).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        twentySeven.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(20).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        boing.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(21).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }


        });

        cartoonito.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(22).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        spyke.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(23).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }
        });

        iris.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(24).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        cielo.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(25).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });


        radioItaliaTv.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(26).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });


        superTv.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(27).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        kisskiss.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(28).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        m2o.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(29).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        deejay.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(30).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        italia7.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(31).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        canale10.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(32).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        gold7.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(33).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        radioMonteCarlo.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(34).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }
        });

        virginRadio.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(35).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        sanMarinoRtv.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(36).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        sanMarinoSport.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(37).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        sardegnaUno.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(38).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }
        });

        retesoleLazio.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(39).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        r101.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(40).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }
        });

        vh1.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(41).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        la7.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(42).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        la7d.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(43).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });


        raiNews24.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(44).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        raiSport.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(45).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        sportitalia.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(46).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        skyTg24.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(47).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        cine34.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(48).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        senatoTV.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(49).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        uno4.setOnClickListener(arg0 -> {

            try {
                startChannelUnsecure(finalListaCanali.get(50).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });

        canaleItalia.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(51).getString(JSON_URL));
            } catch (JSONException | IndexOutOfBoundsException e) {
                Log.e("Channel", "Errore durante l'avvio del canale");
            }

        });
    }

    private void startChannel(String url) {
        Intent intent = new Intent(getBaseContext(), ChannelExoPlayer.class);
        intent.putExtra("URL", url);
        startActivity(intent);
    }

    private void startChannelUnsecure(String url) {
        Intent intent = new Intent(getBaseContext(), UnsecureChannelPlayer.class);
        intent.putExtra("URL", url);
        startActivity(intent);
    }

    private void noInternet(Context context) {
        new AlertDialog.Builder(context)
                .setTitle("Nessuna connessione internet")
                .setMessage("Non è stato possibile scaricare la lista dei canali aggiornata")

                .setNegativeButton("Ricarica", (dialog, which) -> finalListaCanali = caricaCanali())

                .setPositiveButton(android.R.string.ok, null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    private void aggiornamentoApplicazione(Context context) {
        new AlertDialog.Builder(context)
                .setTitle("Nuova versione disponibile")
                .setMessage("Alla pagina dello sviluppatore è disponibile una versione aggiornata dell'applicazione")

                .setNegativeButton("Scarica", (dialog, which) -> {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(StreamingTVConstants.LATEST_VERSION));
                    startActivity(intent);
                })

                .setPositiveButton(android.R.string.ok, null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    private ArrayList<JSONObject> caricaCanali() {

        try {
            ExecutorService executor = Executors.newFixedThreadPool(2);
            Future<ArrayList<JSONObject>> process = executor.submit(new ChannelUpdaterCallable());

            Future<Boolean> checkUpdateFuture = executor.submit(new CheckUpdatesCallable());

            if(checkUpdateFuture.get()){
                aggiornamentoApplicazione(this);
            }

            return process.get();
        } catch (ExecutionException | InterruptedException e) {
            Log.e("Parsing", "Errore durante il parsing del JSON");
        }

        return null;
    }
}
