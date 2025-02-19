// ex 6.3a;mainactivity.java code

package com.example.xiaop.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.hardware.SensorManager;
import android.hardware.Sensor;
import android.view.View;
import android.widget.TextView;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
  TextView tv1= null;
  private SensorManager mSensorManager;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    tv1 = (TextView)findViewById(R.id.textview);
    tv1.setVisibility(View.GONE);

    mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
    List<Sensor> mList = mSensorManager.getSensorList(Sensor.TYPE_ALL);

    for(int i = 1; i < mList.size(); i++) {
      tv1.setVisiblity(View.VISIBLE);
      tv1.append("\n" + mList.get(i).getName() + "\n" + mList.get(i).getVendor() + "\n" + mList.get(i).getVersion());

    }
  }
}
