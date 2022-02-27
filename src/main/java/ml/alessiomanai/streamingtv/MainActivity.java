package ml.alessiomanai.streamingtv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ml.alessiomanai.streamingtv.canali.ChannelInterface;

public class MainActivity extends AppCompatActivity {

    Button foodNetwork;
    Button radioItaliaTv;
    Button videolina;
    Button canale5;
    Button tv8, senatoTV, cine34;
    Button italia1, r101, vh1, la7, la7d, rai2, rai3, raiSport, sportitaliaMotori, skyTg24;
    Button topcrime, rai1, radioMonteCarlo, virginRadio, sanMarinoRtv, sanMarinoSport;
    Button giallo, superTv, kisskiss, m2o, deejay, canale10, gold7, sardegnaUno, retesoleLazio;
    Button rete4, mediasetExtra, mediaset20, italia2, la5, motorTrend, realTime, sportitalia, dMax, nove;
    Button iris, cielo, boing, cartoonito, paramountChannel, spyke, tgcom24, italia7;

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
        raiSport = findViewById(R.id.raiSportbutton);
        sportitaliaMotori = findViewById(R.id.sportitaliaMotoributton);
        sportitalia = findViewById(R.id.sportItaliaButton);
        skyTg24 = findViewById(R.id.skytg24Button);
        senatoTV = findViewById(R.id.senatoTVButton);
        cine34 = findViewById(R.id.cine34Button);


        rai1.setOnClickListener(arg0 -> {

            Intent food = new Intent(getBaseContext(), ChannelInterface.class);
            food.putExtra("URL", "http://ott-cdn.ucom.am:80/s29/04.m3u8");
            startActivity(food);

        });

