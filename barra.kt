fun main() {
    val totalProgress = 100
    val progressBarLength = 50

    for (i in 0..totalProgress) {
        val progress = (i * progressBarLength) / totalProgress
        print("\r[${"#".repeat(progress)}${" ".repeat(progressBarLength - progress)}] $i%")
        Thread.sleep(50)
    }
    println("\nConcluído!")
}
