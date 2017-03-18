package com.example.nirvan.fragmentsexample2;


import android.support.v4.app.FragmentActivity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*myFragment myfragment=new myFragment();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragmentContainer,myfragment);
        fragmentTransaction.commit();*/

        Button b1=(Button)findViewById(R.id.button1);
        Button b2=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                myFragment frag=new myFragment();
                getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer,frag).commit();
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
             myFragment2 frag=new myFragment2();
             getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer,frag).commit();
            }
        });
    }
}
