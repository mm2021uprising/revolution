package io.github.revolution.feature.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.github.revolution.databinding.ActivityHomeBinding

/**
 * Created by aunkhtoo on 3/13/21
 **/

class HomeActivity : AppCompatActivity() {

  private val binding: ActivityHomeBinding by lazy {
    ActivityHomeBinding.inflate(layoutInflater)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(binding.root)
  }

}