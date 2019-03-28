package fr.mathisca.tb9weatherwear;

import android.app.DownloadManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.wear.widget.WearableLinearLayoutManager;
import android.support.wear.widget.WearableRecyclerView;
import android.support.wearable.activity.WearableActivity;
import android.support.wearable.view.WearableListView;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends WearableActivity {


    private TextView title;
    private TextView temp;
    private TextView hum;
    private TextView pres;
    private TextView wind;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.title);
        temp = findViewById(R.id.temp);
        hum = findViewById(R.id.hum);
        pres = findViewById(R.id.pres);
        wind = findViewById(R.id.wind);


        setTitle("A04S");
        setTemp("23");
        setWind("0");
        setPres("1019");
        setHum("43");
    }

    private void setTemp(String val) {
        temp.setText("Température : " + val + "°C");
    }

    private void setTitle(String title) {
        this.title.setText("Station : " + title);
    }

    private void setHum(String val) {
        hum.setText("Humidité relative : " + val + "%");
    }

    private void setPres(String val) {
        pres.setText("Pression: " + val + " hPa");
    }

    private void setWind(String val) {
        wind.setText("Vitesse du vent : " + val + " km/h");
    }
}
