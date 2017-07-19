package songmofan.baway.com.myapplication.http;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/7/18 19
 */

public class MyHttpClient {

    //私有的构造方法
    private MyHttpClient(){};

    public  static class Instence{
        private static  Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Contents.HOME_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }
public static ApiServer getApiServer(){

    return  Instence.retrofit.create(ApiServer.class);
}

}
