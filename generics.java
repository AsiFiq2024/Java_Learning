public class generics {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        Product<String, Double> product = new Product<>("Book",69.99);

        box.setItem(5);
        System.out.println(box.getItem());

        System.out.println(product.getItem());
        System.out.println(product.getPrice());
    }
}
