class AbcdeAlphabet : Alphabet {

    override fun indexOf(symbol: Char): Int {
        //    if (symbol == 'a') return 0;
        //    if (symbol == 'b') return 1;
        //    if (symbol == 'c') return 2;
        //    if (symbol == 'd') return 3;
        //    if (symbol == 'e') return 4;
        //    throw new IllegalArgumentException();
        if (symbol < 'a' || 'e' < symbol) throw IllegalArgumentException()
        return symbol - 'a'
    }

    override fun symbolOf(index: Int): Char {
        if (index < 0 || 4 < index) throw IllegalArgumentException()
        return ('a'.toInt() + index).toChar()
    }

    override fun size(): Int {
        return 5
    }

}