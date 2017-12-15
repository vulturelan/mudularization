package com.mobimtech.router;

import android.support.v4.app.Fragment;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * Created by vulture on 2017/12/15.
 */

public interface Module1Service extends IProvider{
    String getModule1ShareString();
}
