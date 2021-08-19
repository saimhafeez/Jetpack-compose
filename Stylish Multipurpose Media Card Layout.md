# STYLISH MULTIPURPOSE MEDIA LAYOUT

## Made by Saim Hafeez | MrHacktivist

### Visit [saimhafeez.com](www.saimhafeez.com) for more Tutorials

### Visit [Here](https://saimhafeez.com/android-section/jetpack-compose/stylish-multipurpose-card-jetpack-compose/) for Explanation of this Compose layout.

# Complete Code Given Below

```java
@Composable
fun Media_card(
    /* Parameters */
    media_cover: Painter,
    media_title: String,
    media_length: String,
    media_year: String,
    media_quality: String,
    media_type: String)
{

    Card(modifier = Modifier
        .fillMaxSize(0.5f)
        .height(250.dp)
        .padding(2.dp))
    {
        Column(modifier = Modifier
            .background(Color.Black),
        verticalArrangement = Arrangement.SpaceBetween)
        {
            /* Cover Image and Top Right Quality Tag */
            Row(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.6f),
                verticalAlignment = Alignment.Top
            ) {
                Box(){
                    /* COVER IMAGE */
                    Image(painter = media_cover,
                        contentDescription = "Media Cover",
                        contentScale = ContentScale.Crop)
                    /* Quality White TAG Box ~Top Right~  */
                    Text(text = media_quality,
                        style = TextStyle(Color.Black),
                        modifier = Modifier
                            .padding(0.dp, 5.dp, 5.dp, 0.dp)
                            .clip(RoundedCornerShape(6.dp))
                            .background(Color.White)
                            .padding(5.dp, 0.dp, 5.dp, 0.dp)
                            .align(Alignment.TopEnd),
                    )
                }

            }

            /* Title */
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(0.5.dp, 0.dp, 0.5.dp, 0.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                    Text(text = media_title,
                        style = TextStyle(Color.White, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold),
                        maxLines = 2)
            }

            /* Media Year and Length Info Box */
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp, 0.dp, 5.dp, 0.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column() {
                    Text(text = "● $media_year", style = TextStyle(Color.White))
                }
                Column() {
                    Text(text = "● $media_length", style = TextStyle(Color.White))
                }
            }

            /* Media Type Box */
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 0.dp, 5.dp, 5.dp),
                horizontalArrangement = Arrangement.End
                ){
                Text(text = media_type,
                    style = TextStyle(Color.White),
                    maxLines = 1,
                    modifier = Modifier
                        .border(2.dp, Color.White)
                        .padding(5.dp)
                )
            }
        }
    }
}
```
