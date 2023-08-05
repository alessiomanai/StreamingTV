package ml.alessiomanai.streamingtv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;


public class ChannelExoPlayer extends AppCompatActivity {

    private ExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channel_exo_player);

        Intent intent = getIntent();
        PlayerView playerView = findViewById(R.id.playerView);

        player = new ExoPlayer.Builder(this).build();
        playerView.setPlayer(player);

        MediaItem mediaItem = MediaItem.fromUri(intent.getStringExtra("URL"));

        play(mediaItem);

        player.addListener(new Player.Listener() {
            @Override
            public void onPlaybackStateChanged(int playbackState) {
                if (playbackState == Player.STATE_ENDED) {
                    stop();
                    play(mediaItem);
                }
            }

            @Override
            public void onPlayerError(PlaybackException error) {
                stop();
                play(mediaItem);
            }
        });

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        player.release();
    }

    void stop() {
        player.setPlayWhenReady(false);
        player.stop();
        player.seekTo(0);
    }

    void play(MediaItem mediaItem){
        player.setMediaItem(mediaItem);
        player.prepare();
        player.play();
        player.setPlayWhenReady(true);
    }
}