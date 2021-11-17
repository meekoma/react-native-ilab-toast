
package com.reactlibrary;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNDemoModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNDemoModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNToast";
  }

  @ReactMethod
  public void showToast(String msg){
    Toast.makeText(getReactApplicationContext(), msg, Toast.LENGTH_LONG).show();
  }
}
