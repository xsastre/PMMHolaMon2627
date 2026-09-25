package docencia.xaviersastre.dam.pmm.holamon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // 1. Declarar les variables per als elements visuals
    private TextView tvHolaMon;
    private Button btnCanviarText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // 2. Vincular les variables amb els elements XML mitjançant l'ID
        tvHolaMon = findViewById(R.id.textHolaMon);
        btnCanviarText = findViewById(R.id.botoCanviarText);

        // 3. Assignar l'esdeveniment de clic al botó
        btnCanviarText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Modificar el text quan es prem el botó
                tvHolaMon.setText("Has premut el botó! 🎉");
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}