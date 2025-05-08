fun main() {
    // Create a map with student names and scores
    val studentScores = mapOf(
        "Faruk" to 80,
        "Muhammad" to 90,
        "Ismail" to 60,
        "Aisha" to 75,
        "Ahmad" to 95
    )

    // Print students who scored above 70
    for ((student, score) in studentScores) {
        if (score > 70) {
            println("$student scored $score")
        }
    }
}