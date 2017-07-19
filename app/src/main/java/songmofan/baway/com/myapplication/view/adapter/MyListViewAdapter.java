package songmofan.baway.com.myapplication.view.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;
import java.util.List;

import songmofan.baway.com.myapplication.R;
import songmofan.baway.com.myapplication.model.bean.HomeBean;


/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/7/18 15
 */

public class MyListViewAdapter extends BaseAdapter {

    private List<HomeBean.ResultBean.DataBean> list=new ArrayList<>();
    private  Context contexts;
    public MyListViewAdapter(Context context){
        this.contexts=context;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null) {
            convertView=convertView.inflate(contexts, R.layout.listview_item,null);
        }
        TextView te= (TextView) convertView.findViewById(R.id.text1);
        ImageView im= (ImageView) convertView.findViewById(R.id.im);
        te.setText(list.get(position).getAuthor_name());
        Glide.with(contexts)
                .load(list.get(position).getThumbnail_pic_s())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(im);
        return convertView;
    }
    public  void setData(List<HomeBean.ResultBean.DataBean> data){
        if (data!=null) {
            list.addAll(data);
        }
    }
}
