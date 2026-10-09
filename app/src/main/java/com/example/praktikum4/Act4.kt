package com.example.praktikum4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AktivitasPertama(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(R.color.screen_bg))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(
                    start = 20.dp,
                    end = 20.dp,
                    top = 30.dp,
                    bottom = 65.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.judul),
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(R.color.judul_color),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = stringResource(R.string.subjudul),
                fontSize = 14.sp,
                color = colorResource(R.color.subjudul_color),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(25.dp))

            CardKarakter(
                gambarKarakter = R.drawable.phoebe,
                gambarElemen = R.drawable.spectro,
                nama = R.string.nama_1,
                informasi = R.string.informasi_1,
                elemen = R.string.elemen_1,
                warna = R.color.card_1_bg
            )

            Spacer(modifier = Modifier.height(15.dp))

            CardKarakter(
                gambarKarakter = R.drawable.denia,
                gambarElemen = R.drawable.fusion,
                nama = R.string.nama_2,
                informasi = R.string.informasi_2,
                elemen = R.string.elemen_2,
                warna = R.color.card_2_bg
            )

            Spacer(modifier = Modifier.height(15.dp))


            CardKarakter(
                gambarKarakter = R.drawable.cartethyia,
                gambarElemen = R.drawable.aero,
                nama = R.string.nama_3,
                informasi = R.string.informasi_3,
                elemen = R.string.elemen_3,
                warna = R.color.card_3_bg
            )

            Spacer(modifier = Modifier.height(15.dp))


            CardKarakter(
                gambarKarakter = R.drawable.hiyuki,
                gambarElemen = R.drawable.glacio,
                nama = R.string.nama_4,
                informasi = R.string.informasi_4,
                elemen = R.string.elemen_4,
                warna = R.color.card_4_bg
            )
        }

        Text(
            text = stringResource(R.string.copyright),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .background(colorResource(R.color.screen_bg))
                .padding(12.dp),
            color = colorResource(R.color.copyright_color),
            fontSize = 12.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun CardKarakter(
    gambarKarakter: Int,
    gambarElemen: Int,
    nama: Int,
    informasi: Int,
    elemen: Int,
    warna: Int
) {
    Card (
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(warna)
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp
        )
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            Image(
                painter = painterResource(gambarKarakter),
                contentDescription = stringResource(nama),
                modifier = Modifier.size(85.dp),
                contentScale = ContentScale.Crop
            )


            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(nama),
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.card_text)
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = stringResource(informasi),
                    fontSize = 12.sp,
                    color = colorResource(R.color.card_text)
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = stringResource(elemen),
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.card_text)
                )
            }


            Image(
                painter = painterResource(gambarElemen),
                contentDescription = stringResource(elemen),
                modifier = Modifier.size(55.dp),
                contentScale = ContentScale.Fit
            )
        }
    }
}