package domain.block

data class Nothing(private val surroundingMineCount: Int = 0) : Block() {

    init {
        require(surroundingMineCount in 0..8) { "주변 지뢰의 개수는 0~8 사이의 값이어야 합니다. surroundingMineCount: $surroundingMineCount" }
    }

    override fun isMine() = false

    override fun surroundingMineCount() = surroundingMineCount
}