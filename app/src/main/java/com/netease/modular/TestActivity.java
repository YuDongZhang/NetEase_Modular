package com.netease.modular;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.netease.common.utils.Cons;
import com.netease.modular.api.ParameterLoad;
import com.netesea.modular.annotation.ARouter;
import com.netesea.modular.annotation.Parameter;

@ARouter(path = "/app/TestActivity")
public class TestActivity extends AppCompatActivity {

    @Parameter
    String username;

    @Parameter
    boolean gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        ParameterLoad parameter = new TestActivity$$Parameter();
        parameter.loadParameter(this);

        Log.e(Cons.TAG, "onCreate: name->"+username+" gender->"+gender);
    }
}