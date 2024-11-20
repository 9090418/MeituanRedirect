package com.example.meituanredirect;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Redirect to the Meituan URL
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("imeituan://www.meituan.com/web?url=https://awp.meituan.com/payfe/union-pay-qrcode/index.html"));

        try {
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Close the activity after the redirect
        finish();
    }
}
