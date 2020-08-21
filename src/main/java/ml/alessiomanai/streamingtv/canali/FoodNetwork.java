package ml.alessiomanai.streamingtv.canali;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import ml.alessiomanai.streamingtv.R;
import ml.alessiomanai.streamingtv.utils.WebViewSettings;

public class FoodNetwork extends AppCompatActivity {

    String URL = "https://it.dplay.com/food-network/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_network);

        WebView finestra = findViewById(R.id.foodnetwork);

        WebViewSettings.doSettings(finestra);
        finestra.setWebViewClient(new WebViewClient(){
              @Override
              public void onPageFinished(WebView view, String url)
              {
                  view.loadUrl("javascript:(function() { " +
                          "document.getElementsByClassName('e-cookies')[0].style.display='none'; " +
                          "})()");
              }
        });

        finestra.loadUrl(this.URL);

    }
}
