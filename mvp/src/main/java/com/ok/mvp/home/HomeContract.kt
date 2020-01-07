package com.ok.mvp.home

import com.ok.mvp.base.BasePresenter
import com.ok.mvp.base.BaseView

/**
 * @Author:   yangxume@gmail.com
 * @Time:     2020-01-07 16:48
 * @Desc:
 *
 */
interface HomeContract {

    interface View : BaseView {

    }

    interface Presenter: BasePresenter<View> {

    }
}