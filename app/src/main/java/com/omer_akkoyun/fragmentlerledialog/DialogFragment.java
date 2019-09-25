package com.omer_akkoyun.fragmentlerledialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SimpleAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DialogFragment extends androidx.fragment.app.DialogFragment implements View.OnClickListener{

    Button evet,hayir;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.dialog_fragment,null);

        evet = (Button) view.findViewById(R.id.buton_evet);
        hayir = (Button) view.findViewById(R.id.buton_hayir);
        //butonlara onclick baglantisi
        evet.setOnClickListener(this);
        hayir.setOnClickListener(this);
        setCancelable(false); //fragment ,fragment dışındaki yerlere tıklanınca kapanmasın



        return view;
    }




    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.buton_evet){

            dismiss();
            getActivity().moveTaskToBack(true);
            getActivity().finish();

        }
        else {

            dismiss();

        }


    }






}
