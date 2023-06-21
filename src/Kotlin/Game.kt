package Kotlin

fun main(args:Array<String>) {
    val name ="Madrigal"
    var healthPoints=1
    val isBlessed=true
    val isImmortal=true
    val race ="orc"

    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)


    val healthStatus = formatHealthStatus(healthPoints, isBlessed)


    val faction=when (race){
        "drawf" ->"Keepers of the Mine"
        "orc"->"獸人永不為奴"
        "human"->"聯盟狗"
        "gnome"->"Keepers of the Mine"

        else -> {
            "自由人"

        }
    }

    val karma =(Math.pow(Math.random(),(110-healthPoints)/100.0)*20).toInt()

    val isKarma =when(karma)
    {
        in 16..20 -> "紅色光環"
        in 11..15-> "紫色光環"
        in 6..10 ->"橘黃色光環"
        in 1..5 -> "藍色光環"
        else ->"綠色光環"
    }




    printPlayerStatus(faction, name, healthStatus, auraColor, isBlessed, isKarma)
}


private fun printPlayerStatus(faction: String, name: String, healthStatus: String, auraColor: String, isBlessed: Boolean, isKarma: String) {
    println("$faction $name $healthStatus ")
    println("光環:$auraColor" + "(祝福:${if (isBlessed) "受祝福中" else "欠罵"})" + "隨機光環:$isKarma")
    castFireball()
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String {
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "開啟自愈光環" else ""
    return auraColor
}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String {
    val healthStatus = when (healthPoints) {
        100 -> "水喔 衝鋒"
        in 90..99 -> "不痛拉 好癢"
        in 75..89 -> if (isBlessed) {
            "用點力 沒吃飯啊(自愈中)"
        } else {
            "有點痛 你不錯"
        }

        in 15..74 -> "醫護兵!!!"
        else -> "慘了 我真的快升天"
    }
    return healthStatus
}

private fun castFireball(numFireballs:Int=2){
    println("向你施展"+ numFireballs +"顆4費打6點傷害的火球")
}



