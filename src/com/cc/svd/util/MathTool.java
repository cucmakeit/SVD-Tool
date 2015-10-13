package com.cc.svd.util;

/**
 * Created by ce on 2015/10/13.
 */
public class MathTool {
    private static MathTool mt;

    private MathTool() {}

    public static MathTool getInstance() {
        if (mt == null) {
            synchronized (MathTool.class) {
                if (mt == null)
                    mt = new MathTool();
            }
        }
        return mt;
    }

    public float getInnerProduct(float[] x, float[] y) {
        float result = 0;
        for (int i = 0; i < x.length; i++) {
            result += x[i] * y[i];
        }
        return result;
    }
}
