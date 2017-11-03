package com.example.think.filepreviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView mWebView;
    private String fileUrl = "http://119.37.192.234:9079/JDZJ/Resource/988202f2-5161-4bb5-a055-b89b328d620b.doc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebView = (WebView) findViewById(R.id.main_webview);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setSupportZoom(true);
        mWebView.getSettings().setBuiltInZoomControls(true);
        mWebView.getSettings().setUseWideViewPort(true);
        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
//        mWebView.loadUrl("http://docs.google.com/gview?embedded=true&url=" + fileUrl); //google官方预览，需要翻墙
        mWebView.loadUrl("http://ow365.cn/?i=12428&furl=" + fileUrl); //officeweb365形式预览，付费后可以去掉广告
 //       微软：https://view.officeapps.live.com/op/view.aspx?src= (输入你的文档在服务器中的地址)； 对文档格式有要求
    }

}

