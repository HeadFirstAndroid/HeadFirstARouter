package me.yifeiyuan.hf.arouter

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.callback.NavigationCallback
import com.alibaba.android.arouter.launcher.ARouter
import me.yifeiyuan.hf.base.AService

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupARouter()
    }

    private fun setupARouter() {

    }

    fun goToModuleA(view: View) {
        ARouter.getInstance().build("/a/modulea").navigation(this, object : NavigationCallback {
            override fun onFound(postcard: Postcard?) {
                Log.d(TAG, "onFound() called with: postcard = $postcard")
            }

            override fun onLost(postcard: Postcard?) {
                Log.d(TAG, "onLost() called with: postcard = $postcard")
            }

            override fun onArrival(postcard: Postcard?) {
                Log.d(TAG, "onArrival() called with: postcard = $postcard")
            }

            override fun onInterrupt(postcard: Postcard?) {
                Log.d(TAG, "onInterrupt() called with: postcard = $postcard")
            }
        })
    }

    fun goToModuleB(view: View) {
        ARouter.getInstance().build("/b/moduleb").navigation()
    }

    fun getAService(view: View) {
//        val service = ARouter.getInstance().navigation(AService::class.java) //这个 也行
        val service = ARouter.getInstance().build("/base/aservice").navigation() as AService
        val response = service.request()
        Toast.makeText(this, response, Toast.LENGTH_SHORT).show()
    }

    fun deeplink(view: View) {
        val intent = Intent(Intent.ACTION_VIEW)
        val uri = Uri.parse("https://www.example.com/b/moduleb")
        intent.setData(uri)
        val chooser = Intent.createChooser(intent,"")
        startActivity(chooser)
    }

}