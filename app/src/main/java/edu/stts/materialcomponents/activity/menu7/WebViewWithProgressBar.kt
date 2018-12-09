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
import android.content.Context
import android.graphics.Bitmap
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.activity_web_view_with_progress_bar.*

class WebViewWithProgressBar : AppCompatActivity() {


    var url = "https://google.com"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_with_progress_bar)


        val settings = web_view.settings

        settings.javaScriptEnabled = true

        settings.setAppCacheEnabled(true)
        settings.cacheMode = WebSettings.LOAD_DEFAULT
        settings.setAppCachePath(cacheDir.path)


        settings.setSupportZoom(true)
        settings.builtInZoomControls = true
        settings.displayZoomControls = true


        settings.textZoom = 100


        settings.blockNetworkImage = false
        settings.loadsImagesAutomatically = true


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            settings.safeBrowsingEnabled = true
        }

        settings.useWideViewPort = true
        settings.loadWithOverviewMode = true
        settings.javaScriptCanOpenWindowsAutomatically = true
        settings.mediaPlaybackRequiresUserGesture = false


        settings.domStorageEnabled = true
        settings.setSupportMultipleWindows(true)
        settings.loadWithOverviewMode = true
        settings.allowContentAccess = true
        settings.setGeolocationEnabled(true)
        settings.allowUniversalAccessFromFileURLs = true
        settings.allowFileAccess = true

        web_view.fitsSystemWindows = true

        web_view.setLayerType(View.LAYER_TYPE_HARDWARE, null)

        web_view.webViewClient = object: WebViewClient(){
            override fun onPageStarted(view: WebView, url: String, favicon: Bitmap?) {
                toast("Sedang diproses...")
                button_back.isEnabled = web_view.canGoBack()
                button_forward.isEnabled = web_view.canGoForward()
            }

            override fun onPageFinished(view: WebView, url: String) {
                toast("Halaman berhasil ditampilkan: ${view.title}")
                progress_bar.progress = 0
                button_back.isEnabled = web_view.canGoBack()
                button_forward.isEnabled = web_view.canGoForward()
            }
        }

        web_view.webChromeClient = object: WebChromeClient(){
            override fun onProgressChanged(view: WebView, newProgress: Int) {
                progress_bar.progress = newProgress
            }
        }

        button_load.setOnClickListener{
            var temp: String = ""
            temp = editTextUrl.text.toString()
            url = "https://$temp"
            web_view.loadUrl(url)
        }

        button_back.setOnClickListener{
            if(web_view.canGoBack()){
                web_view.goBack()
            }
        }

        button_forward.setOnClickListener{
            if(web_view.canGoForward()){
                web_view.goForward()
            }
        }
    }


    private fun showAppExitDialog() {
        val builder = AlertDialog.Builder(this)

        builder.setTitle("Konfirmasi")
        builder.setMessage("Anda yakin mau keluar?")
        builder.setCancelable(true)

        builder.setPositiveButton("Ya", { _, _ ->
            super@WebViewWithProgressBar.onBackPressed()
        })

        builder.setNegativeButton("Tidak", { _, _ ->
            toast("Terima kasih")
        })

        val dialog = builder.create()

        dialog.show()
    }

    override fun onBackPressed() {
        if (web_view.canGoBack()) {
            web_view.goBack()
            toast("Kembali ke history penelusuran")
        } else {
            showAppExitDialog()
        }
    }
}

fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

