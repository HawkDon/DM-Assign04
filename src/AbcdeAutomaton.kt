
import java.util.ArrayList

class AbcdeAutomaton : Automaton {
    override val alphabet: Alphabet = AbcdeAlphabet()
    override val states = ArrayList<State>()
    private val table: Array<Array<State>>
    override val initialState: State = AbcdeState(0, false)

    init {
        states.add(AbcdeState(0, false))
        for (index in 1..3) {
            if (index == 3)
                states.add(AbcdeState(index, true))
            else
                states.add(AbcdeState(index, false))
        }

        table = Array(states.size) { arrayOfNulls<State>(alphabet.size()) as Array<State> }
        // Actual automaton:
        table[0][0] = states[1]

        table[1][1] = states[1]
        table[1][alphabet.indexOf('c')] = states[2]
        table[1][4] = states[3]

        table[2][3] = states[1]
    }

    override fun nextState(state: State, symbol: Char): State {
        return table[state.index][alphabet.indexOf(symbol)]
    }

}