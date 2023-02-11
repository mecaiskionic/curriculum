package com.mecaiskitronic.curriculum.fragments.professional.videos;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import com.mecaiskitronic.curriculum.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class videoGoro extends Fragment {

    VideoView video;

    public videoGoro() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista=inflater.inflate(R.layout.fragment_video_goro, container, false);

        video=vista.findViewById(R.id.videoMaquina);
        Uri uri=Uri.parse("android.resource://com.mecaiskitronic.curriculum/"+R.raw.maquina);
        video.setVideoURI(uri);

        MediaController controlador=new MediaController(getContext());
        video.setMediaController(controlador);
        controlador.setAnchorView(video);
        video.setSystemUiVisibility(View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                |View.SYSTEM_UI_FLAG_FULLSCREEN
                |View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                |View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                |View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        video.requestFocus();
        video.start();



        return vista;
    }
}
