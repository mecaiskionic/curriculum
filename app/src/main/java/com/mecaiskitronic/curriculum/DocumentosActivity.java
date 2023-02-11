package com.mecaiskitronic.curriculum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.mecaiskitronic.curriculum.fragments.professional.molmat_fotos.document1;
import com.mecaiskitronic.curriculum.fragments.professional.molmat_fotos.document2;


public class DocumentosActivity extends AppCompatActivity {

    private static int numPage;
    private static int idboto;
    private ViewPager visorPagina;
    private PagerAdapter adaptadorPagina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documentos);

        View decorview=getWindow().getDecorView();
        int Uiopcion=View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                |View.SYSTEM_UI_FLAG_FULLSCREEN
                |View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                |View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                |View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
        decorview.setSystemUiVisibility(Uiopcion);

        Bundle extras=getIntent().getExtras();
        idboto=extras.getInt("id");
        numPage=extras.getInt("cantidad");

        visorPagina = (ViewPager) findViewById(R.id.paginadorDocumentos);
        adaptadorPagina = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        visorPagina.setAdapter(adaptadorPagina);
    }
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            if (idboto==6){
                if (position==0)return new document1();
                if (position==1)return new document2();
            }

            return new document1();
        }

        @Override
        public int getCount() {
            return numPage;
        }
    }
}

