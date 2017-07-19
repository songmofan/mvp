package songmofan.baway.com.myapplication.http;

import io.reactivex.Observable;
import retrofit2.http.GET;
import songmofan.baway.com.myapplication.model.bean.HomeBean;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/7/18 19
 */

public interface ApiServer {
    @GET("k2BaduF2a6caa275f395919a66ab1dfe4b584cc60685573?uri=gj")
    Observable<HomeBean> getData();

//    //获取豆瓣Top250 榜单
//    @FormUrlEncoded
//    @POST("top250")
//    Call<HomeBean> getTop250(@Field("start") int start, @Field("count") int count);
}
