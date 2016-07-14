package luffi.com.itemu;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Luffi on 30/06/2016.
 */
public class AdapterListDitemukan extends ArrayAdapter<String> {

    private Context context;
    private View view;
    private int resource;
    private Integer[] imageID={R.drawable.dompet,
            R.drawable.handphone,
            R.drawable.kunci,
            R.drawable.motor,
            R.drawable.tas,
            R.drawable.koper,
            R.drawable.mobil };


    private String[]name ;


    public AdapterListDitemukan(Context context, int resource, String[] nama) {
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
