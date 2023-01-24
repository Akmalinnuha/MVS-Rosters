package com.akmalinnuha.aplikasisubmisi

object RostersData {
    private val rosterNames = arrayOf("Arya Stark","Batman","Bugs Bunny","Finn","Garnet"
    ,"Harley Quinn","Jake The Dog","Reindog","Shaggy", "Steven Universe","Superman"
    ,"Taz","Tom and Jerry","Velma","Wonder Woman")

    private val rosterDescriptions = arrayOf("Born the third child of Eddard and Catelyn Stark, Arya never wanted to be a lady or waste time with formality. She thought that was a boring task better left to her siblings.",
    "The Caped Crusader and defender of Gotham City known only as Batman was born the night that a young Bruce Wayne saw his parents gunned down in front of him.",
    "One of pop culture’s most enduring icons, Bugs is a movie star, action hero, and sports legend with a career spanning over half a century.",
    "(Mostly) the last human from the Land of Ooo, Finn is a young warrior who has spent most of his life doing quests and helping the forces of good in their never-ending battle against anything and everything evil.",
    "Garnet is the leader of the Crystal Gems - A group of extraterrestrial rebels hiding out on Earth. Along with the other Gems (and Steven), Garnet has sworn to protect the Earth from any invaders.",
    "Harleen Quinzel was a psychiatrist at Arkham Asylum until the fateful day she met the psychotic villain The Joker… and everything changed forever.",
    "As far as Jake knew, he just happened to be born with his magical Stretchy Powers.",
    "The world of Zanifeer was one of the first to fall victim to the Nothing during the great dimensional cataclysm.",
    "The last thing Shaggy remembers before The Change was exploring another spooky old mansion with his pal Scoob, just like any other day with the gang.",
    "The only known hybrid of a human and a Gem, Steven was always destined to be special.",
    "Disaster struck Kal-El’s home world of Krypton when he was just a baby, leaving his parents with no choice but to send him to the stars.",
    "Like the offspring of a tornado and a particularly angry electric razor, the Tasmanian Devil is a spitting, surly ball of manic energy.",
    "Ever since they first laid eyes on each other, Tom and Jerry have had a complicated relationship.",
    "Velma has been solving mysteries since most people were still in diapers.",
    "One of reality’s mightiest heroes, “Wonder Woman” is a name both feared and loved across the Multiverse.")

    private val rostersImages = intArrayOf(R.drawable.arya_stark,
        R.drawable.batman,
        R.drawable.bugs_bunny,
        R.drawable.finn,
        R.drawable.garnet,
        R.drawable.harley_quinn,
        R.drawable.jake,
        R.drawable.reindog,
        R.drawable.shaggy,
        R.drawable.steven,
        R.drawable.superman,
        R.drawable.taz,
        R.drawable.tom_and_jerry,
        R.drawable.velma,
        R.drawable.wonder_woman)

    val listData: ArrayList<Roster>
        get() {
            val list = arrayListOf<Roster>()
            for (position in rosterNames.indices) {
                val roster = Roster()
                roster.name = rosterNames[position]
                roster.description = rosterDescriptions[position]
                roster.image = rostersImages[position]
                list.add(roster)
            }
            return list
        }
}