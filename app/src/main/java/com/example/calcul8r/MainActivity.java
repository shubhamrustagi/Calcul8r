package com.example.calcul8r;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btPlus,btMinus,btMultiply,btDivide,bt7,bt8,bt9,btBks,bt4,bt5,bt6,btBrOp,bt1,bt2,bt3,btBrCl,bt0,btDec,btEqual;
    TextView text;
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


        btPlus     = findViewById(R.id.buttonPlus);
        btMinus    = findViewById(R.id.buttonMinus);
        btMultiply = findViewById(R.id.buttonMultiply);
        btDivide   = findViewById(R.id.buttonDivide);
        bt7        = findViewById(R.id.buttonSeven);
        bt8        = findViewById(R.id.buttonEight);
        bt9        = findViewById(R.id.buttonNine);
        btBks      = findViewById(R.id.buttonBackspace);
        bt4        = findViewById(R.id.buttonFour);
        bt5        = findViewById(R.id.buttonFive);
        bt6        = findViewById(R.id.buttonSix);
        btBrOp     = findViewById(R.id.buttonBracesOp);
        bt1        = findViewById(R.id.buttonOne);
        bt2        = findViewById(R.id.buttonTwo);
        bt3        = findViewById(R.id.buttonThree);
        btBrCl     = findViewById(R.id.buttonBracesCl);
        bt0        = findViewById(R.id.buttonZero);
        btDec      = findViewById(R.id.buttonDecimal);
        btEqual    = findViewById(R.id.buttonEqual);
        text       = findViewById(R.id.textView);

        vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);//aka yo mum's fav toy bitch

        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5);
                text.setText(text.getText()+"+");

            }
        });
        btMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5);
                text.setText(text.getText()+"-");
            }
        });
        btMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5);
                text.setText(text.getText()+"×");
            }
        });
        btDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5);
                text.setText(text.getText()+"÷");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5);
                text.setText(text.getText()+"7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5);
                text.setText(text.getText()+"8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5);
                text.setText(text.getText()+"9");
            }
        });
        btBks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5);
                String str = text.getText().toString();
                if (str.length() > 1) {
                    str = str.substring(0, str.length() - 1);
                    text.setText(str);
                } else if (str.length() <= 1) {
                    text.setText("");
                }

            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5);
                text.setText(text.getText()+"4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5);
                text.setText(text.getText()+"5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5);
                text.setText(text.getText()+"6");
            }
        });
        btBrOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5);
                text.setText(text.getText()+"(");
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5);
                text.setText(text.getText()+"1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5);
                text.setText(text.getText()+"2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5);
                text.setText(text.getText()+"3");
            }
        });
        btBrCl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5);
                text.setText(text.getText()+")");
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5);
                text.setText(text.getText()+"0");
            }
        });
        btDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5);
                text.setText(text.getText()+".");
            }
        });
        btEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5);
                String value = text.getText().toString();
                String value2 = value.replace('÷','/');
                String value3= value2.replace('×','*');
                double Sol = InfixEvaluation.evaluate(value3);
                text.setText(Double.toString(Sol));


            }
        });
        

    }
}