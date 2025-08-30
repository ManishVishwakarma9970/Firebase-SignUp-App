package com.example.splashscreen

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import org.w3c.dom.Text

class SignUp : AppCompatActivity() {
// lateinit ka mtlb baad me initialize karenge  ...
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val signButton = findViewById<Button>(R.id.btnSignUp)
        val etName = findViewById<TextInputEditText>(R.id.etUsername)
        val etMail = findViewById<TextInputEditText>(R.id.etEmail)
        val userId = findViewById<TextInputEditText>(R.id.untxt)  // fixed id
        val userPassword = findViewById<TextInputEditText>(R.id.etPassword)

//  data store kar rahe hai ----
        signButton.setOnClickListener {
            val name = etName.text.toString()
            val mail = etMail.text.toString()
            val uniqueId = userId.text.toString()
            val password = userPassword.text.toString()


//            Creating an Object of user.kt class ---
            val user = User(name, mail, password, uniqueId)

            // Get reference to "Users" node in Firebase
            database = FirebaseDatabase.getInstance().getReference("Users")
            // child me values set ho jaaye..
            database.child(uniqueId).setValue(user).addOnSuccessListener {
//                form submit karne ke baad clear ho jaayega sab ...
                etName.text?.clear()
                etMail.text?.clear()
                userId.text?.clear()
                userPassword.text?.clear()

                Toast.makeText(this, "User Registered", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this,"Failed", Toast.LENGTH_SHORT).show()
            }
            }
        }
    }
