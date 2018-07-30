package com.hexingbo.backgroundvideo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

/**
 * 作者：贺兴波
 * 时间：2018/7/30
 * 描述：FullScreenVideoView
 */

public class FullScreenVideoView extends VideoView {
    public FullScreenVideoView(Context context) {
        super(context);
    }

    public FullScreenVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FullScreenVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    // 实现全屏,重新计算高度和宽度

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
    {
        int width = getDefaultSize(0, widthMeasureSpec);
        int height = getDefaultSize(0, heightMeasureSpec);
        setMeasuredDimension(width, height);
    }
}