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
    Button tv8;
    Button italia1;
    Button topcrime;
    Button giallo, superTv, kisskiss, m2o, deejay, canale10, gold7;
    Button rete4, mediasetExtra, mediaset20, italia2, la5, motorTrend, realTime, cielo, dMax, nove;
    Button iris, focus, boing, cartoonito, paramountChannel, spyke, cine34, k2, frisbee, italia7;

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
        focus = findViewById(R.id.focusbutton);
        boing = findViewById(R.id.boingbutton);
        cartoonito = findViewById(R.id.cartoonitobutton);
        paramountChannel = findViewById(R.id.paramountChannelbutton);
        spyke = findViewById(R.id.spikebutton);
        superTv = findViewById(R.id.superButton);
        deejay = findViewById(R.id.deejayButton);
        italia7 = findViewById(R.id.italia7Button);
        canale10 = findViewById(R.id.canale10Button);
        gold7 = findViewById(R.id.gold7Button);

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

                String url = "https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(c5)/index.m3u8";
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
                intent.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(i1)/index.m3u8");
                startActivity(intent);

            }
        });

        topcrime.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(lt)/index.m3u8");
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
                rete4web.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(r4)/index.m3u8");
                startActivity(rete4web);

            }
        });

        mediasetExtra.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(kq)/index.m3u8");
                startActivity(intent);

            }
        });

        mediaset20.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(lb)/index.m3u8");
                startActivity(intent);

            }
        });

        italia2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(i2)/index.m3u8");
                startActivity(intent);

            }
        });

        la5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(ka)/index.m3u8");
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
                intent.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(kb)/index.m3u8");
                startActivity(intent);

            }
        });

        cartoonito.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(la)/index.m3u8");
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
                intent.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(ki)/index.m3u8");
                startActivity(intent);

            }
        });

        focus.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(fu)/index.m3u8");
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
    }
}
