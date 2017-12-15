package com.mobimtech.componenttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.mobimtech.router.Module1Service;
import com.mobimtech.router.RouterPath;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.text);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(RouterPath.MAIN2ACTIVITY).navigation();
            }
        });

        findViewById(R.id.module).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(RouterPath.MODULE1ACTIVITY).navigation();
            }
        });

        findViewById(R.id.module_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = (Fragment) ARouter.getInstance().build(RouterPath.MODULE1Fragment).navigation();
                if (fragment != null) {
                    getSupportFragmentManager().beginTransaction().add(R.id.container, fragment).commit();
                }
            }
        });

        findViewById(R.id.module_share).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Module1Service module1Service = (Module1Service) ARouter.getInstance().build(RouterPath.MODULE1String).navigation();
                textView.setText(module1Service.getModule1ShareString());
            }
        });

    }
}
