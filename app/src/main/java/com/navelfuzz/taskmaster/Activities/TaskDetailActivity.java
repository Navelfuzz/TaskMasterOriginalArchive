package com.navelfuzz.taskmaster.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


import com.navelfuzz.taskmaster.MainActivity;
import com.navelfuzz.taskmaster.R;

public class TaskDetailActivity {
    @Override
    protected void onCreate(BundlesavedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_detail);

        setupTaskNameTextView();
    }

    void setupTaskNameTextView() {
        Intent intent = getIntent();
        String taskName = intent.getStringExtra(MainActivity.TASK_NAME);
        TextView taskNameTextView = findViewById(R.id.taskNameTextView);
        taskNameTextView.setText(taskName);
    }

}
