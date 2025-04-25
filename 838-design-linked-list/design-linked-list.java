class MyLinkedList {
    node head;
    int length;
    public class node{
        int val;
        node next;
        node(int val){
            this.val=val;
        }
    }
    public MyLinkedList() {
        head=null;
        length=0;
    }
    
    public int get(int index) {
        if(index>=length){
            return -1;
        }
        node temp=head;
        int c=0;
        while(c<index){
            temp=temp.next;
            c++;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        node nn=new node(val);
        nn.next=head;
        head=nn;
        length++;
    }
    
    public void addAtTail(int val) {
        if(head==null){
            addAtHead(val);
        }
        else{
        node nn=new node(val);
        node temp=head;
        int c=0;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=nn;
        length++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index>length){ return;}
        if(index==0){
            addAtHead(val);
        }
        else{
            int c=1;
            node nn=new node(val);
            node temp=head;
            while(c<index){
                temp=temp.next;
                c++;
            }
            node next=temp.next;
            temp.next=nn;
            nn.next=next;
            length++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index>=length){
            return;
        }
        if(index==0){
            head=head.next;
            length--;
        }
        
        else{
            int c=1;
            node temp=head;
            while(c<index){
                temp=temp.next;
                c++;
            }
            temp.next=temp.next.next;
            length--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */