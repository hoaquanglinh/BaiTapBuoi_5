package com.example.baitapbuoi_5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import coil.compose.AsyncImage

class Bai5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GetLayout("Thanh toan")
        }
    }

    @Preview
    @Composable
    fun GetLayout(title: String = "Thanh toan") {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.DarkGray)
                .padding(10.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(10.dp)
            ) {
                val LightOrange = Color(0xFFFFA726)

                GetTextTitle(title = title)

                Text(
                    text = "Dia chi nhan hang",
                    Modifier
                        .align(Alignment.Start)
                        .padding(0.dp, 2.dp, 0.dp, 10.dp),
                    fontSize = 16.sp,
                    color = Color.White
                )

                Row(

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = "ten anh",
                        modifier = Modifier
                            .width(60.dp)
                            .height(110.dp)
                            .padding(0.dp, 20.dp, 0.dp, 20.dp)
                            .align(Alignment.CenterVertically)
                    )
                    Column {
                        GetText(title = "Tri | 2222")
                        GetText(title = "22/333 duong Trung My Tay 1")
                        GetText(title = "Phuong Tan Thoi Nhat")
                        GetText(title = "quan 12, Thanh pho Ho Chi Minh")
                    }
                }

                Text(
                    text = "Vui long chon mot trong nhung phuong thuc sau:",
                    color = Color.White,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(0.dp, 2.dp, 0.dp, 10.dp),

                    )

                GetRowItem(
                    color = LightOrange,
                    "https://upload.wikimedia.org/wikipedia/commons/a/a4/Paypal_2014_logo.png",
                    "Paypal"
                )
                GetRowItem(
                    color = Color(0xFFFF4081),
                    "https://upload.wikimedia.org/wikipedia/vi/f/fe/MoMo_Logo.png",
                    "Momo"
                )
                GetRowItem(
                    color = Color(0xFF03A9F4),
                    "https://inkythuatso.com/uploads/images/2021/12/vnpay-logo-inkythuatso-01-13-16-26-42.jpg",
                    "Vn pay"
                )
                GetRowItem(
                    color = Color.Blue,
                    "https://cdn.haitrieu.com/wp-content/uploads/2022/10/Logo-ZaloPay-Square.png",
                    "Zalo pay"
                )

            }

            Button(
                onClick = {  },
                modifier = Modifier
                    .width(350.dp)
                    .height(70.dp)
                    .align(Alignment.BottomCenter)
            ) {
                Text(text = "Tiếp Theo")
            }

        }
    }

    @Composable
    fun GetRowItem(color: Color, linkImage: String, noidungtext: String) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(5.dp)
                .background(color = color, shape = RoundedCornerShape(15.dp))
                .height(75.dp)
                .fillMaxWidth()
        ) {

            AsyncImage(
                model = linkImage,
                modifier = Modifier
                    .width(70.dp)
                    .padding(10.dp),
                contentDescription = null
            )

            Text(
                text = noidungtext,
                modifier = Modifier
                    .weight(2f)
                    .padding(50.dp, 0.dp, 0.dp, 0.dp),
                fontSize = 18.sp,
                color = Color.White
            )

            RadioButton(selected = false, onClick = { /*TODO*/ })
        }
    }

    @Composable
    fun GetTextTitle(title: String) {
        Text(
            text = title,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            fontSize = 30.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }

    @Composable
    fun GetText(title: String) {
        Text(
            text = title,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp, 3.dp, 0.dp, 0.dp),
            fontSize = 15.sp,
            color = Color.White
        )
    }

}