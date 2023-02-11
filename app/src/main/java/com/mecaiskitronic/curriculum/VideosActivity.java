package com.mecaiskitronic.curriculum;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.mecaiskitronic.curriculum.fragments.professional.videos.videoGoro;
import com.mecaiskitronic.curriculum.fragments.professional.videos.video_molmat1;
import com.mecaiskitronic.curriculum.fragments.professional.videos.video_molmat2;

public class VideosActivity extends FragmentActivity {

    private static int idboto;
    Fragment fragmentos[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_videos);

        fragmentos=new Fragment[3];
        fragmentos[0]=new videoGoro();
        fragmentos[1]=new video_molmat1();
        fragmentos[2]=new video_molmat2();

        View decorview=getWindow().getDecorView();
        int Uiopcion=View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                |View.SYSTEM_UI_FLAG_FULLSCREEN
                |View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                |View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                |View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
        decorview.setSystemUiVisibility(Uiopcion);

        Bundle extras=getIntent().getExtras();
        idboto=extras.getInt("id");

        DameFragmento();


    }

    public void DameFragmento() {
        if (idboto==7){
            FragmentManager mimanejador=getSupportFragmentManager();
            FragmentTransaction mitransaccion=mimanejador.beginTransaction();
            mitransaccion.replace(R.id.Reproductor,fragmentos[0]);
            mitransaccion.commit();
        }
        if (idboto==8){
            FragmentManager mimanejador=getSupportFragmentManager();
            FragmentTransaction mitransaccion=mimanejador.beginTransaction();
            mitransaccion.replace(R.id.Reproductor,fragmentos[1]);
            mitransaccion.commit();
        }
        if (idboto==9){
            FragmentManager mimanejador=getSupportFragmentManager();
            FragmentTransaction mitransaccion=mimanejador.beginTransaction();
            mitransaccion.replace(R.id.Reproductor,fragmentos[2]);
            mitransaccion.commit();
        }
    }

}
