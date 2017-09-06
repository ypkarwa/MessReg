package com.example.karwakapc.messreg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    private EditText messName;
    private EditText ownerName;
    private EditText messAddress;
    private EditText nbCollege;
    private EditText guestCharge;
    private EditText monthyCharge;
    private EditText contact;
    private EditText lunchOpen;
    private EditText lunchClose;
    private EditText dinnerOpen;
    private EditText dinnerClose;
    private Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messName = (EditText) findViewById(R.id.editText5);
        ownerName = (EditText) findViewById(R.id.editText4);
        messAddress  = (EditText) findViewById(R.id.editText6);
        nbCollege = (EditText) findViewById(R.id.editText8);
        guestCharge = (EditText) findViewById(R.id.editText10);
        monthyCharge = (EditText) findViewById(R.id.editText9);
        contact = (EditText) findViewById(R.id.editText16);
        lunchOpen = (EditText) findViewById(R.id.editText12);
        lunchClose = (EditText) findViewById(R.id.editText11);
        dinnerOpen = (EditText) findViewById(R.id.editText14);
        dinnerClose = (EditText) findViewById(R.id.editText13);
        submit = (Button) findViewById(R.id.button2);

        submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String MessName = messName.getText().toString();
                String OwnerName = ownerName.getText().toString();
                String MessAddress= messAddress.getText().toString();
                String NbCollege = nbCollege.getText().toString();
                String GuestCharge = guestCharge.getText().toString();
                String MonthlyCharge = monthyCharge.getText().toString();
                String Contact = contact.getText().toString();
                String LunchOpen = lunchOpen.getText().toString();
                String LunchClose = lunchClose.getText().toString();
                String DinnerOpen = dinnerOpen.getText().toString();
                String DinnerClose = dinnerClose.getText().toString();




            }
        });

    }
}
