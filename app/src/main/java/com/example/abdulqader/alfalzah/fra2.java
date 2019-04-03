package com.example.abdulqader.alfalzah;

import android.app.DatePickerDialog;
import android.app.Fragment;
import android.app.TimePickerDialog;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.abdulqader.alfalzah.data.DatabaseImp;
import com.example.abdulqader.alfalzah.model.cars;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import fr.ganfra.materialspinner.MaterialSpinner;



public class fra2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Button time;
   @BindView(R.id.name)EditText name;
   @BindView(R.id.number)EditText no_of_seats;
   @BindView(R.id.in_time)EditText moving_time;
   @BindView(R.id.in_date)EditText moving_date;
   @BindView(R.id.charge)EditText charges;
   @BindView(R.id.contact)EditText contact;
   @BindView(R.id.from)MaterialSpinner from;
   @BindView(R.id.to)MaterialSpinner to_des;
   @BindView(R.id.add)Button add;
    private static final String DATABASENAME="Rilekdatabase";

    private DatabaseImp databaseImp;
    private int mYear, mMonth, mDay, mHour, mMinute;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        View view= inflater.inflate(R.layout.fragment_fra2, container, false);
        ButterKnife.bind(this,view);
        MaterialSpinner spinner = (MaterialSpinner) view.findViewById(R.id.from);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(view.getContext(),
                R.array.cities, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        MaterialSpinner to = (MaterialSpinner) view.findViewById(R.id.to);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(view.getContext(),
                R.array.cities, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        to.setAdapter(adapter2);

        final EditText intime=(EditText)view.findViewById(R.id.in_time);
        final EditText indate=(EditText)view.findViewById(R.id.in_date);

        indate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar c = Calendar.getInstance();
                mYear = c.get(Calendar.YEAR);
                mMonth = c.get(Calendar.MONTH);
                mDay = c.get(Calendar.DAY_OF_MONTH);


                DatePickerDialog datePickerDialog = new DatePickerDialog(view.getContext(),
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                indate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });
        intime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar c = Calendar.getInstance();
                mHour = c.get(Calendar.HOUR_OF_DAY);
                mMinute = c.get(Calendar.MINUTE);

                // Launch Time Picker Dialog
                TimePickerDialog timePickerDialog = new TimePickerDialog(view.getContext(),
                        new TimePickerDialog.OnTimeSetListener() {

                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay,
                                                  int minute) {

                                intime.setText(hourOfDay + ":" + minute);
                            }
                        }, mHour, mMinute, false);
                timePickerDialog.show();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cars new_car= new cars();
                new_car.setOwner(name.getText().toString());
                new_car.setNumber_of_passenger(no_of_seats.getText().toString());
                new_car.setDate(moving_date.getText().toString());
                new_car.setTime(moving_time.getText().toString());
                new_car.setPrice(charges.getText().toString());
                new_car.setContact(contact.getText().toString());
                new_car.setFrom(from.getSelectedItem().toString());
                new_car.setTo(to_des.getSelectedItem().toString());
                databaseImp= Room.databaseBuilder(
                        view.getContext().getApplicationContext(),
                        DatabaseImp.class,
                        DATABASENAME)
                        .allowMainThreadQueries()
                        .fallbackToDestructiveMigration().build();

                databaseImp.database().InsertCarsDetails(new_car);
                Toast.makeText(view.getContext(),"تم اضافه سيارتك للفلزه",Toast.LENGTH_SHORT).show();


            }
        });

        return view;
    }
//
//    private OnFragmentInteractionListener mListener;
//
//    public fra2() {
//        // Required empty public constructor
//    }

//    /**
////     * Use this factory method to create a new instance of
////     * this fragment using the provided parameters.
////     *
////     * @param param1 Parameter 1.
////     * @param param2 Parameter 2.
////     * @return A new instance of fragment fra2.
////     */
////    // TODO: Rename and change types and number of parameters
////    public static fra2 newInstance() {
////        fra2 fragment = new fra2();
////        Bundle args = new Bundle();
////
////        fragment.setArguments(args);
////        return fragment;
////    }
////
////    @Override
////    public void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        if (getArguments() != null) {
////            mParam1 = getArguments().getString(ARG_PARAM1);
////            mParam2 = getArguments().getString(ARG_PARAM2);
////        }
////    }
////
////    @Override
////    public View onCreateView(LayoutInflater inflater, ViewGroup container,
////                             Bundle savedInstanceState) {
////        // Inflate the layout for this fragment
////        return inflater.inflate(R.layout.fragment_fra2, container, false);
////    }
////
////    // TODO: Rename method, update argument and hook method into UI event
////    public void onButtonPressed(Uri uri) {
////        if (mListener != null) {
////            mListener.onFragmentInteraction(uri);
////        }
////    }
////
////    @Override
////    public void onAttach(Context context) {
////        super.onAttach(context);
////        if (context instanceof OnFragmentInteractionListener) {
////            mListener = (OnFragmentInteractionListener) context;
////        } else {
////            throw new RuntimeException(context.toString()
////                    + " must implement OnFragmentInteractionListener");
////        }
////    }
////
////    @Override
////    public void onDetach() {
////        super.onDetach();
////        mListener = null;
////    }
////
////    /**
////     * This interface must be implemented by activities that contain this
////     * fragment to allow an interaction in this fragment to be communicated
////     * to the activity and potentially other fragments contained in that
////     * activity.
////     * <p>
////     * See the Android Training lesson <a href=
////     * "http://developer.android.com/training/basics/fragments/communicating.html"
////     * >Communicating with Other Fragments</a> for more information.
////     */
////    public interface OnFragmentInteractionListener {
////        // TODO: Update argument type and name
////        void onFragmentInteraction(Uri uri);
////    }
}
