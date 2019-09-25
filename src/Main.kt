
fun main(args: Array<String>) {
    val automaton = AbcdeAutomaton()
    val word = "abcdcd"
    var state: State? = automaton.initialState
    println("state" + state!!.index)

    for (symbol in word.toCharArray()) {
        if (state == null) println("$word does not match")
        state = automaton.nextState(state!!, symbol)
        println("State" + state.index)
    }
    if (state == null)
        println("$word does not match")
    else if (state.isFinal)
        println("You had a match")
    else
        println("Partially match")
}