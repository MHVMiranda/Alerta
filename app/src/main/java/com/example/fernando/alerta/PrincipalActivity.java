package com.example.fernando.alerta;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.fernando.alerta.R.layout.activity_principal);
    }


    public void onClickButton(View v){
        showMessage("Alerta!","Testando um alerta","sim","também");
    }

    public void showMessage(String titulo, String mensagem, final String btUm, final String btDois) {
        AlertDialog alerta;
        //Cria o gerador do AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //define o titulo
        builder.setTitle(titulo);
        //define a mensagem
        builder.setMessage(mensagem);
        //define um botão como positivo
        builder.setPositiveButton(btUm, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                //execcutando botão um
                Toast.makeText(PrincipalActivity.this, btUm + arg1, Toast.LENGTH_SHORT).show();
            }
        });
        //define um botão como negativo.
        builder.setNegativeButton(btDois, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                //execcutando botão um
                Toast.makeText(PrincipalActivity.this, btDois + arg1, Toast.LENGTH_SHORT).show();
            }
        });
        //cria o AlertDialog
        alerta = builder.create();
        //Exibe
        alerta.show();
    }
}
