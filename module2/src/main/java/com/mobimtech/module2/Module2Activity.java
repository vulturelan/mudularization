package com.mobimtech.module2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mobimtech.module2.R;
import com.mobimtech.router.RouterPath;

@Route(path = RouterPath.MODULE2ACTIVITY)
public class Module2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2);
    }
}
