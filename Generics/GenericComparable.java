
class GenericComparable {

    public <T extends Comparable<T>> T getMaximum(T a, T b){
        T output = (a != null) ? a : b;
        if(a != null && b!= null){
            int c = a.compareTo(b);
            output = (c > 0) ? a:b;
        }
        return output;
    }
}