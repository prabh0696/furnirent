package co.furnirent.hp.furnirent;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link chairs.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link chairs#newInstance} factory method to
 * create an instance of this fragment.
 */
public class chairs extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    TextView textchair1,textchair2;
    EditText editchair1,editchair2;
    Button btn1,btn2;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public chairs() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment chairs.
     */
    // TODO: Rename and change types and number of parameters
    public static chairs newInstance(String param1, String param2) {
        chairs fragment = new chairs();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View hid=inflater.inflate(R.layout.fragment_chairs,container,false);
        btn1=(Button) hid.findViewById(R.id.btn1);
        btn2=(Button) hid.findViewById(R.id.btn2);
        textchair1=(TextView) hid.findViewById(R.id.textchair1);
        textchair2=(TextView) hid.findViewById(R.id.textchair2);
        // Inflate the layout for this fragment
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=((EditText) hid.findViewById(R.id.editchair1)).getText().toString();
                int month=Integer.parseInt(a);
                int b=month*50;
                String total=Integer.toString(b);
                textchair1.setText(total +" $");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=((EditText) hid.findViewById(R.id.editchair2)).getText().toString();
                int month=Integer.parseInt(a);
                int b=month*70;
                String total=Integer.toString(b);
                textchair2.setText(total +" $");
            }
        });


        return hid;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
