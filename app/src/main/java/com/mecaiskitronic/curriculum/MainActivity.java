package com.mecaiskitronic.curriculum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

import com.mecaiskitronic.curriculum.fragments.principals.Professional;
import com.mecaiskitronic.curriculum.fragments.principals.Estudis;
import com.mecaiskitronic.curriculum.fragments.principals.Index;
import com.mecaiskitronic.curriculum.fragments.principals.Projectes;
import com.mecaiskitronic.curriculum.fragments.principals.coneixements;

public class MainActivity extends AppCompatActivity{

    private final Index index=new Index();
    private final Estudis estudis=new Estudis();
    private final Professional profe=new Professional();
    private final coneixements coneux=new coneixements();
    private final Projectes project=new Projectes();

    private static final int numPage=5;
    private ViewPager visorPag;

    Window ventana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.menu_color));
        getSupportActionBar().setElevation(0);
        //getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimary));




        //DrawerLayout drawer = findViewById(R.id.drawer);
        //NavigationView navigationView = findViewById(R.id.navegador);

        visorPag = findViewById(R.id.paginador);
        PagerAdapter adaptorPac = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        visorPag.setAdapter(adaptorPac);
/*
        // Permisos
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) !=
                PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) !=
                        PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,},
                    1000);
        }*/

    }
/*
    -------------------------------------------------------------------------------------------------------------------
    ---------------------------------VISOR DE PANTALLA LLISCADOR------------------------------------------------
    -------------------------------------------------------------------------------------------------------------
    */

    @Override// Metodo per controlar el boto de tornar atras
    public void onBackPressed() {
        if (visorPag.getCurrentItem() == 0) {
            super.onBackPressed();
        } else {
            //visorPagina.setCurrentItem(visorPagina.getCurrentItem() - 1);
            visorPag.setCurrentItem(0);
        }
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            if (position==0)return index;
            if (position==1)return estudis;
            if (position==2)return profe;
            if (position==3)return project;
            if (position==4)return coneux;


            return new Index();
        }

        @Override
        public int getCount() {
            return numPage;
        }
    }
//--------------------------------------------------------------------------------------------------------------------
    //------------------------------BARRA DE MENU---------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------

    @Override
    public boolean onCreateOptionsMenu(Menu mimenu){
        getMenuInflater().inflate(R.menu.menu,mimenu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem opcion_menu){

        int id=opcion_menu.getItemId();

        if(id==R.id.llamar){
            Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+34680450074"));

            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},1);

                return true;
            }

            startActivity(i);
            return true;
        }
        /*if(id==R.id.imprimir){

            //download();
            DocumentoPdfActivity doc=new DocumentoPdfActivity();
            doc.download();
            //Intent in=new Intent(this,DocumentoPdfActivity.class);
            //startActivity(in);

            Toast mitoast=Toast.makeText(this,"El PDF ha sido creado",Toast.LENGTH_LONG);
            mitoast.setGravity(Gravity.CENTER,0,0);
            mitoast.show();
            return true;
        }
        if(id==R.id.configurar){
            return true;
        }*/
        if(id==R.id.sobre){
            Intent in=new Intent(this,AboutActivity.class);
            startActivity(in);

            return true;
        }
        if(id==R.id.salir){

            finish();

            return true;
        }



        return super.onOptionsItemSelected(opcion_menu);

    }

 //--------------------------------------------------------------------------------------------------------------------
    //------------------------------CREAR UN PDF---------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------
    /*
 public void download() {
     File directory;
     File filename;


     if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
         PdfDocument document = new PdfDocument();
         PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(proba.getWidth(), proba.getHeight(), 0).create();

         // start a page
         PdfDocument.Page page = document.startPage(pageInfo);
         proba.draw(page.getCanvas());

         document.finishPage(page);
         try {
             if(Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
                 directory = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "PDF_Curriculum");

                 if (!directory.exists()) directory.mkdir();

                 filename=new File(directory, ("PDF_" + Calendar.getInstance().getTimeInMillis() + ".pdf"));
                 FileOutputStream outputStream = new FileOutputStream(filename);
                 document.writeTo(outputStream);
                 outputStream.flush();
                 outputStream.close();


             }

         } catch (Exception e) {
             e.printStackTrace();
         }
         document.close();
     }
 }*/
}
