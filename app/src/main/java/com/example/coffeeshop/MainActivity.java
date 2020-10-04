package com.example.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button increment,decrement,order;
    TextView quantity,price,moretext;
    int coffee=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        increment=findViewById(R.id.increment);
        decrement=findViewById(R.id.decrement);
        order=findViewById(R.id.order);
        quantity=findViewById(R.id.quantity);
        price=findViewById(R.id.price);
        moretext=findViewById(R.id.moretext);

        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coffee++;
                quantity.setText(coffee+"");
            }
        });

        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coffee--;
                quantity.setText(coffee+"");
            }
        });

        order.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                price.setText("Rs:"+coffee*5+"");
                moretext.setVisibility(View.VISIBLE);
                moretext.setText("Thanks For Ordering\nEnjoy Your Meal");

            }
        });
    }
}