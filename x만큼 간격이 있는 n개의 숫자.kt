class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = longArrayOf()
        (1..n).forEach{
            answer+=(x.toLong()*it.toLong())
        }
        return answer
    }
}

fun main(){
}
