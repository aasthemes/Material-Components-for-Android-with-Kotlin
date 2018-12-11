package edu.stts.materialcomponents.activity.menu7

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import edu.stts.materialcomponents.R
import android.app.AlertDialog
import android.app.Dialog
import android.app.ProgressDialog
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.media.Image
import android.opengl.Visibility
import android.os.AsyncTask
import android.util.Base64
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import kotlinx.android.synthetic.main.activity_my_asy_progress_bar.*
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class myAsyProgressBar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_asy_progress_bar)

        val url = URL("https://4.bp.blogspot.com/-GVrZTJH1uoA/WeGTOaEu0ZI/AAAAAAAAgiw/TG32vFlBaSMCQ1vLmT4izkQ_YN5koOrbwCLcBGAs/s400/panderman3.jpg")

        myButton.setOnClickListener(){
            MyAsyncTask().execute(url)
        }
    }

    inner class MyAsyncTask : AsyncTask<URL, Int, String>() {

        private var result: String = "";

        override fun onPreExecute() {
            super.onPreExecute()
            progressBar.visibility = View.VISIBLE
        }

        val imageBytes = Base64.decode(String(),0)
        public var myBitmap = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.size)

        override fun doInBackground(vararg params: URL?): String {

            val connect = params[0]?.openConnection() as HttpURLConnection
            connect.readTimeout = 8000
            connect.connectTimeout = 8000
            connect.requestMethod = "GET"
            connect.connect();

            val responseCode: Int = connect.responseCode;
            if (responseCode == 200) {

                result = streamToString(connect.inputStream)
                myBitmap = BitmapFactory.decodeStream(connect.inputStream)
            }

            return result
        }

        override fun onProgressUpdate(vararg values: Int?) {
            super.onProgressUpdate(*values)
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            progressBar.visibility = View.GONE
            tv_result.text = result
        }
    }

    fun streamToString(inputStream: InputStream): String {

        val bufferReader = BufferedReader(InputStreamReader(inputStream))
        var line: String
        var result = ""

        try {
            do {
                line = bufferReader.readLine()
                if (line != null) {
                    result += line
                }
            } while (line != null)
            inputStream.close()
        } catch (ex: Exception) {

        }
        return result
    }
}
