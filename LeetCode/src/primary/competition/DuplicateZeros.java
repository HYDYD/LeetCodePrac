package primary.competition;

/**
 * 给你一个长度固定的整数数组 arr，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。
 * 注意：请不要在超过该数组长度的位置写入元素。
 * 要求：请对输入的数组 就地 进行上述修改，不要从函数返回任何东西。
 * 示例 1：
 *
 * 输入：[1,0,2,3,0,4,5,0]
 * 输出：null
 * 解释：调用函数后，输入的数组将被修改为：[1,0,0,2,3,0,0,4]
 * 示例 2：
 *
 * 输入：[1,2,3]
 * 输出：null
 * 解释：调用函数后，输入的数组将被修改为：[1,2,3]
 *
 *
 * 提示：
 *
 * 1 <= arr.length <= 10000
 * 0 <= arr[i] <= 9
 */
public class DuplicateZeros {
    public class Node{
        Node next = null;
        int data;
        public Node(int data){
            this.data = data;
        }
    }
    public void duplicateZeros(int[] arr) {
        Node node = arrayToListNode(arr);

        int[] list = listNodeToArray(node);
        arr = list;
    }
    public Node arrayToListNode(int[] s) {
        Node root = new Node(s[0]);//生成链表的根节点，并将数组的第一个元素的值赋给链表的根节点
        Node other = root;//生成另一个节点，并让other指向root节点，other在此作为一个临时变量，相当于指针
        for (int i = 1; i < s.length; i++) {//由于已给root赋值，所以i从1开始
            Node temp = new Node(s[i]);//每循环一次生成一个新的节点,并给当前节点赋值
            other.next = temp;//将other的下一个节点指向生成的新的节点
            other = temp;//将other指向最后一个节点(other的下一个节点)  other=other.getNext();
        }
        return root;
    }

    public int[] listNodeToArray(Node l) {
        int size = listNodeSize(l);
        int[] ints = new int[size];
        int index = 0;
        while (l != null) {
            ints[index] = l.data;
            l = l.next;
            index++;
        }
        return ints;
    }

    public int listNodeSize(Node l) {
        int size = 0;
        while (l != null) {
            size++;
            l = l.next;
        }
        return size;
    }
}
