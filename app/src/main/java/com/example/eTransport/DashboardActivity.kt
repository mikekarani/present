package com.example.eTransport

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView
import android.content.Context


class DashboardActivity : AppCompatActivity() {

    lateinit var home:CardView
    lateinit var chat:CardView
    lateinit var profile:CardView
    lateinit var widgets:CardView
    lateinit var settings: CardView
    lateinit var logout:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        home=findViewById(R.id.cardHome)
        chat=findViewById(R.id.cardChat)
        profile=findViewById(R.id.cardProfile)
        widgets=findViewById(R.id.cardWidgets)
        settings=findViewById(R.id.cardSettings)
        logout=findViewById(R.id.cardLogout)

        home.setOnClickListener {
            Toast.makeText(applicationContext,"You have clicked Home", Toast.LENGTH_LONG).show()
            val intent= Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        chat.setOnClickListener {
            Toast.makeText(applicationContext,"You have clicked Home",Toast.LENGTH_LONG).show()
            val intent= Intent(this, ChatActivitty::class.java)
            startActivity(intent)
        }
        profile.setOnClickListener {
            Toast.makeText(applicationContext,"You have clicked profile",Toast.LENGTH_LONG).show()
            val intent= Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
        widgets.setOnClickListener {
            Toast.makeText(applicationContext,"You have clicked widgets",Toast.LENGTH_LONG).show()
            val intent= Intent(this, payment::class.java)
            startActivity(intent)

        }
        settings.setOnClickListener {
            Toast.makeText(applicationContext,"You have clicked on settings",Toast.LENGTH_LONG).show()
            val intent= Intent(this, ServicesActivity::class.java)
            startActivity(intent)
        }
        fun clearUserSession() {
            TODO("Not yet implemented")
        }
        logout.setOnClickListener {
            Toast.makeText(applicationContext,"You have just Logged out",Toast.LENGTH_LONG).show()

            // Function to log out the user
            fun logoutUser(context: Context) {
                // Clear user session or authentication token, if any
                clearUserSession()

                // Redirect the user to the login screen
                val intent = Intent(context, LoginActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(intent)
                (context as Activity).finish()
            }



        }


    }
}