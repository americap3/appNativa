package mx.uach.fing.WeatherApp22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.logging.Logger;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Logger.getLogger("app ->").info("presione el botón");
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("CITY","Chihuahua");
                startActivity(intent);

            }

        });
    }
    public void goToMty(View v){
        Logger.getLogger("app ->").warning("presione el botón mty");
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("CITY","Monterrey");
        startActivity(intent);
    }
}