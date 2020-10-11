package ml.alessiomanai.streamingtv.canali;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import ml.alessiomanai.streamingtv.R;
import ml.alessiomanai.streamingtv.utils.M3u8Reader;
import ml.alessiomanai.streamingtv.utils.WebViewSettings;

public class FoodNetwork extends AppCompatActivity {

    private String URL = "https://sbshdlu5-lh.akamaihd.net/i/sbshdl_6@1000854/master.m3u8?hdnts=st=1586086849~exp=1586173249~acl=/i/*~hmac=49ca8a624a617228910e6a0b491ab25e78ea7ab08c404c6800fc366e15a03146&mux_audio=true";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_network);

        WebView finestra = findViewById(R.id.foodnetwork);
        WebViewSettings.doSettings(finestra);
        finestra.setWebViewClient(new WebViewClient());

        String html = M3u8Reader.getHtmlReader(URL);
        finestra.loadData(html, "text/html", null);

    }
}
