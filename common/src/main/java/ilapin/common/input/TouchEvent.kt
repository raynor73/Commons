package ilapin.common.input

class TouchEvent(
    val id: Int,
    val action: Action,
    val x: Int,
    val y: Int
) {
    enum class Action {
        DOWN, UP, CANCEL, MOVE
    }
}