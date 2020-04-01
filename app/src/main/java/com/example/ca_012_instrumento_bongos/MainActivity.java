package com.example.ca_012_instrumento_bongos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

@TargetApi(Build.VERSION_CODES.CUPCAKE)
public class MainActivity extends AppCompatActivity implements SensorEventListener{

    //comentario edicion
    private Button btnCentroB1,btnCentroB2,
            btnMedioB11,btnMedioB12,btnMedioB13,btnMedioB14,
            btnMedioB21,btnMedioB22,btnMedioB23,btnMedioB24,
            btnOrillaB11,btnOrillaB12,btnOrillaB13,btnOrillaB14,
            btnOrillaB21,btnOrillaB22,btnOrillaB23,btnOrillaB24,
            salir;
    private MediaPlayer mediaPlayer;
    private boolean reproduciendo=false;
    private SensorManager sensorManager;
    private List<Sensor> sensorList;
    private float xAnterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCentroB1 = (Button) findViewById(R.id.btnCentroB1);
        btnCentroB2 = (Button) findViewById(R.id.btnCentroB2);
        btnMedioB11 = (Button) findViewById(R.id.btnMedioB11);
        btnMedioB12 = (Button) findViewById(R.id.btnMedioB12);
        btnMedioB13 = (Button) findViewById(R.id.btnMedioB13);
        btnMedioB14 = (Button) findViewById(R.id.btnMedioB14);
        btnMedioB21 = (Button) findViewById(R.id.btnMedioB21);
        btnMedioB22 = (Button) findViewById(R.id.btnMedioB22);
        btnMedioB23 = (Button) findViewById(R.id.btnMedioB23);
        btnMedioB24 = (Button) findViewById(R.id.btnMedioB24);
        btnOrillaB11 = (Button) findViewById(R.id.btnOrillaB11);
        btnOrillaB12 = (Button) findViewById(R.id.btnOrillaB12);
        btnOrillaB13 = (Button) findViewById(R.id.btnOrillaB13);
        btnOrillaB14 = (Button) findViewById(R.id.btnOrillaB14);
        btnOrillaB21 = (Button) findViewById(R.id.btnOrillaB21);
        btnOrillaB22 = (Button) findViewById(R.id.btnOrillaB22);
        btnOrillaB23 = (Button) findViewById(R.id.btnOrillaB23);
        btnOrillaB24 = (Button) findViewById(R.id.btnOrillaB24);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensorList = sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);
        if(sensorList.size()>0)
        {
            sensorManager.registerListener(this,sensorList.get(0),SensorManager.SENSOR_DELAY_GAME);
        }
        reproduciendo = false;

        btnCentroB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    if(reproduciendo==true)
                    {
                        try
                        {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                            reproduciendo=false;
                        }
                        catch (Exception e)
                        {
                            Log.e("Sonido",e.toString());
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG);
                        }
                    }

                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.bongo_1);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
                catch (Exception e)
                {
                    Log.e("Sonido",e.toString());
                }
            }
        });

        btnCentroB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    if(reproduciendo==true)
                    {
                        try
                        {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                            reproduciendo=false;
                        }
                        catch (Exception e)
                        {
                            Log.e("Sonido",e.toString());
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG);
                        }
                    }

                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.bongo_1);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
                catch (Exception e)
                {
                    Log.e("Sonido",e.toString());
                }
            }
        });

        btnMedioB11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    if(reproduciendo==true)
                    {
                        try
                        {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                            reproduciendo=false;
                        }
                        catch (Exception e)
                        {
                            Log.e("Sonido",e.toString());
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG);
                        }
                    }

                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.bongo_4);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
                catch (Exception e)
                {
                    Log.e("Sonido",e.toString());
                }
            }
        });

        btnMedioB12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    if(reproduciendo==true)
                    {
                        try
                        {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                            reproduciendo=false;
                        }
                        catch (Exception e)
                        {
                            Log.e("Sonido",e.toString());
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG);
                        }
                    }

                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.bongo_4);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
                catch (Exception e)
                {
                    Log.e("Sonido",e.toString());
                }
            }
        });

        btnMedioB13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    if(reproduciendo==true)
                    {
                        try
                        {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                            reproduciendo=false;
                        }
                        catch (Exception e)
                        {
                            Log.e("Sonido",e.toString());
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG);
                        }
                    }

                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.bongo_4);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
                catch (Exception e)
                {
                    Log.e("Sonido",e.toString());
                }
            }
        });

        btnMedioB14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    if(reproduciendo==true)
                    {
                        try
                        {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                            reproduciendo=false;
                        }
                        catch (Exception e)
                        {
                            Log.e("Sonido",e.toString());
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG);
                        }
                    }

                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.bongo_4);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
                catch (Exception e)
                {
                    Log.e("Sonido",e.toString());
                }
            }
        });

        btnMedioB21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    if(reproduciendo==true)
                    {
                        try
                        {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                            reproduciendo=false;
                        }
                        catch (Exception e)
                        {
                            Log.e("Sonido",e.toString());
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG);
                        }
                    }

                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.bongo_4);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
                catch (Exception e)
                {
                    Log.e("Sonido",e.toString());
                }
            }
        });

        btnMedioB22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    if(reproduciendo==true)
                    {
                        try
                        {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                            reproduciendo=false;
                        }
                        catch (Exception e)
                        {
                            Log.e("Sonido",e.toString());
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG);
                        }
                    }

                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.bongo_4);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
                catch (Exception e)
                {
                    Log.e("Sonido",e.toString());
                }
            }
        });

        btnMedioB23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    if(reproduciendo==true)
                    {
                        try
                        {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                            reproduciendo=false;
                        }
                        catch (Exception e)
                        {
                            Log.e("Sonido",e.toString());
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG);
                        }
                    }

                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.bongo_4);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
                catch (Exception e)
                {
                    Log.e("Sonido",e.toString());
                }
            }
        });

        btnMedioB24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    if(reproduciendo==true)
                    {
                        try
                        {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                            reproduciendo=false;
                        }
                        catch (Exception e)
                        {
                            Log.e("Sonido",e.toString());
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG);
                        }
                    }

                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.bongo_4);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
                catch (Exception e)
                {
                    Log.e("Sonido",e.toString());
                }
            }
        });

        btnOrillaB11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    if(reproduciendo==true)
                    {
                        try
                        {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                            reproduciendo=false;
                        }
                        catch (Exception e)
                        {
                            Log.e("Sonido",e.toString());
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG);
                        }
                    }

                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.bongo_6);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
                catch (Exception e)
                {
                    Log.e("Sonido",e.toString());
                }
            }
        });

        btnOrillaB12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    if(reproduciendo==true)
                    {
                        try
                        {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                            reproduciendo=false;
                        }
                        catch (Exception e)
                        {
                            Log.e("Sonido",e.toString());
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG);
                        }
                    }

                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.bongo_6);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
                catch (Exception e)
                {
                    Log.e("Sonido",e.toString());
                }
            }
        });

        btnOrillaB13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    if(reproduciendo==true)
                    {
                        try
                        {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                            reproduciendo=false;
                        }
                        catch (Exception e)
                        {
                            Log.e("Sonido",e.toString());
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG);
                        }
                    }

                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.bongo_6);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
                catch (Exception e)
                {
                    Log.e("Sonido",e.toString());
                }
            }
        });

        btnOrillaB14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    if(reproduciendo==true)
                    {
                        try
                        {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                            reproduciendo=false;
                        }
                        catch (Exception e)
                        {
                            Log.e("Sonido",e.toString());
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG);
                        }
                    }

                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.bongo_6);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
                catch (Exception e)
                {
                    Log.e("Sonido",e.toString());
                }
            }
        });

        btnOrillaB21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    if(reproduciendo==true)
                    {
                        try
                        {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                            reproduciendo=false;
                        }
                        catch (Exception e)
                        {
                            Log.e("Sonido",e.toString());
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG);
                        }
                    }

                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.bongo_6);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
                catch (Exception e)
                {
                    Log.e("Sonido",e.toString());
                }
            }
        });

        btnOrillaB22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    if(reproduciendo==true)
                    {
                        try
                        {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                            reproduciendo=false;
                        }
                        catch (Exception e)
                        {
                            Log.e("Sonido",e.toString());
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG);
                        }
                    }

                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.bongo_6);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
                catch (Exception e)
                {
                    Log.e("Sonido",e.toString());
                }
            }
        });

        btnOrillaB23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    if(reproduciendo==true)
                    {
                        try
                        {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                            reproduciendo=false;
                        }
                        catch (Exception e)
                        {
                            Log.e("Sonido",e.toString());
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG);
                        }
                    }

                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.bongo_6);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
                catch (Exception e)
                {
                    Log.e("Sonido",e.toString());
                }
            }
        });

        btnOrillaB24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    if(reproduciendo==true)
                    {
                        try
                        {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                            reproduciendo=false;
                        }
                        catch (Exception e)
                        {
                            Log.e("Sonido",e.toString());
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG);
                        }
                    }

                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.bongo_6);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
                catch (Exception e)
                {
                    Log.e("Sonido",e.toString());
                }
            }
        });
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent)
    {
        if(sensorEvent.sensor.getType()== Sensor.TYPE_ACCELEROMETER)
        {
            synchronized (this)
            {
                float x,y,z;
                x = sensorEvent.values[0];
                y = sensorEvent.values[1];
                z = sensorEvent.values[2];

                x = (xAnterior*10+x)/11;
                xAnterior = x;

                if(x>-5 && x<5)
                {
                    if(reproduciendo==true)
                    {
                        try
                        {
                            mediaPlayer.stop();
                            mediaPlayer.release();
                            reproduciendo=false;
                        }
                        catch (Exception e)
                        {
                            Log.e("Sonido",e.toString());
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG);
                        }
                    }
                }

                if(x<-5)
                {
                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.caida_bongo);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
                if(x>5)
                {
                    if(reproduciendo==false)
                    {
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.caida_bongo2);
                        mediaPlayer.start();
                        reproduciendo = true;
                    }
                }
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i)
    {

    }

    @Override
    protected void onStop()
    {
        if(reproduciendo==true)
        {
            try
            {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
            catch (Exception e)
            {
                Log.e("Sonido", e.toString());
            }
            reproduciendo=false;
        }
        sensorManager.unregisterListener(this);
        super.onStop();
    }
}
