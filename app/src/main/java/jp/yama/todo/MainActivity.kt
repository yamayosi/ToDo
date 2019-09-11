package jp.yama.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import jp.yama.todo.Fragment.Outer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  fragment exec
        val fragmentManager = supportFragmentManager
        displayFragment(fragmentManager)

    }

    companion object{
        fun displayFragment(fragmentManager: FragmentManager){
            val fragmentTransaction = fragmentManager.beginTransaction()
            val fragment = Outer.newInstance("init", "fragment")
            fragmentTransaction.add(R.id.fragment_outer, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
    }
}
