package ml.alessiomanai.streamingtv.canali;

import android.os.Bundle;

import ml.alessiomanai.streamingtv.ChannelExoPlayer;
import ml.alessiomanai.streamingtv.connessione.UnsecureHandshake;

public class UnsecureChannelPlayer extends ChannelExoPlayer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //workaround
        UnsecureHandshake.handleSSLHandshake();

        super.onCreate(savedInstanceState);

    }
}
