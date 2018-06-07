package com.example.user.mcfuct;




import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class OverviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
         String name="The Mastercard Foundation has partnered with the University of Cape Town (UCT) to provide 338 scholarships over 10 years to academically talented yet economically disadvantaged students from Sub-Saharan Africa for study at UCT.\n" +
                 "\n" +
                 "The Scholars Program is a $700 million initiative to educate young people – particularly from Africa – to lead change and make a positive social impact in their communities. Scholars will receive comprehensive scholarships, academic support, peer mentorship, career guidance, internship opportunities, transition-to-work support and access to a global alumni network.\n" +
                 "\n" +
                 "Over the 10-year period (2014 – 2024), sixty students will be awarded scholarships to complete an undergraduate qualification and 240 students will be awarded support to obtain qualifications at Honours (as of 2016) and Masters level. In order to be considered for the scholarship, applicants must meet all the eligibility criteria, including the admission criteria for their chosen course of study at UCT.\n" +
                 "\n" +
                 "The scholarship's tenure is for the full period of the academic program for which the Undergraduate Scholar has enrolled, with the second and subsequent years dependent on satisfactory academic progress and co-curricular involvement.\n" +
                 "\n" +
                 "Tenure for the Honours level scholarships is one year. For Masters level the scholarships tenure is two years, dependent on academic progress and co-curricular participation of the Scholar.\n" +
                 "\n"+
                 "The Scholarship covers the following:\n" +
                 "\n"+
                 "1. Visa costs\n" +
                 "\n"+
                 "2. Transport costs to and from South Africa\n" +
                 "\n"+
                 "3. Full tuition and international student fees\n" +
                 "\n"+
                 "4. Full accommodation, subsistence and living expenses\n" +
                 "\n"+
                 "5. Research costs as approved or recommended by UCT and the Foundation\n" +
                 "\n"+
                 "6. Access to internship opportunities and cover of related costs\n" +
                 "\n"+
                 "7. Medical aid";

        LinearLayout overview=(LinearLayout)findViewById(R.id.overview_rootview);
        TextView macharia=new TextView(this);
        macharia.setText(name);
        ScrollView wade=new ScrollView(this);
        wade.addView(macharia);
        overview.addView(wade);
    }
}
