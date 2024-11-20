package com.example.meituanredirect;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // 跳转到指定的 URL
        Uri uri = Uri.parse("imeituan://www.meituan.com/web?url=https://awp.meituan.com/payfe/union-pay-qrcode/index.html");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

        // 关闭当前的 MainActivity
        finish();
    }
}
