package ml.alessiomanai.streamingtv.canali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import ml.alessiomanai.streamingtv.R;
import ml.alessiomanai.streamingtv.utils.M3u8Reader;
import ml.alessiomanai.streamingtv.utils.WebViewSettings;

public class Giallo extends AppCompatActivity {

    private String URL = "https://sbshdlu5-lh.akamaihd.net/i/sbshdl_2@810996/master.m3u8?hdnts=st=1564227924~exp=1564314324~acl=/*~hmac=98bf7f8b6e1d65254efde4c3350f77d0e01d778d5e86abffd3ff244df230faad&mux_audio=true";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giallo);

        WebView finestra = findViewById(R.id.giallo);

        WebViewSettings.doSettings(finestra);
        finestra.setWebViewClient(new WebViewClient());

        String html = M3u8Reader.getHtmlReader(URL);
        finestra.loadData(html, "text/html", null);
    }
}