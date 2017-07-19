package songmofan.baway.com.myapplication.view.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 类的作用： BaseActivity 每一个Activity继承他并重写他的方法
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：为了使代码更简洁  将每次都会做的操作封装到base里面
 * <p>
 * on 2017/7/17 21
 */

public abstract class BaseAcyivity extends AppCompatActivity {

    private Context context;
    private Activity activity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        init();
        initView();
        initData();

    }
    //初始化数据的方法
    protected abstract void initData();
    //初始化view的方法
    protected abstract void initView();
    //设置布局的方法
    protected abstract int getLayoutId();

// 获取上下文，和当前activity的方法  并将activity放进MyApplication的集合中
    private void init() {
        context= getApplicationContext();
        activity=this;
       // MyApplication.getInstance().addActivity(this);
    }
//生命周期
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
//在销毁的方法 里将MyApplication的集合中activity删除
    @Override
    protected void onDestroy() {
        super.onDestroy();
      //  MyApplication.getInstance().delActicity(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }


}
