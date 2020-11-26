package me.yifeiyuan.hf.arouter

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter


class DeepLinkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deep_link)

        val uri: Uri? = intent.data
        ARouter.getInstance().build(uri).navigation()

    }
}