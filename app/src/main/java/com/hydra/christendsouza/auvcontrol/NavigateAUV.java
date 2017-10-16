package com.hydra.christendsouza.auvcontrol;

/*import android.content.Context;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

public class NavigateAUV extends AppCompatActivity {

    // Debug
    private final String TAG = "TAG/CameraIMU";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context context = getApplicationContext();
        setContentView(R.layout.activity_navigate_auv);
    }

}
*/
import android.graphics.LightingColorFilter;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class NavigateAUV extends ActionBarActivity {

    private TextView mTextViewAngleLeft;
    private TextView mTextViewStrengthLeft;
    View v1;
    //Context c;
    Button b;
    TextView t;
    String s1="Auto Pilot Status : OFF";
    String s2="Auto Pilot Status : ON";
    boolean but=false;
    ActionBar m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //c=getApplicationContext();
        setContentView(R.layout.activity_navigate_auv);
        //getActionBar().setDisplayHomeAsUpEnabled(true);
        //getActionBar().setDisplayShowHomeEnabled(true);
        //t1=(TextView)findViewById(R.id.text_hor);
        //t2=(TextView)findViewById(R.id.text_ver);
        t=(TextView)findViewById(R.id.Status);
        //v1=(View)findViewById(R.id.vjoystick_main);
        b=(Button)findViewById(R.id.auto_button);
        b.getBackground().setColorFilter(new LightingColorFilter(0xDDDDEEEE, 0xFFAA0000));
        mTextViewAngleLeft = (TextView) findViewById(R.id.textView_angle_left);
        mTextViewStrengthLeft = (TextView) findViewById(R.id.textView_strength_left);

        final JoystickView joystickLeft = (JoystickView) findViewById(R.id.joystickView_left);
        //v1.setOnTouchListener(new VJoystickTouchListener());

        //pixelFactor = v1.getHeight() / 400d;
        //mMaxDistance = 50*pixelFactor;

        joystickLeft.setOnMoveListener(new JoystickView.OnMoveListener() {
            @Override
            public void onMove(int angle, int strength) {
                mTextViewAngleLeft.setText(angle + "°");
                mTextViewStrengthLeft.setText(strength + "%");
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(but){
                    but=false;
                    joystickLeft.setEnabled(true);
                    t.setText(s1);
                }
                else{
                    but=true;
                    joystickLeft.setEnabled(false);
                    t.setText(s2);
                }
            }
        });
    }

    /*public void Send(View view) {
        new Create_Part().execute();
    }*/

    /*private class VJoystickTouchListener implements View.OnTouchListener {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int action = event.getActionMasked();
            if (action == MotionEvent.ACTION_DOWN) {
                mStartingPositionX = event.getX(0);
                mStartingPositionY = event.getY(0);
                t1.setText(String.valueOf(mStartingPositionX));
                t2.setText(String.valueOf(mStartingPositionY));
            }
            else if (action == MotionEvent.ACTION_UP) {
                mHorizontalFactor = 0;
                mVerticalFactor = 0;
                t1.setText(String.valueOf(event.getX(0)));
                t2.setText(String.valueOf(event.getY(0)));
            }
            else if (action == MotionEvent.ACTION_MOVE) {
                // Get the proportion to the max
                mHorizontalFactor = (event.getX(0) - mStartingPositionX); // /mMaxDistance;
                mVerticalFactor = (event.getY(0) - mStartingPositionY); // /mMaxDistance;
                if(mHorizontalFactor!=0) {
                    double slope = mVerticalFactor / mHorizontalFactor;
                    if (slope>=1) {
                        if(mHorizontalFactor>0) {
                            t1.setText(String.valueOf(event.getX(0)));
                            t2.setText(String.valueOf(event.getY(0)));
                            t3.setText("REVERSE");
                        }
                        else if(mHorizontalFactor<0)
                        {
                            t1.setText(String.valueOf(event.getX(0)));
                            t2.setText(String.valueOf(event.getY(0)));
                            t3.setText("FORWARD");
                        }
                    }
                    else if(slope<=-1)
                    {
                        if(mHorizontalFactor<0){
                            t1.setText(String.valueOf(event.getX(0)));
                            t2.setText(String.valueOf(event.getY(0)));
                            t3.setText("REVERSE");
                        }
                        else if(mVerticalFactor<0){
                            t1.setText(String.valueOf(event.getX(0)));
                            t2.setText(String.valueOf(event.getY(0)));
                            t3.setText("FORWARD");
                        }
                    }
                    else if(slope<1&&slope>=0){
                        if(mHorizontalFactor>0) {
                            t1.setText(String.valueOf(event.getX(0)));
                            t2.setText(String.valueOf(event.getY(0)));
                            t3.setText("RIGHT");
                        }
                        else if(mHorizontalFactor<0)
                        {
                            t1.setText(String.valueOf(event.getX(0)));
                            t2.setText(String.valueOf(event.getY(0)));
                            t3.setText("LEFT");
                        }
                    }
                    else if(slope>-1&&slope<0){
                        if(mHorizontalFactor<0){
                            t1.setText(String.valueOf(event.getX(0)));
                            t2.setText(String.valueOf(event.getY(0)));
                            t3.setText("LEFT");
                        }
                        else if(mVerticalFactor<0){
                            t1.setText(String.valueOf(event.getX(0)));
                            t2.setText(String.valueOf(event.getY(0)));
                            t3.setText("RIGHT");
                        }
                    }
                }
                else
                {
                    if(mVerticalFactor>0){
                        t1.setText(String.valueOf(event.getX(0)));
                        t2.setText(String.valueOf(event.getY(0)));
                        t3.setText("REVERSE");
                    }
                    else if(mVerticalFactor<0)
                    {
                        t1.setText(String.valueOf(event.getX(0)));
                        t2.setText(String.valueOf(event.getY(0)));
                        t3.setText("FORWARD");
                    }
                }
            }
            return true;
        }
    }*/
}
