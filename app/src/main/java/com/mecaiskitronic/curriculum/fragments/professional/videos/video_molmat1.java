package com.mecaiskitronic.curriculum.fragments.professional.videos;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.mecaiskitronic.curriculum.R;
import com.mecaiskitronic.curriculum.VideosActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class video_molmat1 extends Fragment {

    private VideoView video;
    private ImageView next;
    private int IdVisor;


    public video_molmat1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista=inflater.inflate(R.layout.fragment_video_molmat1, container, false);

        video=vista.findViewById(R.id.videoMotllo);
        Uri uri=Uri.parse("android.resource://com.mecaiskitronic.curriculum/"+R.raw.videomolmat1);
        video.setVideoURI(uri);

        MediaController controlador=new MediaController(getContext());
        video.setMediaController(controlador);
        controlador.setAnchorView(video);
        video.setSystemUiVisibility(View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                |View.SYSTEM_UI_FLAG_FULLSCREEN
                |View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                |View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                |View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        video.start();

        next=(ImageView)vista.findViewById(R.id.next);
        next.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {

                IdVisor=9;

                Intent in=new Intent(getContext(), VideosActivity.class);
                in.putExtra("id",IdVisor);

                startActivity(in);

            }
        });



        return vista;
    }
}
