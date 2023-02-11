package com.mecaiskitronic.curriculum;

import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.mecaiskitronic.curriculum.fragments.professional.goro_fotos.foto1;
import com.mecaiskitronic.curriculum.fragments.professional.goro_fotos.foto2;
import com.mecaiskitronic.curriculum.fragments.professional.goro_fotos.foto3;
import com.mecaiskitronic.curriculum.fragments.professional.goro_fotos.foto4;
import com.mecaiskitronic.curriculum.fragments.professional.goro_fotos.foto5;
import com.mecaiskitronic.curriculum.fragments.professional.canela_fotos.foto6;
import com.mecaiskitronic.curriculum.fragments.professional.molmat_fotos.foto14;
import com.mecaiskitronic.curriculum.fragments.professional.molmat_fotos.foto15;
import com.mecaiskitronic.curriculum.fragments.professional.molmat_fotos.foto16;
import com.mecaiskitronic.curriculum.fragments.professional.molmat_fotos.foto17;
import com.mecaiskitronic.curriculum.fragments.professional.molmat_fotos.foto18;
import com.mecaiskitronic.curriculum.fragments.professional.molmat_fotos.foto19;
import com.mecaiskitronic.curriculum.fragments.professional.molmat_fotos.foto20;
import com.mecaiskitronic.curriculum.fragments.professional.molmat_fotos.foto21;
import com.mecaiskitronic.curriculum.fragments.professional.molmat_fotos.foto22;
import com.mecaiskitronic.curriculum.fragments.professional.molmat_fotos.foto23;
import com.mecaiskitronic.curriculum.fragments.professional.molmat_fotos.foto24;
import com.mecaiskitronic.curriculum.fragments.professional.multivac_fotos.foto7;
import com.mecaiskitronic.curriculum.fragments.professional.multivac_fotos.foto8;
import com.mecaiskitronic.curriculum.fragments.professional.multivac_fotos.foto9;
import com.mecaiskitronic.curriculum.fragments.professional.multivac_fotos.foto10;
import com.mecaiskitronic.curriculum.fragments.professional.proto_fotos.foto11;
import com.mecaiskitronic.curriculum.fragments.professional.proto_fotos.foto12;
import com.mecaiskitronic.curriculum.fragments.professional.proto_fotos.foto13;


public class FotosActivity extends AppCompatActivity {

    private static int numPage;
    private static int idboto;
    private ViewPager visorPagina;
    private PagerAdapter adaptadorPagina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotos);

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

        visorPagina = (ViewPager) findViewById(R.id.paginadorFotos);
        adaptadorPagina = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        visorPagina.setAdapter(adaptadorPagina);


    }


    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            if (idboto==0){
                if (position==0)return new foto1();
                if (position==1)return new foto2();
                if (position==2)return new foto3();
                if (position==3)return new foto4();
                if (position==4)return new foto5();
            }
            if (idboto==2){
                if (position==0)return new foto6();

            }
            if (idboto==3){
                if (position==0)return new foto7();
                if (position==1)return new foto8();
                if (position==2)return new foto9();
                if (position==3)return new foto10();

            }
            if (idboto==4){
                if (position==0)return new foto11();
                if (position==1)return new foto12();
                if (position==2)return new foto13();

            }
            if (idboto==5){
                if (position==0)return new foto14();
                if (position==1)return new foto15();
                if (position==2)return new foto16();
                if (position==3)return new foto17();
                if (position==4)return new foto18();
                if (position==5)return new foto19();
                if (position==6)return new foto20();
                if (position==7)return new foto21();
                if (position==8)return new foto22();
                if (position==9)return new foto23();
                if (position==10)return new foto24();
            }

            return new foto1();
        }

        @Override
        public int getCount() {
            return numPage;
        }
    }
}