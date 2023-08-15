public class Main{
    public static void main(String[] args) {
        GenericComparable comparable = new GenericComparable();
        System.out.println(comparable.getMaximum(9.8, 4.8));

        GenericComparator<Double> comparator = new GenericComparator<Double>();
        System.out.println(comparator.compare(9.8, 4.8));
    } 
}
