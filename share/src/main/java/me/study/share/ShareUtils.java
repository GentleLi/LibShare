package me.study.share;

import android.content.Context;
import android.util.Log;

public class ShareUtils {

    private static final String TAG = ShareUtils.class.getSimpleName();
    private static ShareUtils mInstance;
    private Context mContext;

    private ShareUtils() {
    }

    public static ShareUtils getmInstance() {
        if (mInstance == null) {
            synchronized (ShareUtils.class) {
                if (null == mInstance) {
                    mInstance = new ShareUtils();
                }
            }
        }
        return mInstance;
    }


    public void init(Context context) {
        if (null == context) {
            return;
        }
        mContext = context.getApplicationContext();
        Log.e(TAG, "初始化");
    }


    public void doShare(String platformName, int platformId) {
        Log.e(TAG, "\n platformName : " + platformName + "\n platformId : " + platformId);
    }
}