        rai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent food = new Intent(getBaseContext(), ChannelInterface.class);
                food.putExtra("URL", "https://live2.msf.cdn.mediaset.net/content/hls_h0_clr_vos/live/channel(b6)/index.m3u8");
                startActivity(food);

            }
        });

        rai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent food = new Intent(getBaseContext(), ChannelInterface.class);
                food.putExtra("URL", "https://streamcdnb11-8e7439fdb1694c8da3a0fd63e4dda518.msvdn.net/raitre1/hls/playlist_ma.m3u8?baseuri=%2Fraitre1%2Fhls%2F&tstart=0&tend=1636896833&tof=86400&tk2=488fefa68296673b2564ef73fdcff8198ffe38b417e7e9f13386c20cc6ae5e6e");
                startActivity(food);

            }
        });

        tgcom24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent food = new Intent(getBaseContext(), ChannelInterface.class);
                food.putExtra("URL", "https://live2.msf.cdn.mediaset.net/content/hls_h0_clr_vos/live/channel(kf)/index.m3u8");
                startActivity(food);

            }
        });

        foodNetwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent food = new Intent(getBaseContext(), ChannelInterface.class);
                food.putExtra("URL", "https://sbshdlu5-lh.akamaihd.net/i/sbshdl_6@1000854/master.m3u8?hdnts=st=1586086849~exp=1586173249~acl=/i/*~hmac=49ca8a624a617228910e6a0b491ab25e78ea7ab08c404c6800fc366e15a03146&mux_audio=true");
                startActivity(food);

            }
        });

        videolina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent videolinaWeb = new Intent(getBaseContext(), ChannelInterface.class);
                videolinaWeb.putExtra("URL", "http://livestreaming.videolina.it/live/Videolina/chunklist_w1548194757.m3u8");
                startActivity(videolinaWeb);

            }
        });

        canale5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                String url = "https://live2.msf.cdn.mediaset.net/content/hls_h0_clr_vos/live/channel(c5)/index.m3u8";
                Intent canale5Web = new Intent(getBaseContext(), ChannelInterface.class);
                canale5Web.putExtra("URL", url);
                startActivity(canale5Web);

            }
        });

        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://www.mytivu.it/Application/Channels/TV8.php");
                startActivity(intent);

            }
        });


        italia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live2.msf.cdn.mediaset.net/content/hls_h0_clr_vos/live/channel(i1)/index.m3u8");
                startActivity(intent);

            }
        });

        topcrime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live2.msf.cdn.mediaset.net/content/hls_h0_clr_vos/live/channel(lt)/index.m3u8");
                startActivity(intent);

            }
        });

        giallo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://sbshdlu5-lh.akamaihd.net/i/sbshdl_2@810996/master.m3u8?hdnts=st=1564227924~exp=1564314324~acl=/*~hmac=98bf7f8b6e1d65254efde4c3350f77d0e01d778d5e86abffd3ff244df230faad&mux_audio=true");
                startActivity(intent);

            }
        });

        rete4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent rete4web = new Intent(getBaseContext(), ChannelInterface.class);
                rete4web.putExtra("URL","https://live2.msf.cdn.mediaset.net/content/hls_h0_clr_vos/live/channel(r4)/index.m3u8");
                startActivity(rete4web);

            }
        });

        mediasetExtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live2.msf.cdn.mediaset.net/content/hls_h0_clr_vos/live/channel(kq)/index.m3u8");
                startActivity(intent);

            }
        });

        mediaset20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live2.msf.cdn.mediaset.net/content/hls_h0_clr_vos/live/channel(lb)/index.m3u8");
                startActivity(intent);

            }
        });

        italia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live2.msf.cdn.mediaset.net/content/hls_h0_clr_vos/live/channel(i2)/index.m3u8");
                startActivity(intent);

            }
        });

        la5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live2.msf.cdn.mediaset.net/content/hls_h0_clr_vos/live/channel(ka)/index.m3u8");
                startActivity(intent);

            }
        });

        motorTrend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://sbshdlu5-lh.akamaihd.net/i/sbshdl_1@810993/master.m3u8?hdnts=st=1559845194~exp=1559931594~acl=/*~hmac=877e074ac091df4a9d3406b63474da090678d4eef65c21489d443b94d4de7087&mux_audio=true");
                startActivity(intent);

            }
        });

        realTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://sbshdlu5-lh.akamaihd.net/i/sbshdl_4@810998/master.m3u8?hdnts=st=1564228002~exp=1564314402~acl=/*~hmac=6c0b77c0af71417fd823ef483a0d15c72e267308b83fdcb0e1b2228dba9dd703&mux_audio=true");
                startActivity(intent);

            }
        });


        dMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://sbshdlu5-lh.akamaihd.net/i/sbshdl_5@825063/master.m3u8");
                startActivity(intent);

            }
        });

        nove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://sbshdlu5-lh.akamaihd.net/i/sbshdl_3@810997/master.m3u8?hdnts=st=1585746893~exp=1585833293~acl=/i/*~hmac=7aa28aab591fe6ddf8d0480b4f202d3536f6f5b26dedf9d944c35b6320950ca4&mux_audio=true");
                startActivity(intent);

            }
        });

        paramountChannel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","http://viacomitalytest-lh.akamaihd.net/i/sbshdlive_1@195657/index_2500_av-p.m3u8");
                startActivity(intent);

            }
        });

        boing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live2.msf.cdn.mediaset.net/content/hls_h0_clr_vos/live/channel(kb)/index.m3u8");
                startActivity(intent);

            }
        });

        cartoonito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live2.msf.cdn.mediaset.net/content/hls_h0_clr_vos/live/channel(la)/index.m3u8");
                startActivity(intent);

            }
        });

        spyke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://viacomitalytest-lh.akamaihd.net/i/sbshdlive_1@829515/master.m3u8");
                startActivity(intent);

            }
        });

        iris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live2.msf.cdn.mediaset.net/content/hls_h0_clr_vos/live/channel(ki)/index.m3u8");
                startActivity(intent);

            }
        });

        cielo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://www.mytivu.it/Application/Channels/Cielo.php");
                startActivity(intent);

            }
        });


        radioItaliaTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent radioitaliaWeb = new Intent(getBaseContext(), ChannelInterface.class);
                radioitaliaWeb.putExtra("URL", "http://radioitaliatv-lh.akamaihd.net/i/radioitaliatv_1@329645/index_384x256_av-p.m3u8?sd=10&rebase=on");
                startActivity(radioitaliaWeb);

            }
        });


        superTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "https://viacomitalytest-lh.akamaihd.net/i/sbshdlive_1@357018/index_800_av-p.m3u8");
                startActivity(intent);

            }
        });

        kisskiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "http://wma05.fluidstream.net/KissKissTV/KissKissTV.stream/chunklist_w573387836.m3u8");
                startActivity(intent);

            }
        });

        m2o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "http://m2otv-lh.akamaihd.net/i/m2oTv_1@186074/index_600_av-b.m3u8");
                startActivity(intent);

            }
        });

        deejay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "https://deejay-tv-lh.akamaized.net/i/DeejayTv_1@129866/master.m3u8");
                startActivity(intent);

            }
        });

        italia7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "http://151.0.207.99:1935/italia7/italia7/playlist.m3u8");
                startActivity(intent);

            }
        });

        canale10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "http://37.187.142.147:1935/ch10live/high.stream/chunklist_w543110031.m3u8");
                startActivity(intent);

            }
        });

        gold7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "https://stream2.xdevel.com/video0s86-21/stream/playlist_dvr.m3u8");
                startActivity(intent);

            }
        });

        radioMonteCarlo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "https://live3-radio-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(bb)/index.m3u8");
                startActivity(intent);

            }
        });

        virginRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "https://live2-radio-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(ew)/index.m3u8");
                startActivity(intent);

            }
        });

        sanMarinoRtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "https://d2hrvno5bw6tg2.cloudfront.net/smrtv-ch01/_definst_/smil:ch-01.smil/chunklist_b1692000_slita.m3u8");
                startActivity(intent);

            }
        });

        sanMarinoSport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "https://d2hrvno5bw6tg2.cloudfront.net/smrtv-ch02/_definst_/smil:ch-02.smil/chunklist_b542000_slita_t64TUQoMzYwcCk=.m3u8");
                startActivity(intent);

            }
        });

        sardegnaUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "https://59d7d6f47d7fc.streamlock.net/sardegnauno/sardegnauno/playlist.m3u8");
                startActivity(intent);

            }
        });

        retesoleLazio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "http://5c389faa13be3.streamlock.net:1935/8058/8058/playlist.m3u8");
                startActivity(intent);

            }
        });

        r101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "https://live2.msf.cdn.mediaset.net/content/hls_h0_clr_vos/live/channel(er)/index.m3u8");
                startActivity(intent);

            }
        });

        vh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "https://content.uplynk.com/channel/36953f5b6546464590d2fcd954bc89cf.m3u8");
                startActivity(intent);

            }
        });

        la7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "https://d15umi5iaezxgx.cloudfront.net/LA7/CLN/HLS-B/Live_1280x720_.m3u8");
                startActivity(intent);

            }
        });

        la7d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "https://d15umi5iaezxgx.cloudfront.net/LA7D/CLN/HLS-B/Live.m3u8");
                startActivity(intent);

            }
        });


        raiSport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "https://raisportdue1-live.akamaized.net/hls/live/598322/raisportdue1/raisportdue1/playlist.m3u8?hdnea=st=1636897185~exp=1636897335~acl=/*~hmac=3e1c9a77bf9ad4fcbf664a72ced7b45215b2b25fa7cd225a0774358c95cc711f");
                startActivity(intent);

            }
        });

        sportitaliaMotori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "https://di-l1o0e8cu.vo.lswcdn.net/sportitalia/smil:simotori.smil/playlist.m3u8");
                startActivity(intent);

            }
        });

        sportitalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "https://di-kzbhv8pw.vo.lswcdn.net/sportitalia/sihd_480p/chunklist.m3u8");
                startActivity(intent);

            }
        });

        skyTg24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL", "https://www.mytivu.it/Application/Channels/SkyTG24.php");
                startActivity(intent);

            }
        });

        cine34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent food = new Intent(getBaseContext(), ChannelInterface.class);
                food.putExtra("URL", "https://live2.msf.cdn.mediaset.net/content/hls_h0_clr_vos/live/channel(b6)/index.m3u8");
                startActivity(food);

            }
        });

        senatoTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent food = new Intent(getBaseContext(), ChannelInterface.class);
                food.putExtra("URL", "https://senato-live.morescreens.com/SENATO_1_001/playlist.m3u8?video_id=13440&uuid=&channel_name=senato_webtv1&detected_delivery_method=hls");
                startActivity(food);

            }
        });
    }
}
