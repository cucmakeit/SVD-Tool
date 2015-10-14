package com.cc.svd.trainer;

/**
 * Created by ce on 2015/10/14.
 */
public interface Trainer {
    void loadFile(String mTrainFileName, String mTestFileName, String separator) throws Exception;

    void loadHisFile(String mHisFileName, String separator) throws Exception;

    void train(float gama, float alpha, int nInter);

    void predict(String mOutputFileName, String separator) throws Exception;
}
