package edu.stts.materialcomponents.activity.menu7

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import edu.stts.materialcomponents.R
import android.webkit.WebSettings
import android.view.View.SCROLLBARS_INSIDE_OVERLAY
import android.webkit.WebView
import android.webkit.WebResourceRequest
import android.webkit.WebViewClient
import android.webkit.WebChromeClient
import android.support.v4.view.ViewCompat.setLayerType
import android.os.Build
import android.view.View


class WebViewWithProgressBar : AppCompatActivity() {

    var loading = ProgressBar(this)
    var websiteku = android.webkit.WebView(this)
    var URL = "http://sim.stts.edu/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_with_progress_bar)

        websiteku = findViewById(R.id.my_web)
        loading = findViewById(R.id.progress)
        settings()
        load_website()

    }

    private fun load_website() {
        if (Build.VERSION.SDK_INT >= 19) {
            websiteku.setLayerType(View.LAYER_TYPE_HARDWARE , null)
        } else {
            websiteku.setLayerType(View.LAYER_TYPE_SOFTWARE, null)
        }

        //Tambahkan WebChromeClient
        websiteku.webChromeClient = object : WebChromeClient() {
            override fun onProgressChanged(view: WebView, newProgress: Int) {
                //ProgressBar akan Terlihat saat Halaman Dimuat
                loading.visibility = View.VISIBLE
                loading.progress = newProgress
                if (newProgress == 100) {
                    //ProgressBar akan Menghilang setelah Valuenya mencapat 100%
                    loading.visibility = View.GONE
                }
                super.onProgressChanged(view, newProgress)
            }
        }

        websiteku.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest): Boolean {
                view.loadUrl(request.toString())
                return true
            }

            override fun onPageFinished(view: WebView, url: String) {
                //ProgressBar akan Menghilang setelah Halaman Selesai Dimuat
                super.onPageFinished(view, url)
                loading.visibility = View.GONE
            }
        }

        websiteku.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
        websiteku.loadUrl(URL)
    }

    private fun settings() {
        val web_settings = websiteku.getSettings()
        web_settings.setJavaScriptEnabled(true)
        web_settings.setAllowContentAccess(true)
        web_settings.setUseWideViewPort(true)
        web_settings.setLoadsImagesAutomatically(true)
        web_settings.setCacheMode(WebSettings.LOAD_NO_CACHE)
        web_settings.setRenderPriority(WebSettings.RenderPriority.HIGH)
        web_settings.setEnableSmoothTransition(true)
        web_settings.setDomStorageEnabled(true)
    }
}
