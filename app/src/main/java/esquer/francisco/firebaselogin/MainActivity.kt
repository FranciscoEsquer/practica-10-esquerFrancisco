 package esquer.francisco.firebaselogin

 import android.os.Binder
 import androidx.appcompat.app.AppCompatActivity
 import android.os.Bundle
 import com.google.firebase.auth.FirebaseAuth
 import com.google.firebase.auth.ktx.auth
 import com.google.firebase.ktx.Firebase
 import esquer.francisco.firebaselogin.R
 import esquer.francisco.firebaselogin.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {

     private lateinit var auth: FirebaseAuth
     private lateinit var binding: ActivityMainBinding

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)

         binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)

         auth = Firebase.auth
     }
 }