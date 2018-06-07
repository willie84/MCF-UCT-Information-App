/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.user.mcfuct;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the overview category
        TextView overview = (TextView) findViewById(R.id.overview);

        // Set a click listener on that View
        overview.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the overview category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link OverviewActivity}
                Intent overviewIntent = new Intent(MainActivity.this, OverviewActivity.class);
                Toast.makeText(view.getContext(), "opening the program overview", Toast.LENGTH_SHORT).show();
                // Start the new activity
                startActivity(overviewIntent);
            }
        });

        // Find the View that shows the administration category
        TextView admin = (TextView) findViewById(R.id.admin);

        // Set a click listener on that View
        admin.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AdminActivity}
                Intent adminIntent = new Intent(MainActivity.this, AdminActivity.class);
                Toast.makeText(view.getContext(), "opening the administration folder", Toast.LENGTH_SHORT).show();
                // Start the new activity
                startActivity(adminIntent);
            }
        });

        // Find the View that shows the finance category
        TextView finance = (TextView) findViewById(R.id.finance);

        // Set a click listener on that View
        finance.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FinanceActivity}
                Intent financeIntent = new Intent(MainActivity.this, FinanceActivity.class);
                Toast.makeText(view.getContext(), "opening the Finance folder", Toast.LENGTH_SHORT).show();
                // Start the new activity
                startActivity(financeIntent);
            }
        });

        // Find the View that shows the leadership category
        TextView leadership = (TextView) findViewById(R.id.leadership);

        // Set a click listener on that View
        leadership.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the leadership category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LeadershipActivity}
                Intent LeadershipIntent = new Intent(MainActivity.this, LeadershipActivity.class);
                Toast.makeText(view.getContext(), "opening the Leadership folder", Toast.LENGTH_SHORT).show();
                // Start the new activity
                startActivity(LeadershipIntent);
            }
        });

        TextView internship = (TextView) findViewById(R.id.internship);

        // Set a click listener on that View
        internship.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Internship category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Internship}
                Intent InternshipIntent = new Intent(MainActivity.this, Internship.class);
                Toast.makeText(view.getContext(), "opening the internship overview", Toast.LENGTH_SHORT).show();
                // Start the new activity
                startActivity(InternshipIntent);
            }
        });
    }}



