package com.frodo.android.app.framework.net;

import com.frodo.android.app.framework.exception.HttpException;
import com.frodo.android.app.framework.task.CallTask;

/**
 * Created by frodo on 2015/7/6.
 */
public abstract class NetworkCallTask<R> extends CallTask {

    public void onPreCall() {
    }

    public abstract R doBackgroundCall() throws HttpException;

    public abstract void onSuccess(R result);

    public abstract void onError(HttpException re);

    public void onFinished() {
    }

}
