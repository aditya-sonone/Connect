package com.example.connect.data


data class Chat(
    val id: Int,
    val name: String,
    val time: String,
    val date: String?,
    val lastMessage: String?,
    val imageUrl: String
)

data class Call(
    val id: Int,
    val name: String,
    val date: String,
    val imageUrl: String,
    val isMissCall: Boolean,
    val isIncoming: Boolean,
)

data class Message(
    val message: String,
    val isPeer: Boolean
)

object DummyData {
    val listChat = listOf(
        Chat(
            id = 0,
            name = "Aditya",
            time = "08:46",
            date = "17 june",
            lastMessage = "New social media app",
            imageUrl = "https://randomuser.me/api/portraits/men/7.jpg"
        ),
        Chat(
            id = 1,
            name = "Shriyash",
            time = "12:45",
            date = null,
            lastMessage = "next will be Vibe ui.",
            imageUrl = "https://randomuser.me/api/portraits/men/85.jpg"
        ),
        Chat(
            id = 2,
            name = "Sagar",
            time = "Yesterday",
            date = "17 june",
            lastMessage = "collage reopen soon",
            imageUrl = "https://randomuser.me/api/portraits/men/1.jpg"
        ),
        Chat(
            id = 3,
            name = "Deepak",
            time = "23:56",
            date = "17 june",
            lastMessage = "Awesome web series.",
            imageUrl = "https://randomuser.me/api/portraits/men/3.jpg"
        ),
        Chat(
            id = 4,
            name = "Darshan",
            time = "10/06/2021",
            date = "17 june",
            lastMessage = "Data visualisation course",
            imageUrl = "https://randomuser.me/api/portraits/women/67.jpg"
        ),
        Chat(
            id = 5,
            name = "+91 8567985723",
            time = "Yesterday",
            date = "17 june",
            lastMessage = "simply dummy text of the printing and typesettin",
            imageUrl = "https://randomuser.me/api/portraits/men/41.jpg"
        ),
        Chat(
            id = 6,
            name = "Dr. Strange",
            time = "07/05/2022",
            date = "17 june",
            lastMessage = "you miss the multiverse of madness premier.",
            imageUrl = "https://randomuser.me/api/portraits/women/31.jpg"
        ),
        Chat(
            id = 7,
            name = "Ironman",
            time = "08:46",
            date = "17 june",
            lastMessage = "Make a ui for Jarvis.",
            imageUrl = "https://cdns.klimg.com/bola.net/library/upload/21/2018/07/mo-salah-l_a7e5e57.jpg"
        ),
        Chat(
            id = 8,
            name = "+91 4631234447",
            time = "08:46",
            date = "17 june",
            lastMessage = "How are you ?",
            imageUrl = "https://randomuser.me/api/portraits/men/81.jpg"
        ),
    )

    val listCall = listOf(
        Call(
            id = 0,
            name = "Sagar",
            date = "7 july 08.46",
            imageUrl = "https://randomuser.me/api/portraits/men/1.jpg",
            isIncoming = true,
            isMissCall = false
        ),
        Call(
            id = 1,
            name = "Darshan",
            date = "6 july 07.00",
            imageUrl = "https://randomuser.me/api/portraits/men/2.jpg",
            isIncoming = true,
            isMissCall = true
        ),
        Call(
            id = 2,
            name = "+91 4631234447",
            date = "15 june 12.11",
            imageUrl = "https://randomuser.me/api/portraits/men/81.jpg",
            isIncoming = true,
            isMissCall = false
        ),
        Call(
            id = 3,
            name = "Harshad",
            date = "15 june 05.09",
            imageUrl = "https://randomuser.me/api/portraits/women/67.jpg",
            isIncoming = true,
            isMissCall = true
        ),
        Call(
            id = 4,
            name = "Coding club",
            date = "14 june 23.45",
            imageUrl = "https://randomuser.me/api/portraits/men/12.jpg",
            isIncoming = true,
            isMissCall = false
        ),
        Call(
            id = 6,
            name = "Ironman",
            date = "14 june 20.00",
            imageUrl = "https://randomuser.me/api/portraits/women/31.jpg",
            isIncoming = true,
            isMissCall = true
        ),
        Call(
            id = 7,
            name = "+91 856-7985-723",
            date = "14 june 14.30",
            imageUrl = "https://randomuser.me/api/portraits/men/41.jpg",
            isIncoming = true,
            isMissCall = false
        )
    )

    val listMessage = listOf(
        Message("Hi, how ya do'in?", false),
        Message("I'm fine, what about u?", true),
        Message("I'm fine too", false),
        Message("hay, I will be visiting Nagpur soon", true),
        Message("great", false),
        Message("we'll meet soon", true),
        Message("Yeah", false),
        Message("ok, bye", true),
        Message("bye", false)
    )
}