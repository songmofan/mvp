package songmofan.baway.com.myapplication.http;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/7/17 16
 */

public  abstract class MyOberser<T> implements Observer<T> {
    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(T t) {
     onsucces(t);
    }

    @Override
    public void onError(Throwable e) {
        fild();
    }

    @Override
    public void onComplete() {

    }


   public abstract void onsucces(T t);
    public abstract void fild();
}
