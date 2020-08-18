package view

object InputView {
    private const val INPUT_WIDTH = "너비를 입력하세요."
    private const val INPUT_HEIGHT = "높이를 입력하세요."
    private const val INPUT_MINE_COUNT = "지뢰는 몇 개인가요?"
    private const val ERR_INVALID_NUMBER = "0 이상의 정수를 입력해주세요."
    private const val ERR_INVALID_MINE_COUNT = "지뢰의 개수는 0보다 크고 보드의 크기보다 작은 정수여야 합니다."

    fun readWidth() = readNumber(INPUT_WIDTH, ERR_INVALID_NUMBER)

    fun readHeight() = readNumber(INPUT_HEIGHT, ERR_INVALID_NUMBER)

    fun readMineCount(isValid: (value: Int) -> Boolean) = readNumber(INPUT_MINE_COUNT, ERR_INVALID_MINE_COUNT, isValid)

    private fun readNumber(
        title: String,
        error: String,
        isValid: (value: Int) -> Boolean = { true }
    ): Int {
        println(title)
        var result = readLine()?.toIntOrNull()

        while (result == null || result < 0 || !isValid(result)) {
            println(error)
            result = readLine()?.toIntOrNull()
        }
        return result.toInt()
    }
}