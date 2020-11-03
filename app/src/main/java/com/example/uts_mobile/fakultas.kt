package com.example.uts_mobile

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail.*
class FacDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail)
        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var imgF = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var nameF =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var deskF =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var deskS =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)
            logoupn.setImageResource(imgF)
            tv_nama_fakultas.text = nameF
            tv_deskripsi.text = deskF
            tv_prodi.text = deskS
        }
    }
}
