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

import luffi.com.itemu.CustomList;
import luffi.com.itemu.FormKehilangan;
import luffi.com.itemu.R;


public class Fragment_kehilangan extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ListView list;
    private View view;

    String [] nama = {"dompet","handphone", "kunci rumah","motor","tas","koper","mobil"};



    public Fragment_kehilangan() {
        // Required empty public constructor
    }
   public static Fragment_kehilangan newInstance() {
        Fragment_kehilangan fragment = new Fragment_kehilangan();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fragment_berita_utama,container,false);


        CustomList listAdapter= new CustomList(getActivity(),R.layout.item_berita,nama);
        list = (ListView)view.findViewById(R.id.listBaru);
        list.setAdapter(listAdapter);

        FloatingActionButton fab = (FloatingActionButton)view.findViewById(R.id.fab1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), FormKehilangan.class);
                startActivity(intent);
            }
        });
        return view;

    }

    // TODO: Rename method, update argument and hook method into UI event

}
