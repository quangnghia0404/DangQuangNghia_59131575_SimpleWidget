package vn.edu.ntu.quangnghia.dangquangnghia_59131575_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtname, edtdate, edtkhac;
    RadioGroup rdg;
    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button btxn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvents();
    }
    void addView()
    {
        edtname = findViewById(R.id.edtname);
        edtdate = findViewById(R.id.edtdate);
        edtkhac = findViewById(R.id.edtkhac);

        rdg = findViewById(R.id.rdg);

        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);

        btxn = findViewById(R.id.btxn);
    }
    void addEvents()
    {
        btxn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "";
                text += edtname.getText().toString();
                text += "\nNgày sinh: " + edtdate.getText().toString();

                switch (rdg.getCheckedRadioButtonId())
                {
                    case R.id.rdnam: text += "\nGiới tính: Nam";break;
                    case R.id.rdnu: text += "\nGiới tính: Nữ";break;
                }
                text += "\nSở thích :";
                if (cb1.isChecked()) text += cb1.getText().toString() + ";";
                if (cb2.isChecked()) text += cb2.getText().toString() + ";";
                if (cb3.isChecked()) text += cb3.getText().toString() + ";";
                if (cb4.isChecked()) text += cb4.getText().toString() + ";";
                if (cb5.isChecked()) text += cb5.getText().toString() + ";";

                text += ";" + edtkhac.getText().toString();

                Toast.makeText(getApplicationContext(),text, Toast.LENGTH_LONG).show();
            }
        });
    }
}
