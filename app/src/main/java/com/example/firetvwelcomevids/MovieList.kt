package com.example.firetvwelcomevids

object MovieList {
    val MOVIE_CATEGORY = arrayOf(
            "H1",
            "",
            "",
            "",
            "",
            "")

    val list: List<Movie> by lazy {
        setupMovies()
    }
    private var count: Long = 0

    private fun setupMovies(): List<Movie> {
        val title = arrayOf(
                "Entrance Keypad",
                "Gas Grill",
                "Charcoal Grill",
                "Pool Opening",
                "Kitchen Stove")

            val description = "Here are some simple Instructions on HOW TO..."

//      THE BELOW IS THE ORIGINAL DESCRIPTION THAT IS APPLIED TO ALL VIDEOS
//        val description = "Instructions on how to use the KeyPad " +
//                "Donec tristique, orci sed semper lacinia, quam erat rhoncus massa, non congue tellus est " +
//                "quis tellus. Sed mollis orci venenatis quam scelerisque accumsan. Curabitur a massa sit " +
//                "amet mi accumsan mollis sed et magna. Vivamus sed aliquam risus. Nulla eget dolor in elit " +
//                "facilisis mattis. Ut aliquet luctus lacus. Phasellus nec commodo erat. Praesent tempus id " +
//                "lectus ac scelerisque. Maecenas pretium cursus lectus id volutpat."


        val studio = arrayOf(
                "Piru Studios",
                "Piru Studios",
                "Piru Studios",
                "Piru Studios",
                "Piru Studios")


        val videoUrl = arrayOf(
                "https://piruproperties.com/android/vids/quicksetTutorial.mp4",
                "https://piruproperties.com/android/vids/gasGrill.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose.mp4")

//        THE BELOW ARRARY IS JUST A BLANK TEMPLATE FOR FUTURE BACKGROUNDS, BENEATH THIS IS THE ORIGINAL CODE FOR DUMMY PICS
        val bgImageUrl = arrayOf("", "", "", "", "")

//        val bgImageUrl = arrayOf(
//                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/bg.jpg",
//                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/bg.jpg",
//                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/bg.jpg",
//                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/bg.jpg",
//                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/bg.jpg")


        val cardImageUrl = arrayOf(
                "https://piruproperties.com/android/images/quicksetDeadBolt.png",
                "https://piruproperties.com/android/images/gasGrill.png",
                "https://piruproperties.com/android/images/charcoalGrill.jpg",
                "https://piruproperties.com/android/images/poolCover.jpeg",
                "https://piruproperties.com/android/images/kitchenStove.jpeg")

        val list = title.indices.map {
            buildMovieInfo(
                    title[it],
                    description,
                    studio[it],
                    videoUrl[it],
                    cardImageUrl[it],
                    bgImageUrl[it])
        }

        return list
    }

    private fun buildMovieInfo(
            title: String,
            description: String,
            studio: String,
            videoUrl: String,
            cardImageUrl: String,
            backgroundImageUrl: String): Movie {
        val movie = Movie()
        movie.id = count++
        movie.title = title
        movie.description = description
        movie.studio = studio
        movie.cardImageUrl = cardImageUrl
        movie.backgroundImageUrl = backgroundImageUrl
        movie.videoUrl = videoUrl
        return movie
    }
}