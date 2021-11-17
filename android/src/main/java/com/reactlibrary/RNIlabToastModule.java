
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.widget.Toast;
public class RNIlabToastModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNIlabToastModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNIlabToast";
  }

   @ReactMethod
    public void showToast(String msg){
      Toast.makeText(getReactApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }
}
