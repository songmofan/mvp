package songmofan.baway.com.myapplication.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import java.util.List;

import songmofan.baway.com.myapplication.R;
import songmofan.baway.com.myapplication.model.bean.HomeBean;
import songmofan.baway.com.myapplication.presenter.HomePresenter;
import songmofan.baway.com.myapplication.view.adapter.MyListViewAdapter;
import songmofan.baway.com.myapplication.view.iview.HomeView;

public class MainActivity extends BaseAcyivity implements HomeView<HomeBean> {

    private ListView lv;
    private MyListViewAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    protected void initData() {
        HomePresenter presenter = new HomePresenter();
        presenter.attach(this);
        presenter.getDatas();
    }

    //实例化控件
    @Override
    protected void initView() {
        lv = (ListView) findViewById(R.id.lv);
        adapter = new MyListViewAdapter(MainActivity.this);
        lv.setAdapter(adapter);

    }


    @Override
    public void callBack(HomeBean homeBean) {
        List<HomeBean.ResultBean.DataBean> data = homeBean.getResult().getData();
        adapter.setData(data);
        adapter.notifyDataSetChanged();

    }

    @Override
    public void callBackErro(int code, String msg) {

    }
}
