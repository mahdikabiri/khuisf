package com.example.khuisf.teachers.messages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.khuisf.R;
import com.example.khuisf.teachers.messages.all.MessageAllFragment;
import com.example.khuisf.teachers.messages.bycourses.MessageCoursesFragment;

import me.ibrahimsn.lib.OnItemSelectedListener;
import me.ibrahimsn.lib.SmoothBottomBar;

public class getCouserForSendMessageTeachFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_send_message_teacher, container, false);
        SmoothBottomBar smoothBottomBar=view.findViewById(R.id.bottomBar);
        //set fragment default
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_message_teacher_container,new MessageCoursesFragment()).commit();

        //navigatonbutton
        smoothBottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelect(int i) {

                Fragment selectedFragment=null;
                if(i==0){
                    selectedFragment =new MessageCoursesFragment();
                }else if(i==1){
                    selectedFragment =new MessageAllFragment();
                }
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_message_teacher_container,selectedFragment).commit();

            }
        });


       return view;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}
