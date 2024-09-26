class Solution2 {
    fun solution(phone_number: String): String {
        var answer = StringBuilder(phone_number)
        (0..answer.length-5).forEach{
            answer[it]='*'
        }
        return answer.toString()
    }
}

fun main(){
}