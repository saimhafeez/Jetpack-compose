/**
 * Created by saimhafeez|MrHacktivist.
 * Visit saimhafeez.com for more tutorials
 * Explanation of This Jepack Compose Template Given Below
 * https://saimhafeez.com/android-section/jetpack-compose/image-box-with-title-and-author-box-jetpack-compose-ui/
 */

@Composable
fun Image_Card(
    /* Parameters */
    cover_painter: Painter,
    author_painter: Painter,
    title: String)
{

    Card(modifier = Modifier
            /* Card Style */
        .fillMaxWidth(0.5f)
        .height(250.dp)
        .padding(5.dp),
        elevation = 8.dp
    ) {
        Column(modifier = Modifier
            /* Card Will Contain One Column and Three Rows*/
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top) {

            /* Row #1 --> Cover Image */
            Row(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .drawWithContent {
                    drawContent()
                    val strokeWidth = Stroke.DefaultMiter
                    val y = size.height // - strokeWidth
                    drawLine(
                        brush = SolidColor(Color.Black),
                        strokeWidth = strokeWidth,
                        cap = StrokeCap.Square,
                        start = Offset.Zero.copy(y = y),
                        end = Offset(x = size.width, y = y)
                    )
                },
            horizontalArrangement = Arrangement.Start) {
                Image(painter = cover_painter, contentDescription = "Cover Image", contentScale = ContentScale.Crop)
            }

            /* Row #2 --> Author Image */
            Row(modifier = Modifier
                .fillMaxWidth(),
                //.offset(0.dp, (-32).dp),
                horizontalArrangement = Arrangement.Center) {
                Box(modifier = Modifier
                    .size(64.dp)
                    .offset(0.dp, (-32).dp)
                    .border(2.dp, Color.Black, shape = CircleShape)
                    .clip(CircleShape)){
                    Image(painter = author_painter, contentDescription = "Author Image", contentScale = ContentScale.Crop)
                }

            }

            /* Row #3 --> Title/Heading/Description */
            Row(
                modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start)
            {
                Box(modifier = Modifier
                    .offset(0.dp, (-25).dp)
                    .padding(10.dp, 0.dp, 10.dp, 0.dp)
                    .verticalScroll(rememberScrollState())
                ){
                    Text(text = title,
                        style = TextStyle(Color.Black, fontSize = 12.sp)
                    )
                }
            }

        }
    }
}
