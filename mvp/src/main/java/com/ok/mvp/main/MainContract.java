package com.ok.mvp.main;


import com.ok.mvp.base.BasePresenter;
import com.ok.mvp.base.BaseView;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class MainContract {
    interface View extends BaseView {
        
    }

    interface  Presenter extends BasePresenter<View> {
        
    }
}
