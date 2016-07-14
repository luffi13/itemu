package luffi.com.itemu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Luffi on 06/07/2016.
 */
public class AdapterListPemberitahuan extends ArrayAdapter<String > {

    private Context context;
    private View view;
    private int resource;


    private String[]name ;
    private Integer[] imageID={R.drawable.dompet,
            R.drawable.handphone,
            R.drawable.kunci};

    public AdapterListPemberitahuan(Context context, int resource, String[] nama) {
        super(context, resource, nama);
        this.context = context;
        this.resource= resource;
        this.name=nama;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(resource, parent, false);

        TextView perespon =(TextView)view.findViewById(R.id.namaPerespon);
        perespon.setText(name[position]);

        ImageView gambarBarang = (ImageView)view.findViewById(R.id.gambarBeritaDirespon);

        gambarBarang.setImageResource(imageID[position]);

        gambarBarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pemberitahuan = new Intent(context,PemberitahuanKehilangan.class);
                context.startActivity(pemberitahuan);
            }
        });

        return view;
    }
}
