
public class Cart {
	private DigitalVideoDisc[] items = new DigitalVideoDisc[20];
	private int qtyOrdered = 0;
public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    if (qtyOrdered < 20) {
        items[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added.");
    } else {
        System.out.println("The cart is almost full.");
    }
}
public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    for (int i = 0; i < qtyOrdered; i++) {
        if (items[i] == disc) {
            for (int j = i; j < qtyOrdered - 1; j++) {
                items[j] = items[j + 1];
            }
            items[qtyOrdered - 1] = null;
            qtyOrdered--;
            System.out.println("The disc has been removed.");
            return;
        }
    }
    System.out.println("The disc was not found in the cart.");
}
public float totalCost() {
    float total = 0;
    for (int i = 0; i < qtyOrdered; i++) {
        total += items[i].getCost();
    }
    return total;
}
}

