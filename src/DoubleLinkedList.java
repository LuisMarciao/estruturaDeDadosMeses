public class DoubleLinkedList {
    Node head;
    Node tail;
    int size;

    public DoubleLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isNull(){
        return head == null;
    }

    public void insertInTheHead(String data){
        Node newNode = new Node(data);

        if (isNull()){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void insertInTheTail(String data){
        Node newNode = new Node(data);

        if (isNull()){
            head = newNode;
            tail = newNode;
        }else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void printAtHead(){
        if (isNull()){
            System.out.println("Lista vazia");
            return;
        }

        Node temp = head;
        System.out.println("---------------------");
        System.out.println("Lista encadeada");
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("------------------");


    }

    public void printJustIfHaveMoreThanFiveLetter(){
        Node temp = head;
        System.out.println("meses com mais de 5 letras");
        while (temp != null){
            if (temp.data.length() > 5){
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }


}
