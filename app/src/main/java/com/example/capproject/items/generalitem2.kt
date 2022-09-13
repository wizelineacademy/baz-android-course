package com.example.capproject.items

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.capproject.viewmodels.BitsoViewModel
import com.example.capproject.models.Book.Payload
import com.example.capproject.support.icon
import com.example.capproject.support.shortToken


//item informativo divisas
@Composable
fun Generalitem2(
    viewModel: BitsoViewModel,
    list: Payload,
    navController: NavHostController
) {

    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(2.dp)
        .clickable  {
                      viewModel.setCoinInfo(list.book)
                      navController.navigate("details")
                    },
        ) {
        Card(modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(4.dp)),
            border = BorderStroke(width = 2.dp, Color.Black)) {
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
              , horizontalArrangement = Arrangement.Start)
            {
                Box(modifier = Modifier
                    .width(63.dp)
                    .height(72.dp)
                )
                {
                    Column(modifier = Modifier.padding(top=8.dp, start = 8.dp), verticalArrangement = Arrangement.Top
                        , horizontalAlignment = Alignment.CenterHorizontally)

                    {
                        Image(modifier = Modifier.padding(4.dp),painter = painterResource(id = icon(list.book)), contentDescription = null)
                        Text(text = shortToken(list.book), modifier = Modifier.padding(start = 8.dp))
                    }
                }
                Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.Start, modifier = Modifier.padding(start = 40.dp)) {
                    Text(text = "Maximo Historico \$${list.maximum_price} ",
                                               modifier = Modifier.padding(start = 16.dp))
                    Text(text = "Minimo  Historico \$${list.minimum_price} ",
                        modifier = Modifier.padding(start = 16.dp, top = 2.dp))
                }
            }
        }
    }
}

