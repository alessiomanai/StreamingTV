package ml.alessiomanai.streamingtv;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import ml.alessiomanai.streamingtv.connessione.ChannelUpdaterCallable;

public class MainActivity extends AppCompatActivity {

    Button foodNetwork;
    Button radioItaliaTv;
    Button videolina;
    Button canale5;
    Button tv8, senatoTV, cine34;
    Button italia1, r101, vh1, la7, la7d, rai2, rai3, raiNews24, sportitaliaMotori, skyTg24;
    Button topcrime, rai1, radioMonteCarlo, virginRadio, sanMarinoRtv, sanMarinoSport;
    Button giallo, superTv, kisskiss, m2o, deejay, canale10, gold7, sardegnaUno, retesoleLazio;
    Button rete4, mediasetExtra, mediaset20, italia2, la5, motorTrend, realTime, sportitalia, dMax, nove;
    Button iris, cielo, boing, cartoonito, paramountChannel, spyke, tgcom24, italia7;

    final String JSON_URL = "url";
    private ArrayList<JSONObject> finalListaCanali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        paramountChannel = findViewById(R.id.paramountChannelbutton);
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
        sportitaliaMotori = findViewById(R.id.sportitaliaMotoributton);
        sportitalia = findViewById(R.id.sportItaliaButton);
        skyTg24 = findViewById(R.id.skytg24Button);
        senatoTV = findViewById(R.id.senatoTVButton);
        cine34 = findViewById(R.id.cine34Button);

        finalListaCanali = caricaCanali();

        if(finalListaCanali == null || finalListaCanali.isEmpty()){
            noInternet(this);
        }
        
        rai1.setOnClickListener(arg0 -> {

            try {
                startChannel(finalListaCanali.get(0).getString(JSON_URL));
            } catch (JSONException e) {
                e.printStackTrace();
            }

        });

        rai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(1).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        rai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(2).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        tgcom24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(3).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        foodNetwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(4).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        videolina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(5).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        canale5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(6).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(7).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });


        italia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(8).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        topcrime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(9).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        giallo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(10).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        rete4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(11).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        mediasetExtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(12).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        mediaset20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(13).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        italia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(14).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        la5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(15).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        motorTrend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(16).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        realTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(17).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });


        dMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(18).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        nove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(19).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        paramountChannel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(20).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        boing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(21).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        });

        cartoonito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(22).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        spyke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(23).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        iris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(24).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        cielo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(25).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });


        radioItaliaTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(26).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });


        superTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(27).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        kisskiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(28).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        m2o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(29).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        deejay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(30).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        italia7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(31).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        canale10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(32).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        gold7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(33).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        radioMonteCarlo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(34).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        virginRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(35).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        sanMarinoRtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(36).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        sanMarinoSport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(37).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        sardegnaUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(38).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        retesoleLazio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(39).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        r101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(40).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        vh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(41).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        la7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(42).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        la7d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(43).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });


        raiNews24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(44).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        sportitaliaMotori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(45).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        sportitalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(46).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        skyTg24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(47).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        cine34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(48).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

        senatoTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                try {
                    startChannel(finalListaCanali.get(49).getString(JSON_URL));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });
    }

    private void startChannel(String url){
        Intent intent = new Intent(getBaseContext(), ChannelExoPlayer.class);
        intent.putExtra("URL", url);
        startActivity(intent);
    }

    private void noInternet(Context context){
        new AlertDialog.Builder(context)
                .setTitle("Nessuna connessione internet")
                .setMessage("Non è stato possibile scaricare la lista dei canali aggiornata")

                .setNegativeButton("Ricarica", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finalListaCanali = caricaCanali();
                    }
                })

                .setPositiveButton(android.R.string.ok, null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    private ArrayList<JSONObject> caricaCanali(){

        try {
            ExecutorService executor = Executors.newFixedThreadPool(2);
            Future<ArrayList<JSONObject>> process = executor.submit(new ChannelUpdaterCallable());
            return process.get();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }
}
