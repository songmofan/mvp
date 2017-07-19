package songmofan.baway.com.myapplication.model.util;


import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import songmofan.baway.com.myapplication.http.MyHttpClient;
import songmofan.baway.com.myapplication.http.MyOberser;
import songmofan.baway.com.myapplication.model.bean.HomeBean;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/7/17 11
 */

public abstract class BaseUtil {
    //网络请求
    public static void getTextFromeServer(final GetTexts getTexts) {
        MyHttpClient.getApiServer().getData()
                .subscribeOn(Schedulers.io())               //在IO线程进行网络请求
                .observeOn(AndroidSchedulers.mainThread())  //回到主线程去处理请求结果
                .subscribe(new MyOberser<HomeBean>() {
                    //成功的回调
                    @Override
                    public void onsucces(HomeBean homeBean) {
                        getTexts.takeBack(homeBean);
                    }

                    //失败的回调
                    @Override
                    public void fild() {

                    }
                });

    }

    //将数据回调给P层的接口
    public interface GetTexts {
        <T> void takeBack(T t);

    }

}


