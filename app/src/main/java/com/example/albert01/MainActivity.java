package com.example.albert01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;
    EditText eT1;
    double num1, num2;
    String st;
    int op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eT1=findViewById(R.id.eT1);
        btn1= findViewById(R.id.btn1);
        btn2= findViewById(R.id.btn2);
        btn3= findViewById(R.id.btn3);
        btn4= findViewById(R.id.btn4);
        btn5= findViewById(R.id.btn5);
        btn6= findViewById(R.id.btn6);
        btn7= findViewById(R.id.btn7);
        op=-1;

    }

    public boolean isNum(){
        st= eT1.getText().toString();
        eT1.setText("");
        if (st.matches("-?\\d+(\\.\\d+)?")) {
            num2 = Double.parseDouble(st);
            //st = "";
            return true;
        }
        return false;
    }
    public void Num1(){
        if      (op == 1) {num1 += num2;}
        else if (op == 2) {num1 -= num2;}
        else if (op == 3) {num1 *= num2;}
        else if (op == 4) {num1 /= num2;}
    }

    public void go1(View view) {
        if (op != 5) {
            if (isNum()) {
                if (op != -1)
                    Num1();
                else
                    num1 = num2;
                eT1.setHint("" + num1 + "+");
                op=1;
            }
        }
        else if(st=="") {
            eT1.setText("");
            eT1.setHint(""+num1+"+");
            op = 1;
        }

    }

    public void go2(View view) {
        if (op != 5) {
            if (isNum()) {
                if (op != -1)
                    Num1();
                else
                    num1 = num2;
                eT1.setHint("" + num1 + "-");
                op=2;
            }
        }
        else if(st=="") {
            eT1.setText("");
            eT1.setHint(""+num1+"-");
            op = 2;
        }
    }

    public void go3(View view) {
        if (op != 5) {
            if (isNum()) {
                if (op != -1)
                    Num1();
                else
                    num1 = num2;
                eT1.setHint("" + num1 + "*");
                op=3;
            }
        }
        else if(st=="") {
            eT1.setText("");
            eT1.setHint(""+num1+"*");
            op = 3;
        }
    }

    public void go4(View view) {
        if (op != 5) {
            if (isNum()) {
                if (op != -1)
                    Num1();
                else
                    num1 = num2;
                eT1.setHint("" + num1 + "/");
                op = 4;
            }
        }
        else if(st=="") {
            eT1.setText("");
            eT1.setHint(""+ num1+"/");
            op = 4;
        }
    }

    public void go5(View view) {
        if (isNum()) {
            if (op != -1) {
                if (op != 5)
                    Num1();
            }
            else
                num1 = num2;
            eT1.setHint(""+num1);
            op = 5;
            st = "";
        }
    }

    public void go6(View view) {
        op=-1; num1=0;
        eT1.setText("");
        eT1.setHint("");
    }

    public void go7(View view) {
        Intent si=new Intent(this, MainActivity2.class);
        si.putExtra("num1", num1);
        startActivity(si);
    }
}