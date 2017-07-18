package kelvinng2017.webview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends Activity {
    WebView mWebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Activity mActivity=this;
        super.onCreate(savedInstanceState);

        this.getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.activity_main);

        getWindow().setFeatureInt(Window.FEATURE_PROGRESS,Window.PROGRESS_VISIBILITY_ON);

        mWebview=(WebView)findViewById(R.id.webview);
        mWebview.getSettings().setJavaScriptEnabled(true);
        mWebview.loadUrl("https://weather.com/zh-TW/weather/hourbyhour/l/TWXX4175:1:TW");
        mWebview.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
    }
    private void TestUpload(){
        int i=1+1;
    }
}
