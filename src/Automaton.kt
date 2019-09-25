interface Automaton {
    val alphabet: Alphabet
    val states: List<State>
    val initialState: State
    // Dependent of impl.
    // Set<State> getFinalStates();
    fun nextState(state: State, symbol: Char): State
}