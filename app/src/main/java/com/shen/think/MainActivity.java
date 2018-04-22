package com.shen.think;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.shen.think.find.FindViewById;
import com.shen.think.find.FindViewByIdLayout;
import com.shen.think.find.OnClick;
import com.shen.think.find.ViewUtils;

@FindViewByIdLayout(R.layout.activity_main)
public class MainActivity extends Activity {

    @FindViewById(R.id.show_content)
    TextView showContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ViewUtils.inject(this);
    }

    @OnClick(R.id.show_content)
    public void onClick(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }


}
