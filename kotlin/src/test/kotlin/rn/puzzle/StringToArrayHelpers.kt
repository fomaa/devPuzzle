package rn.puzzle

import java.lang.StringBuilder

object StringToArrayHelpers {
    fun stringToArray(line: String): Array<Int> {
        return stringToIntArray(line)
    }

    fun stringToIntArray(line: String): Array<Int> {
        val cleaned = line.replace("(  +)".toRegex(), " ").trim()
        return cleaned.split(" ").map { it.toInt() }.toTypedArray()
    }

    fun stringToLongArray(line: String): Array<Long> {
        val cleaned = line.replace("(  +)".toRegex(), " ").trim()
        return cleaned.split(" ").map { it.toLong() }.toTypedArray()
    }

    fun stringTo2dArray(line: String): Array<Array<Int>> {
        val cleaned = line.replace("(  +)".toRegex(), " ").trim()
        val stringPairs = cleaned.split(",")
        return stringPairs
                .map { it
                        .split(" ")
                        .map { s -> s.toInt() }
                        .toTypedArray()
                }
                .toTypedArray()
    }

    fun arrayToString(a: Array<Array<Int>>): String {
        val builder = StringBuilder()
        for (row in a) {
            val s = row.joinToString(" ")
            builder.append(s).append(",")
        }
        return builder.toString().dropLast(1)
    }
}