package com.android.internal.telephony;

/**
 * Created by User on 2/21/2015.
 */
public interface ITelephony {
    boolean endCall();
    void answerRingingCall();
    void silenceRinger();
}
