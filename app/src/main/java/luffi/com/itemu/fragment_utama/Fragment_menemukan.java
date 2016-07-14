package luffi.com.itemu.fragment_utama;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import luffi.com.itemu.AdapterListDitemukan;
import luffi.com.itemu.CustomList;
import luffi.com.itemu.FormKehilangan;
import luffi.com.itemu.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment_menemukan.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment_menemukan#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_menemukan extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters


    private String mParam1;
    private String mParam2;
    private ListView list;
    private View view;
    String [] nama = {"ditemukan 1","ditemukan 2", "ditemukan 3","ditemukan 4","ditemukan 5","ditemukan 6","ditemukan 7","ditemukan 8"};

    public Fragment_menemukan() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_menemukan.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_menemukan newInstance() {
        Fragment_menemukan fragment = new Fragment_menemukan();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fragment_menemukan,container,false);


        AdapterListDitemukan listAdapter= new AdapterListDitemukan(getActivity(),R.layout.item_berita,nama);

        list = (ListView)view.findViewById(R.id.listDitemukan);
        list.setAdapter(listAdapter);

        FloatingActionButton fab = (FloatingActionButton)view.findViewById(R.id.fab2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), FormKehilangan.class);
                startActivity(intent);
            }
        });
        return view;

    }

}
