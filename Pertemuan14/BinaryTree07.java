package Pertemuan14;

public class BinaryTree07 {
    Node07 root;
    
    public BinaryTree07() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa07 mahasiswa) {
        Node07 newNode = new Node07(mahasiswa);
        if (isEmpty()){
            root = newNode;
        }else{
            Node07 current = root;
            Node07 parent = null;
            while(true){
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node07 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if(ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node07 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node07 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node07 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node07 getSuccessor(Node07 del){
        Node07 successor = del.right;
        Node07 successorParent = del;
        while (successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()){
            System.out.println("Binary tree kosong");
            return;
        }
        //cari node (current) yang akan dihapus
        Node07 parent = root;
        Node07 current = root;
        boolean isLeftChild = false;
        while (current != null){
            if(current.mahasiswa.ipk == ipk){
                break;
            }else if (ipk < current.mahasiswa.ipk){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if(ipk > current.mahasiswa.ipk){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        //penghapusan
        if (current == null){
            System.out.println("Data tidak ditemukan");
            return;
        }else{
            //jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null){
                if (current == root){
                    root = null;
                }else{
                    if (isLeftChild) {
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if(current.left == null){//jika hanya punya 1 anak (kanan)
                if (current == root){
                    root = current.right;
                }else{
                    if (isLeftChild) {
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else if(current.right == null){//jika hanya punya 1 anak (kiri)
                if (current == root){
                    root = current.left;
                }else{
                    if (isLeftChild) {
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{//jika punya 2 anak
                Node07 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root){
                    root = successor;
                }else{
                    if (isLeftChild) {
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
    public void addRekursif(Mahasiswa07 mahasiswa) {
        if (isEmpty()) {
            root = new Node07(mahasiswa);
        } else {
            root = addRekursifHelper(root, mahasiswa);
        }
    }
    Node07 addRekursifHelper(Node07 current, Mahasiswa07 mahasiswa) {
        if (current == null) {
            return new Node07(mahasiswa);
        }
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursifHelper(current.left, mahasiswa);
        } 
        else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = addRekursifHelper(current.right, mahasiswa);
        }
        return current;
    }
    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node07 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("Mahasiswa dengan IPK Paling Kecil:");
        current.mahasiswa.tampilInformasi();
    }
    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node07 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Mahasiswa dengan IPK Paling Besar:");
        current.mahasiswa.tampilInformasi();
    }
    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dengan IPK di atas " + ipkBatas + ":");
        tampilIPKdiAtasHelper(root, ipkBatas);
    }
    private void tampilIPKdiAtasHelper(Node07 current, double ipkBatas) {
        if (current != null) {
            tampilIPKdiAtasHelper(current.left, ipkBatas);
            if (current.mahasiswa.ipk > ipkBatas) {
                current.mahasiswa.tampilInformasi();
            }
            tampilIPKdiAtasHelper(current.right, ipkBatas);
        }
    }
}