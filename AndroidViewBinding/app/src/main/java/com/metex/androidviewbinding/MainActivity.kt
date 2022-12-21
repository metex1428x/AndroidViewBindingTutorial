package com.metex.androidviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.metex.androidviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding               // bindingi tanımladık...

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)       // yukarıdaki linkte verilen kod satırlarını buraya ekledik...
        val view = binding.root
        setContentView(view)


    }


    fun isimDegistir(view:View){                                    // butona basıldığında çağıralan fonksiyonu tanımladık.
        binding.isim.text="isim değistirildi"                       // texti değiştirdik.
    }
}