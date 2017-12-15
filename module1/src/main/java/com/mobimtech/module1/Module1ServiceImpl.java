package com.mobimtech.module1;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mobimtech.router.Module1Service;
import com.mobimtech.router.RouterPath;

/**
 * Created by vulture on 2017/12/15.
 */
@Route(path = RouterPath.MODULE1String)
public class Module1ServiceImpl implements Module1Service {
    @Override
    public String getModule1ShareString() {
        return "module1 string";
    }

    @Override
    public void init(Context context) {

    }
}
