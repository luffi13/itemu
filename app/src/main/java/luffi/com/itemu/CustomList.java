package luffi.com.itemu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.test.ActivityInstrumentationTestCase2;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.concurrent.TimeoutException;

/**
 * Created by Luffi on 10/06/2016.
 */

public class CustomList extends ArrayAdapter<String> {

    private Context context;
    private View view;
    private int resource;


    private String[]name ;
    //"dompet","handphone", "kunci rumah","motor","tas","koper","mobil"};

    private Integer[] imageID={R.drawable.dompet,
                                R.drawable.handphone,
                                R.drawable.kunci,
                                R.drawable.motor,
                                R.drawable.tas,
                                R.drawable.koper,
                                R.drawable.mobil };


    public CustomList(Context context, int resource, String[] nama) {
        super(context, resource,nama);
        this.context = context;
        this.resource= resource;
        this.name=nama;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(resource, parent, false);

        TextView nama = (TextView)view.findViewById(R.id.name);
        TextView callNumber = (TextView)view.findViewById(R.id.callNumber);
        TextView deskripsi = (TextView)view.findViewById(R.id.description);
        ImageButton respon = (ImageButton)view.findViewById(R.id.responButton);
        ImageView gambarBarang = (ImageView)view.findViewById(R.id.image_berita);

        gambarBarang.setImageResource(imageID[position]);

        respon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent responIntent = new Intent(context,ResponKehilangan.class);
                context.startActivity(responIntent);
            }
        });

        callNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:08978526141"));
                context.startActivity(callIntent);
            }
        });

        deskripsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent responIntent = new Intent(context,ResponKehilangan.class);
                context.startActivity(responIntent);
            }
        });




        nama.setText(name[position]);
        return view;
    }
}
