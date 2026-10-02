void main() {
    Scanner input = new Scanner(System.in);

    MyDoublyLinkedList list = new MyDoublyLinkedList();


    list.addFirst(new Zvire("petr", "ptak", 3));
    list.addFirst(new Zvire("josef", "savec", 4));
    list.addFirst(new Zvire("jarda", "ryba", 5));
    list.addFirst(new Zvire("marek", "ptak", 6));
    list.addFirst(new Zvire("premek", "plaz", 7));

    list.vypisZvirata();
    System.out.println("");
    boolean menu = true;
    while (menu) {
        System.out.println("-------- MENU --------");
        System.out.println("1. Odstranění prvního zvířete");
        System.out.println("2. Výpis všech živočichů starších 5 let");
        System.out.println("3. Výpis nejstaršího živočicha");
        System.out.println("4. Konec");
        System.out.println("");
        System.out.print("Výběr:  ");
        int vyber = input.nextInt();

        if (vyber > 4 || vyber < 0) {
            System.out.println("Špatný výběr!!");
        } else {

            if (vyber == 1) {
                list.deleteFirst();
                list.vypisZvirata();
            } else if (vyber == 2) {
                list.olderThenFive();
            } else if (vyber == 3) {
                list.oldest();
            } else if (vyber == 4) {
                menu = false;
            }
        }
    }



}
