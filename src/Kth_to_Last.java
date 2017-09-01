/**
 * Created by jiayicheng on 17/7/19.
 */
public class Kth_to_Last {
    //返回链表里倒数第几个元素
    class Node{
        int data;
        Node next=null;

        public Node(int d)
        {
            data=d;
        }
        void appendToTail(int d)
        {
         Node end=new Node(d);
            Node n=this;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=end;
        }
    }
    public void main(String[] args)
    {

    }

    int Kth_Last(Node head,int k)
    {
       if(head==null)
       {                                                                    //首要条件，         递归方法         跳出条件
           return 0;            //首要条件，到头的条件           //递归方法解决，第一个index即为零，后面每递归一次加一，直到等于K
       }
       int index= Kth_Last(head.next,k)+1;   //递归方法，注意其实与K无关，递归到链表的尽头，然后往回溯 直到它等于K值！！！！
        if(index==k){
            System.out.println(k+head.data);
        }
        return index;
    }

    Node KthLast(Node head,int k)
    {
        Node p1=head;
        Node p2=head;

        for(int i=0;i<k;i++)
        {   if(p1==null) return null;  //两个指针移动，始终隔着K个元素，直到最后。
            p1=p1.next;
        }
        while(p1!=null)
        {
            p2=p2.next;
            p1=p1.next;
        }
        return p2;
    }
}
