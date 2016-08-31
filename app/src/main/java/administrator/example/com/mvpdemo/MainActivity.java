package administrator.example.com.mvpdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import administrator.example.com.mvpdemo.view.InputKeyBoardView;
import administrator.example.com.mvpdemo.view.MainView;
import butterknife.Bind;
import butterknife.ButterKnife;
import rx.Observable;
import rx.Subscriber;

public class MainActivity extends Activity implements InputKeyBoardView.OnClickNumber {

    @Bind(R.id.button)
    Button button;
    @Bind(R.id.ibv)
    InputKeyBoardView ibv;
    @Bind(R.id.tv)
    TextView tv;

    //    @BindView(R.id.button)
//    Button button;
    private Observable mObservable;
    private Subscriber mObserver;
    private String tvString = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();

    }

    private void initView() {
        ibv.setOnClickNumber(this);
    }

//    @Override
//    public void setText(String str) {
//
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//    }
//
//
//    public void createObservable() {
//        mObservable = Observable.create(new Observable.OnSubscribe<String>() {
//            @Override
//            public void call(Subscriber<? super String> subscriber) {
//                subscriber.onNext("longjainnnnnnnnnnnnnn");
//                subscriber.onCompleted();
//            }
//        });
//    }
//
//    public void createObserver() {
//
//        mObserver = new Subscriber<String>() {
//            @Override
//            public void onCompleted() {
//                Log.e("LOngjian", "wan");
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                Log.e("LOngjian", "error");
//            }
//
//            @Override
//            public void onNext(String o) {
//                Log.e("LOngjian", o);
//            }
//        };
//
//    }


    @Override
    public void sendTxt(int number) {
        if (number == 200) {
            Toast.makeText(this, "提交" + number, Toast.LENGTH_LONG).show();
        } else if (number == -1) {
            Toast.makeText(this, "退格" + number, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "设置数据" + number, Toast.LENGTH_LONG).show();
            tvString += number;
           setTextView(tvString);


        }

    }

    public void setTextView(String textView) {
        tv.setText(textView);
    }
}
