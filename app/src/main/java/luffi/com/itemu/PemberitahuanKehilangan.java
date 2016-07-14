package luffi.com.itemu;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import luffi.com.itemu.R;

public class PemberitahuanKehilangan extends AppCompatActivity {

    private ListView listView;
    private String[] nama = {"Ridho perdana","Luffi aditya","Riska adhita"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pemberitahuan_kehilangan);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AdapterListResponKehilangan adapter = new AdapterListResponKehilangan(this, R.layout.item_respon_kehilangan,nama);
        listView = (ListView)findViewById(R.id.listRespon);
        listView.setAdapter(adapter);



    }

}
