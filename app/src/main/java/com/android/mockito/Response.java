package com.android.mockito;


public interface Response {
    void onRequestCompleted(boolean isSuccess, String data);
}
