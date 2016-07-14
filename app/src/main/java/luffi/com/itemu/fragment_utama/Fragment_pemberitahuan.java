package luffi.com.itemu.fragment_utama;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import luffi.com.itemu.AdapterListPemberitahuan;
import luffi.com.itemu.CustomList;
import luffi.com.itemu.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment_pemberitahuan.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment_pemberitahuan#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_pemberitahuan extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters


    private View view;
    private ListView list;
    String [] nama = {"Luffi aditya sandy","Ridho perdana", "Riska Adhita"};


    public Fragment_pemberitahuan() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_pemberitahuan.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_pemberitahuan newInstance() {
        Fragment_pemberitahuan fragment = new Fragment_pemberitahuan();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_fragment_pemberitahuan,container,false);


        AdapterListPemberitahuan listAdapter= new AdapterListPemberitahuan(getActivity(),R.layout.item_pemberitahuan,nama);
        list = (ListView)view.findViewById(R.id.listPemberitahuan);
        list.setAdapter(listAdapter);
        // Inflate the layout for this fragment
        return view;
    }


}
