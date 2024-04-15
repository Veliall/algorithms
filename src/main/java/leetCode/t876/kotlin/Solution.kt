package leetCode.t876.kotlin

class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var middle = head
        var end = head

        while (end?.next != null) {
            middle = middle?.next
            end = end.next?.next
        }
        return middle
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}