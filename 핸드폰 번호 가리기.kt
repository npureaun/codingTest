class Solution {
    fun solution(phone_number: String): String {
        var answer = StringBuilder(phone_number)
        (0 until answer.length-4).forEach{
            answer[it]='*'
        }
        return answer.toString()
    }
}

fun main(){
}
