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
            newNode.next = head; //aponta o novo Nó para o head
            head.prev = newNode; //aponta o head para o novo Nó
            head = newNode; //transforma o novo Nó no novo head
        }
        size++;
    }
    public void insertInTheTail(String data){
        Node newNode = new Node(data);

        if (isNull()){
            head = newNode;
            tail = newNode;
        }else{
            newNode.prev = tail; //aponta o novo Nó para a tail
            tail.next = newNode; //aponta a tail para o novo Nó
            tail = newNode; //transforma o novo Nó na nova tail
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
        //percore toda a lista partindo do head
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("------------------");


    }

    public void printJustIfHaveMoreThanFiveLetter(){
        Node temp = head;
        System.out.println("meses com mais de 5 letras");
        //percore toda a lista partindo do head
        while (temp != null){
            //verifica se o tamanho do mes tem mais de 5 caracteres
            if (temp.data.length() > 5){
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }


}
