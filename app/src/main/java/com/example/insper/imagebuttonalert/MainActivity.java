package com.example.insper.imagebuttonalert;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    /**
     * Duration of wait
     **/

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Comanda para criar a splashScreen
        Runnable runnable3secs = new Runnable() {
            @Override
            public void run() {
                nextActivity();//começa a próxima atividade
                finish(); //não é possível voltar a esta atividade depois
            }
        };

        Handler myhandler = new Handler();
        myhandler.postDelayed(runnable3secs, 3000); // 3000 = tempo de execução da splash ( 3000 milisegundos = 3 segundos)
        //ff
    }

    public void nextActivity() {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}