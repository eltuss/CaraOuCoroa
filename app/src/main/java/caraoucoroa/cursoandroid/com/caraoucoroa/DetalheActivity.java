package caraoucoroa.cursoandroid.com.caraoucoroa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private ImageView voltar;
    public ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        imagem = (ImageView) findViewById(R.id.moedaId);
        voltar = (ImageView) findViewById(R.id.btvoltarId);

        Bundle extra = getIntent().getExtras();
        if (extra != null){
            String opcaoEscolhida = extra.getString("opcao");
            if (opcaoEscolhida.equals("cara")){
                //Imagem cara
                imagem.setImageDrawable(ContextCompat.getDrawable(DetalheActivity.this,R.drawable.moeda_cara));
            }else {
                //Imagem coroa
                imagem.setImageDrawable(ContextCompat.getDrawable(DetalheActivity.this,R.drawable.moeda_coroa));
            }
        }

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(DetalheActivity.this, MainActivity.class));

            }
        });
    }
}
