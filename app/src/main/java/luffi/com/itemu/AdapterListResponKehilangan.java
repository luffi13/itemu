package luffi.com.itemu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Luffi on 07/07/2016.
 */
public class AdapterListResponKehilangan extends ArrayAdapter<String> {

    private Context context;
    private View view;
    private int resource;
    private String[]name ;

    public AdapterListResponKehilangan(Context context, int resource, String[] nama) {
        super(context, resource, nama);
        this.context = context;
        this.resource= resource;
        this.name=nama;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(resource, parent, false);

        TextView perespon = (TextView)view.findViewById(R.id.peresponBerita);
        perespon.setText(name[position]);
        return view;
    }
}
