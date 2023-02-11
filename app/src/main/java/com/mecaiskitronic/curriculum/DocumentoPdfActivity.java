package com.mecaiskitronic.curriculum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.os.Environment;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;

public class DocumentoPdfActivity extends AppCompatActivity {

    TextView pollo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documento_pdf);

        pollo=findViewById(R.id.paralalala);

        // Permisos
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) !=
                PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) !=
                        PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,},
                    1000);
        }

        //download();
    }
    public void download() {
        File directory;
        File filename;


        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
            PdfDocument document = new PdfDocument();
            PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(pollo.getWidth(), pollo.getHeight(), 0).create();

            // start a page
            PdfDocument.Page page = document.startPage(pageInfo);
            pollo.draw(page.getCanvas());


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

                    Toast mitoast=Toast.makeText(this,"El PDF ha sido creado",Toast.LENGTH_LONG);
                    mitoast.setGravity(Gravity.CENTER,0,0);
                    mitoast.show();


                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            document.close();
        }
    }
}
