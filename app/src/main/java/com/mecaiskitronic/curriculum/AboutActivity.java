package com.mecaiskitronic.curriculum;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.io.File;

import static com.mecaiskitronic.curriculum.R.*;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_about);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu mimenu){
        getMenuInflater().inflate(menu.menu,mimenu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem opcion_menu){

        int id=opcion_menu.getItemId();

        if(id==R.id.llamar){
            Uri miNum=Uri.parse("tel:+34628039336");
            Intent in=new Intent(Intent.ACTION_DIAL,miNum);
            //int permisCheck= ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_CALENDAR);
            startActivity(in);
            return true;
        }

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
}
