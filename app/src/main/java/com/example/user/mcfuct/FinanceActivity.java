package com.example.user.mcfuct;



import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;



public class FinanceActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance);



    }
  public void sendEmail(View v){
      String [] emailadress={"riyaadh.fakier@uct.ac.za"};
      Intent intent = new Intent(Intent.ACTION_SENDTO);
      intent.setData(Uri.parse("mailto:")); // only email apps should handle this

      intent.putExtra(Intent.EXTRA_SUBJECT, "MasterCard Financial Query");
      intent.putExtra(Intent.EXTRA_EMAIL, emailadress);
      if (intent.resolveActivity(getPackageManager()) != null) {
          startActivity(intent);
      }


  }

  public void callStaff(View v){
      String phoneNumber="+2706505095";
      Intent intent = new Intent(Intent.ACTION_DIAL);
      intent.setData(Uri.parse("tel:" + phoneNumber));
      if (intent.resolveActivity(getPackageManager()) != null) {
          startActivity(intent);}
  }
}
