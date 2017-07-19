package songmofan.baway.com.myapplication.presenter;

import songmofan.baway.com.myapplication.view.iview.BaseView;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/7/17 21
 */

public abstract class BasePresenter<T extends BaseView> {
  //每一个继承BasePresenter的presenter都会重写这个方法 用来获取Model层的数据
    public abstract void getDatas();


    //atccach方法 获取接口 目的是将p层的数据回调给activity
    private   T mt;
    public void attach(T t){
        this.mt=t;
    }

    public  T  getBaseView(){
        return mt;
    }

}
