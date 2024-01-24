package ru.pseudonimb.onyxcalc

import android.app.Activity
import android.os.Bundle
import ru.pseudonimb.onyxcalc.databinding.ActivityMainBinding

@Suppress("DEPRECATION")
class MainActivity : Activity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        fragmentManager
            .beginTransaction()
            .add(R.id.fragment_home_container, HomeFragment())
            .addToBackStack(null)
            .commit()
    }
}