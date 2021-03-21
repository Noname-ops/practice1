package ru.mirea.bureshkin.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public  class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button buttonOk;
    private Button buttonCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // найдем View-элементы
        textView = (TextView) findViewById(R.id.tvOut);
        buttonOk = (Button) findViewById(R.id.btnOk);
        buttonCancel = (Button) findViewById(R.id.btnCancel);
        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Нажата кнопка ОК");
            }
        };
        // присвоим обработчик кнопке OK (btnOk)
        buttonOk.setOnClickListener(oclBtnOk);
    }
    public void setButtonCancel(View view)
    {
        // выводим сообщение
        Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();
    }
}