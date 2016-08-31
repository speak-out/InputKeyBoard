package administrator.example.com.mvpdemo.prevent;

import administrator.example.com.mvpdemo.base.BaseView;
import administrator.example.com.mvpdemo.moudle.MainModleinterface;
import administrator.example.com.mvpdemo.view.MainView;

/**
 * Created by yuer on 2016/8/29.
 */
public class MainPresernt implements MainModleinterface{
    public MainView mainView;



    public void  attch(MainView baseView){
        mainView = baseView;
    }
    public void request(){

    }

    @Override
    public void Onsucces() {
        mainView.setText("wangxiaoer");

    }

    @Override
    public void OnError() {

    }

    @Override
    public void Oncmplete() {

    }
}
