package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.EdgeInsets
import androidx.ui.layout.LayoutWidth
import androidx.ui.material.MaterialTheme
import androidx.ui.material.ripple.Ripple
import androidx.ui.material.surface.Card
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                populatetUser()
            }
        }
    }

    @Preview
    @Composable
    private fun populatetUser() {
       setupList(UserDataSource.getUsers())
    }

    @Composable
    private fun setupList(users: List<User>) {

        VerticalScroller {
            Column {
                users.let {
                    it?.forEach{ user ->
                        printUser(user)
                    }
                }
            }
        }
    }

    @Composable
    private fun printUser(user: User) {

        Ripple(bounded = true) {

            Clickable(onClick = {Toast.makeText(this@UserActivity,"You click on name ${user.name}", Toast.LENGTH_SHORT).show()}){

                Card {
                    Container(padding = EdgeInsets(16.dp), modifier = LayoutWidth.Fill, alignment = Alignment.CenterStart) {

                        Column {
                            Text(text = user.name, style = MaterialTheme.typography().h6)
                            Text(text = user.email, style = MaterialTheme.typography().body1)

                        }
                    }
                }
            }

        }


    }
}